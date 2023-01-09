/*******************************************************************************
 * Copyright (c) 2021-2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ******************************************************************************/
package org.eclipse.emfcloud.coffee.modelserver.commands.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfcloud.coffee.BasicfamilyPackage;
import org.eclipse.emfcloud.coffee.Family;
import org.eclipse.emfcloud.coffee.Man;
import org.eclipse.emfcloud.coffee.Woman;
import org.eclipse.emfcloud.coffee.modelserver.CoffeeResource;
import org.eclipse.emfcloud.modelserver.command.CCommand;
import org.eclipse.emfcloud.modelserver.edit.command.SetCommandContribution;
import org.eclipse.emfcloud.modelserver.edit.util.CommandUtil;

public final class SemanticCommandUtil {

   // Hide constructor for utility class
   private SemanticCommandUtil() {}

   // Expect a given EObject with an ID attribute
   public static String getSemanticElementId(final EObject element) {
      return EcoreUtil.getID(element);
   }

   public static String getCoffeeFileExtension() { return CoffeeResource.FILE_EXTENSION; }

   public static Family getModel(final URI modelUri, final EditingDomain domain) {
      Resource semanticResource = domain.getResourceSet()
         .getResource(modelUri.trimFileExtension().appendFileExtension(getCoffeeFileExtension()), false);
      EObject semanticRoot = semanticResource.getContents().get(0);
      if (!(semanticRoot instanceof Family)) {
         return null;
      }
      Family machine = (Family) semanticRoot;
      if (machine.getMembers().size() < 1) {
         return null;
      }
      // TODO We might want to hand in the index of the used workflow
      return machine;
   }

   // public static EObject getElement( final Workflow semanticModel, final String semanticElementId) {
   // return semanticModel.eResource().getEObject(semanticElementId);
   // }
   //
   // public static <C> C getElement(final Workflow semanticModel, final String semanticElementId,
   // final java.lang.Class<C> clazz) {
   // EObject element = getElement(semanticModel, semanticElementId);
   // return clazz.cast(element);
   // }

   public static CCommand createSetTaskNameCommand(final Man taskToRename, final String ownerRefUri,
      final String newName) {
      return SetCommandContribution.clientCommand(CommandUtil.createProxy(getEClass(taskToRename), ownerRefUri),
         BasicfamilyPackage.Literals.PERSON__NAME, newName);
   }

   // public static CCommand createSetTaskDurationCommand(final Node task, final String ownerRefUri,
   // final int newDuration) {
   // return SetCommandContribution.clientCommand(CommandUtil.createProxy(getEClass(task), ownerRefUri),
   // CoffeePackage.Literals.TASK__DURATION, newDuration);
   // }

   protected static EClass getEClass(final EObject element) {
      if (element instanceof Man) {
         return BasicfamilyPackage.Literals.MAN;
      } else if (element instanceof Woman) {
         return BasicfamilyPackage.Literals.WOMAN;
      }
      // else if (element instanceof Task) {
      // return CoffeePackage.Literals.TASK;
      // }
      return BasicfamilyPackage.Literals.PERSON;
   }
}

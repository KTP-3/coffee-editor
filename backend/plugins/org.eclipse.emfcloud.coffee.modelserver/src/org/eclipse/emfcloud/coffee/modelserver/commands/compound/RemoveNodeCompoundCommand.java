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
package org.eclipse.emfcloud.coffee.modelserver.commands.compound;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.EditingDomain;

public class RemoveNodeCompoundCommand extends CompoundCommand {

   public RemoveNodeCompoundCommand(final EditingDomain domain, final URI modelUri, final String semanticElementId) {
      // this.append(new RemoveNodeCommand(domain, modelUri, semanticElementId));
      // this.append(new RemoveNotationElementCommand(domain, modelUri, semanticElementId));
      //
      // Workflow workflow = SemanticCommandUtil.getModel(modelUri, domain);
      // Node nodeToRemove = SemanticCommandUtil.getElement(workflow, semanticElementId, Node.class);
      //
      // Collection<Setting> nodeUsages = UsageCrossReferencer.find(nodeToRemove, workflow.eResource());
      // for (Setting setting : nodeUsages) {
      // EObject eObject = setting.getEObject();
      // if (eObject instanceof Flow && eObject.eContainer() == workflow) {
      // String flowId = SemanticCommandUtil.getSemanticElementId(eObject);
      // this.append(new RemoveFlowCompoundCommand(domain, modelUri, flowId));
      // }
      // }
   }
}

/**
 * Copyright (c) 2021 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package org.eclipse.emfcloud.coffee;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Node</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emfcloud.coffee.CoffeePackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean hasCycle(DiagnosticChain chain, Map<?, ?> context);

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    *
    * @generated NOT
    */
   boolean hasCycleRec(Node goal, Node current, List<Node> visited, Workflow workflow);

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    *
    * @generated NOT
    */
   List<Flow> incomingFlows();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    *
    * @generated NOT
    */
   List<Flow> outgoingFlows();
} // Node

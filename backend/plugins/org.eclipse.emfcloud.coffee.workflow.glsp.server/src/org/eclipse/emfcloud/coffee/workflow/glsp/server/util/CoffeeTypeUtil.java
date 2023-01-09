/*******************************************************************************
 * Copyright (c) 2019-2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ******************************************************************************/
package org.eclipse.emfcloud.coffee.workflow.glsp.server.util;

public final class CoffeeTypeUtil {
   public static final String FORK_NODE = "activityNode:fork";
   public static final String JOIN_NODE = "activityNode:join";

   // public static String toType(final Node node) {
   // if (node instanceof Man) {
   // return WorkflowModelTypes.Man;
   // }
   // if (node instanceof Woman) {
   // return WorkflowModelTypes.Woman;
   // }
   // // if (node instanceof Decision) {
   // // return WorkflowModelTypes.DECISION_NODE;
   // // }
   // // if (node instanceof Merge) {
   // // return WorkflowModelTypes.MERGE_NODE;
   // // }
   // // if (node instanceof Fork) {
   // // return FORK_NODE;
   // // }
   // // if (node instanceof Join) {
   // // return JOIN_NODE;
   // // }
   // return "unknown";
   // }

   // public static String toNodeType(final Node node) {
   // if (node instanceof AutomaticTask) {
   // return "automated";
   // }
   // if (node instanceof ManualTask) {
   // return "manual";
   // }
   // if (node instanceof Decision) {
   // return "decisionNode";
   // }
   // if (node instanceof Merge) {
   // return "mergeNode";
   // }
   // if (node instanceof Fork) {
   // return "forkNode";
   // }
   // if (node instanceof Join) {
   // return "joinNode";
   // }
   // return "unknown";
   // }

   private CoffeeTypeUtil() {}
}

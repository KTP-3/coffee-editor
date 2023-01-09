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
package org.eclipse.emfcloud.coffee.workflow.glsp.server;

import org.eclipse.glsp.graph.DefaultTypes;

public final class WorkflowModelTypes {
   private WorkflowModelTypes() {}

   // public static final String TASK = DefaultTypes.NODE;
   public static final String Man = DefaultTypes.NODE;
   public static final String Woman = DefaultTypes.NODE_DIAMOND;
   public static final String Link = DefaultTypes.EDGE;

   public static String toNodeType(final String type) {
      switch (type) {
         case Man:
            return "man";
         case Woman:
            return "woman";
         default:
            break;
      }
      return "unknown";
   }
}

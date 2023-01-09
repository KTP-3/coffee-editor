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
package org.eclipse.emfcloud.coffee.workflow.glsp.server.handler.create;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import org.eclipse.emfcloud.modelserver.client.Response;
import org.eclipse.glsp.graph.GPoint;

public class CreateMergeNodeHandler extends AbstractCreateNodeHandler {

   public CreateMergeNodeHandler(final String type) {
      super(type);
      // TODO Auto-generated constructor stub
   }

   @Override
   protected Function<Optional<GPoint>, CompletableFuture<Response<String>>> getNodeCreator() { // TODO Auto-generated
                                                                                                // method stub
      return null;
   }

   // public CreateMergeNodeHandler() {
   // super(WorkflowModelTypes.MERGE_NODE);
   // }
   //
   // @Override
   // public String getLabel() { return "Merge Node"; }
   //
   // @Override
   // protected Function<Optional<GPoint>, CompletableFuture<Response<String>>> getNodeCreator() {
   // return modelAccess::addMergeNode;
   // }

}

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

import java.util.Arrays;
import java.util.List;

import org.eclipse.glsp.server.diagram.BaseDiagramConfiguration;
import org.eclipse.glsp.server.layout.ServerLayoutKind;
import org.eclipse.glsp.server.types.EdgeTypeHint;
import org.eclipse.glsp.server.types.ShapeTypeHint;

public class WorkflowDiagramConfiguration extends BaseDiagramConfiguration {

   @Override
   public String getDiagramType() { return "basicfamily-diagram-notation"; }

   // @Override
   // public Map<String, EClass> getTypeMappings() {
   // Map<String, EClass> mappings = DefaultTypes.getDefaultTypeMappings();
   // mappings.put(LABEL_HEADING, GraphPackage.Literals.GLABEL);
   // mappings.put(LABEL_TEXT, GraphPackage.Literals.GLABEL);
   // mappings.put(COMP_HEADER, GraphPackage.Literals.GCOMPARTMENT);
   // mappings.put(LABEL_ICON, GraphPackage.Literals.GLABEL);
   // mappings.put(WEIGHTED_EDGE, GraphPackage.Literals.GEDGE);
   // mappings.put(ICON, WfgraphPackage.Literals.ICON);
   // mappings.put(MERGE_NODE, WfgraphPackage.Literals.ACTIVITY_NODE);
   // mappings.put(DECISION_NODE, WfgraphPackage.Literals.ACTIVITY_NODE);
   // mappings.put(MANUAL_TASK, WfgraphPackage.Literals.TASK_NODE);
   // mappings.put(AUTOMATED_TASK, WfgraphPackage.Literals.TASK_NODE);
   // return mappings;
   // }

   // @Override
   // public List<ShapeTypeHint> getShapeTypeHints() {
   // List<ShapeTypeHint> nodeHints = new ArrayList<>();
   // nodeHints.add(new ShapeTypeHint(MANUAL_TASK, true, true, false, false));
   // nodeHints.add(new ShapeTypeHint(AUTOMATED_TASK, true, true, false, false));
   // nodeHints.add(createDefaultShapeTypeHint(DECISION_NODE));
   // nodeHints.add(createDefaultShapeTypeHint(MERGE_NODE));
   // return nodeHints;
   // }

   @Override
   public List<ShapeTypeHint> getShapeTypeHints() {
      // tasks can be moved, deleted and resized
      return List.of(new ShapeTypeHint(WorkflowModelTypes.Man, true, true, true, false),
         new ShapeTypeHint(WorkflowModelTypes.Woman, true, true, true, false));
   }

   @Override
   public List<EdgeTypeHint> getEdgeTypeHints() {
      return List.of(new EdgeTypeHint(WorkflowModelTypes.Link, true, true, true,
         Arrays.asList(WorkflowModelTypes.Man, WorkflowModelTypes.Woman),
         Arrays.asList(WorkflowModelTypes.Man, WorkflowModelTypes.Woman)));
   }

   // @Override
   // public List<EdgeTypeHint> getEdgeTypeHints() {
   // List<EdgeTypeHint> edgeHints = new ArrayList<>();
   // edgeHints.add(createDefaultEdgeTypeHint(EDGE));
   // EdgeTypeHint weightedEdgeHint = super.createDefaultEdgeTypeHint(WEIGHTED_EDGE);
   // weightedEdgeHint.setSourceElementTypeIds(Arrays.asList(DECISION_NODE));
   // weightedEdgeHint.setTargetElementTypeIds(Arrays.asList(MANUAL_TASK, AUTOMATED_TASK));
   // edgeHints.add(weightedEdgeHint);
   // return edgeHints;
   // }

   // @Override
   // public EdgeTypeHint createDefaultEdgeTypeHint(final String elementId) {
   // EdgeTypeHint hint = super.createDefaultEdgeTypeHint(elementId);
   // hint.setSourceElementTypeIds(Arrays.asList(MANUAL_TASK, AUTOMATED_TASK, DECISION_NODE, MERGE_NODE));
   // hint.setTargetElementTypeIds(Arrays.asList(MANUAL_TASK, AUTOMATED_TASK, DECISION_NODE, MERGE_NODE));
   // return hint;
   // }

   @Override
   public ServerLayoutKind getLayoutKind() { return ServerLayoutKind.MANUAL; }
}

/*******************************************************************************
 * Copyright (c) 2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ******************************************************************************/
package org.eclipse.emfcloud.coffee.workflow.glsp.server.gmodel;

import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.WorkflowModelTypes;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.Family;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.Man;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.Person;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.Woman;
import org.eclipse.emfcloud.modelserver.glsp.notation.integration.EMSNotationGModelFactory;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.AbstractGNodeBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.graph.util.GraphUtil;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.Shape;

public class WorkflowGModelFactory extends EMSNotationGModelFactory {

   protected GNode createTaskNode(final Person task) {
      GNodeBuilder taskNodeBuilder = null;
      if (task instanceof Man) {
         Man man = (Man) task;
         taskNodeBuilder = new GNodeBuilder(WorkflowModelTypes.Man)
            .id(idGenerator.getOrCreateId(man))
            .addCssClass("tasklist-node")
            .add(new GLabelBuilder(DefaultTypes.LABEL).text(man.getName()).id(man.getId() + "_label").build())
            .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

         applyShapeData(man, taskNodeBuilder);
      } else {
         Woman woman = (Woman) task;
         taskNodeBuilder = new GNodeBuilder(WorkflowModelTypes.Woman)
            .id(idGenerator.getOrCreateId(woman))
            .addCssClass("tasklist-node")
            .add(new GLabelBuilder(DefaultTypes.LABEL).text(woman.getName()).id(woman.getId() + "_label").build())
            .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

         applyShapeData(woman, taskNodeBuilder);
      }
      return taskNodeBuilder.build();
   }
   // @Inject
   // protected WorkflowHighlightStore highlightStore;

   // private String getChangeCssClass(final EObject object) {
   // return highlightStore.getHighlights().get(EcoreUtil.getURI(object).toString().substring(1));
   // }

   @Override
   protected void fillRootElement(final EObject semanticModel, final Diagram notationModel, final GModelRoot newRoot) {

      Family taskList = Family.class.cast(semanticModel);
      GGraph graph = GGraph.class.cast(newRoot);
      if (notationModel.getSemanticElement() != null
         && notationModel.getSemanticElement().getResolvedSemanticElement() != null) {
         taskList.getMembers().stream()
            .map(this::createTaskNode)
            .forEachOrdered(graph.getChildren()::add);
      }
   }

   // protected GNode createNode(final Node node) {
   // if (node instanceof Task) {
   // return this.createTaskNode(Task.class.cast(node));
   // }
   // return this.createActivityNode(node);
   // }
   //
   // protected TaskNode createTaskNode(final Task task) {
   // String type = CoffeeTypeUtil.toType(task);
   // String nodeType = CoffeeTypeUtil.toNodeType(task);
   // TaskNodeBuilder builder = new TaskNodeBuilder(type, task.getName(), nodeType, task.getDuration());
   // builder.id(idGenerator.getOrCreateId(task));
   //
   // builder.addArguments(GArguments.cornerRadius(5));
   //
   // String change = getChangeCssClass(task);
   // if (change != null) {
   // builder.addCssClass(change);
   // }
   //
   // applyShapeData(task, builder);
   // return builder.build();
   // }
   //
   // protected ActivityNode createActivityNode(final Node node) {
   // String type = CoffeeTypeUtil.toType(node);
   // String nodeType = CoffeeTypeUtil.toNodeType(node);
   // ActivityNodeBuilder builder = new ActivityNodeBuilder(type, nodeType);
   // builder.id(idGenerator.getOrCreateId(node));
   //
   // String change = getChangeCssClass(node);
   // if (change != null) {
   // builder.addCssClass(change);
   // }
   //
   // applyShapeData(node, builder);
   // return builder.build();
   // }
   //
   // protected GEdge createEdge(final Flow element) {
   // if (element instanceof WeightedFlow) {
   // return createWeightedFlowEdge((WeightedFlow) element);
   // }
   // return createFlowEdge(element);
   // }
   //
   // protected GEdge createFlowEdge(final Flow flow) {
   // GEdgeBuilder builder = new GEdgeBuilder()
   // .id(idGenerator.getOrCreateId(flow))
   // .sourceId(idGenerator.getOrCreateId(flow.getSource()))
   // .targetId(idGenerator.getOrCreateId(flow.getTarget()))
   // .routerKind(GConstants.RouterKind.POLYLINE);
   //
   // String change = getChangeCssClass(flow);
   // if (change != null) {
   // builder.addCssClass(change);
   // }
   //
   // applyEdgeData(flow, builder);
   // return builder.build();
   // }
   //
   // protected WeightedEdge createWeightedFlowEdge(final WeightedFlow flow) {
   // WeightedEdgeBuilder builder = new WeightedEdgeBuilder()
   // .id(idGenerator.getOrCreateId(flow))
   // .probability(flow.getProbability().getName())
   // .sourceId(idGenerator.getOrCreateId(flow.getSource()))
   // .targetId(idGenerator.getOrCreateId(flow.getTarget()))
   // .routerKind(GConstants.RouterKind.POLYLINE);
   //
   // String change = getChangeCssClass(flow);
   // if (change != null) {
   // builder.addCssClass(change);
   // }
   //
   // applyEdgeData(flow, builder);
   // return builder.build();
   // }

   @SuppressWarnings({ "rawtypes", "unchecked" })
   protected AbstractGNodeBuilder applyShapeData(final EObject shapeElement, final AbstractGNodeBuilder builder) {
      modelState.getIndex().getNotation(shapeElement, Shape.class)
         .ifPresent(shape -> {
            Optional.ofNullable(shape.getPosition()).map(GraphUtil::copy).ifPresent(builder::position);
            Optional.ofNullable(shape.getSize()).map(GraphUtil::copy).ifPresent(newSize -> {
               builder.size(newSize);
               builder.addLayoutOptions(Map.of(
                  GLayoutOptions.KEY_PREF_WIDTH, newSize.getWidth(),
                  GLayoutOptions.KEY_PREF_HEIGHT, newSize.getHeight()));
            });
         });
      return builder;
   }

   // @SuppressWarnings("rawtypes")
   // protected AbstractGEdgeBuilder applyEdgeData(final EObject edgeElement, final AbstractGEdgeBuilder builder) {
   // modelState.getIndex().getNotation(edgeElement, Edge.class)
   // .ifPresent(edge -> {
   // if (edge.getBendPoints() != null) {
   // edge.getBendPoints().stream().map(GraphUtil::copy).forEachOrdered(builder::addRoutingPoint);
   // }
   // });
   // return builder;
   // }

}

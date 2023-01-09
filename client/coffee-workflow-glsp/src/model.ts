/*
 * Copyright (c) 2020-2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 */
import {
    boundsFeature,
    connectableFeature,
    deletableFeature,
    EditableLabel,
    fadeFeature,
    hoverFeedbackFeature,
    isEditableLabel,
    layoutContainerFeature,
    moveFeature,
    Nameable,
    nameFeature,
    popupFeature,
    RectangularNode,
    SChildElement,
    selectFeature,
    SModelElement,
    WithEditableLabel,
    withEditLabelFeature
} from '@eclipse-glsp/client';

export class ManNode extends RectangularNode implements Nameable, WithEditableLabel {
    static override readonly DEFAULT_FEATURES = [
        connectableFeature,
        deletableFeature,
        selectFeature,
        boundsFeature,
        moveFeature,
        layoutContainerFeature,
        fadeFeature,
        hoverFeedbackFeature,
        popupFeature,
        nameFeature,
        withEditLabelFeature
    ];

    get editableLabel(): (SChildElement & EditableLabel) | undefined {
        const label = this.children.find(element => element.type === 'label:heading');
        if (label && isEditableLabel(label)) {
            return label;
        }
        return undefined;
    }

    get name(): string {
        const labelText = this.editableLabel?.text;
        return labelText ? labelText : '<unknown>';
    }
}

export function isManNode(element: SModelElement): element is ManNode {
    return element instanceof ManNode || false;
}

export class WomanNode extends RectangularNode implements Nameable, WithEditableLabel {
    static override readonly DEFAULT_FEATURES = [
        connectableFeature,
        deletableFeature,
        selectFeature,
        boundsFeature,
        moveFeature,
        layoutContainerFeature,
        fadeFeature,
        hoverFeedbackFeature,
        popupFeature,
        nameFeature,
        withEditLabelFeature
    ];

    get editableLabel(): (SChildElement & EditableLabel) | undefined {
        const label = this.children.find(element => element.type === 'label:heading');
        if (label && isEditableLabel(label)) {
            return label;
        }
        return undefined;
    }

    get name(): string {
        const labelText = this.editableLabel?.text;
        return labelText ? labelText : '<unknown>';
    }
}

export function isWomanNode(element: SModelElement): element is WomanNode {
    return element instanceof WomanNode || false;
}

// export class WeightedEdge extends SEdge {
//     probability?: string;
// }

// export class ActivityNode extends DiamondNode {
//     nodeType: string = ActivityNode.Type.UNDEFINED;
//     override size = {
//         width: 32,
//         height: 32
//     };
//     override strokeWidth = 1;
// }

// export namespace ActivityNode {
//     export namespace Type {
//         export const INITIAL = 'initalNode';
//         export const FINAL = 'finalNode';
//         export const DECISION = 'decisionNode';
//         export const MERGE = 'mergeNode';
//         export const JOIN = 'joinNode';
//         export const FORK = 'forkNode';
//         export const UNDEFINED = 'undefined';
//     }
// }

// export class Icon extends SShapeElement implements LayoutContainer {
//     static readonly DEFAULT_FEATURES = [boundsFeature, layoutContainerFeature, layoutableChildFeature, fadeFeature];

//     layout: string;
//     override layoutOptions?: { [key: string]: string | number | boolean };
//     override size = {
//         width: 32,
//         height: 32
//     };
// }

// export class CategoryNode extends RectangularNode implements Nameable, WithEditableLabel {
//     static override readonly DEFAULT_FEATURES = [
//         deletableFeature,
//         selectFeature,
//         boundsFeature,
//         moveFeature,
//         layoutContainerFeature,
//         fadeFeature,
//         hoverFeedbackFeature,
//         popupFeature,
//         nameFeature,
//         withEditLabelFeature
//     ];

//     name = '';

//     get editableLabel(): (SChildElement & EditableLabel) | undefined {
//         const label = this.children.find(element => element.type === 'label:heading');
//         if (label && isEditableLabel(label)) {
//             return label;
//         }
//         return undefined;
//     }
// }

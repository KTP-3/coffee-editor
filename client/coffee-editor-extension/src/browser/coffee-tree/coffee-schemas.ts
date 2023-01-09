/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
/* eslint-disable header/header */

export const manView = {
    type: 'VerticalLayout',
    elements: [
        {
            type: 'Label',
            text: 'Man'
        },
        {
            type: 'Control',
            label: 'Name',
            scope: '#/properties/name'
        },
        {
            type: 'Control',
            label: 'Father',
            scope: '#/properties/father'
        },
        {
            type: 'Control',
            label: 'Mother',
            scope: '#/properties/mother'
        }
    ]
};

export const womanView = {
    type: 'VerticalLayout',
    elements: [
        {
            type: 'Label',
            text: 'Woman'
        },
        {
            type: 'Control',
            label: 'Name',
            scope: '#/properties/name'
        },
        {
            type: 'Control',
            label: 'Father',
            scope: '#/properties/father'
        },
        {
            type: 'Control',
            label: 'Mother',
            scope: '#/properties/mother'
        }
    ]
};

export const personView = {
    type: 'VerticalLayout',
    elements: [
        {
            type: 'Control',
            label: 'Name',
            scope: '#/properties/name'
        }
    ]
};

export const familyView = {
    type: 'VerticalLayout',
    elements: [
        {
            type: 'Control',
            label: 'Name',
            scope: '#/properties/name'
        }
    ]
};

export const treeView = {
    type: 'VerticalLayout',
    elements: [
        {
            type: 'Control',
            label: 'Name',
            scope: '#/properties/name'
        }
    ]
};

export const nodeView = {
    type: 'HorizontalLayout',
    elements: [
        {
            type: 'Control',
            label: 'Name',
            scope: '#/properties/name'
        },
        {
            type: 'Control',
            label: 'Weight',
            scope: '#/properties/weight'
        }
    ]
};

export const exampleSchema = {
    definitions: {
        family: {
            title: 'Family',
            $id: '#family',
            type: 'object',
            properties: {
                typeId: {
                    const: 'http://www.eclipse.org/sirius/sample/basicfamily#//Family'
                },
                id: {
                    type: 'string'
                },
                name: {
                    type: 'string',
                    minLength: 3,
                    maxLength: 20
                },
                members: {
                    type: 'array',
                    items: {
                        $ref: '#/definitions/man'
                    }
                }
            },
            required: ['name'],
            additionalProperties: false
        },
        man: {
            title: 'Man',
            $id: '#man',
            type: 'object',
            properties: {
                typeId: {
                    const: 'http://www.eclipse.org/sirius/sample/basicfamily#//Man'
                },
                name: {
                    type: 'string'
                },
                id: {
                    type: 'string'
                },
                mother: {
                    type: 'string'
                },
                father: {
                    type: 'string'
                }
            },
            required: ['name'],
            additionalProperties: false
        },
        woman: {
            title: 'Woman',
            $id: '#woman',
            type: 'object',
            properties: {
                typeId: {
                    const: 'http://www.eclipse.org/sirius/sample/basicfamily#//Woman'
                },
                id: {
                    type: 'string'
                },
                name: {
                    type: 'string'
                }
            },
            additionalProperties: false,
            required: ['name']
        }
    },
    $ref: '#/definitions/'
};

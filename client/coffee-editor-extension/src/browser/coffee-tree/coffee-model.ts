/*
 * Copyright (c) 2019-2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 */
import { AnyObject, isArray, isString } from '@eclipse-emfcloud/modelserver-client';
import { TreeEditor } from '@eclipse-emfcloud/theia-tree-editor';

const $typeBase = 'http://www.eclipse.org/emfcloud/coffee/model#//';

export type JsonPrimitiveType = string | boolean | number | object;
export namespace JsonPrimitiveType {
    export function is(object: unknown): object is JsonPrimitiveType {
        return (
            object !== undefined &&
            (typeof object === 'string' || typeof object === 'boolean' || typeof object === 'number' || typeof object === 'object')
        );
    }
}

export interface Family {
    name: string;
    members?: Person[];
}
export namespace Family {
    export const $type = `${$typeBase}Family`;

    export function is(object: unknown): object is Family {
        return Identifiable.is(object) && isString(object, 'name') && isArray(object, 'members'); // && isArray(object, 'flows');
    }
}

export interface Identifiable extends AnyObject {
    id: string;
}

export namespace Identifiable {
    export function is(object: unknown): object is Identifiable {
        return AnyObject.is(object) && isString(object, '$id') && isString(object, 'id');
    }
}
export interface Person extends Identifiable {}
export namespace Person {
    export const $type = `${$typeBase}Person`;

    export function is(object: unknown): object is Node {
        return Identifiable.is(object) && isString(object, 'name');
    }
}

export interface Man extends Person {}
export namespace Man {
    export const $type = `${$typeBase}Man`;

    export function is(object: unknown): object is Node {
        return Person.is(object);
    }
}

export interface Woman extends Person {}
export namespace Woman {
    export const $type = `${$typeBase}Woman`;

    export function is(object: unknown): object is Node {
        return Person.is(object);
    }
}

export namespace ExampleModel {
    export namespace Type {
        export const Man = 'Man';
        export const Woman = 'Woman';
        export const Family = 'Family';
        export const Person = 'Person';

        export function name(type: string): string {
            return type;
        }
    }

    // const members: string[] = [Man.$type, Woman.$type, Person.$type]

    const components = [Type.Man, Type.Woman];

    /** Maps types to their creatable children */
    export const childrenMapping: Map<string, TreeEditor.ChildrenDescriptor[]> = new Map([
        [
            Type.Man,
            [
                {
                    property: 'children',
                    children: components
                }
            ]
        ],
        [
            Type.Woman,
            [
                {
                    property: 'children',
                    children: components
                }
            ]
        ],
        [
            Type.Family,
            [
                {
                    property: 'members',
                    children: components
                }
            ]
        ]
    ]);
}

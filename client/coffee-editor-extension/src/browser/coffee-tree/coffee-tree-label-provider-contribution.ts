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
import { TreeEditor } from '@eclipse-emfcloud/theia-tree-editor';
import { codicon, LabelProviderContribution } from '@theia/core/lib/browser';
import { injectable } from 'inversify';
import { CoffeeTreeEditorConstants } from './coffee-tree-editor-widget';

// const ICON_CLAsSSES: Map<string, string> = new Map([[Node.$type, 'circle']]);

/* Icon for unknown types */
// const UNKNOWN_ICON = 'circle-slash';

@injectable()
export class CoffeeTreeLabelProvider implements LabelProviderContribution {
    public canHandle(element: object): number {
        if (
            (TreeEditor.Node.is(element) || TreeEditor.CommandIconInfo.is(element)) &&
            element.editorId === CoffeeTreeEditorConstants.EDITOR_ID
        ) {
            return 1000;
        }
        return 0;
    }

    getIcon(): string {
        return codicon('list-tree');
    }

    public getName(element: object): string | undefined {
        const data = TreeEditor.Node.is(element) ? element.jsonforms.data : element;

        return data.name;
    }

    // private getNameForType(type: string): string {
    //     return new URI(type).fragment.substring(2);
    // }
}

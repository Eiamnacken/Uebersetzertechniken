/* --------------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * ------------------------------------------------------------------------------------------ */
'use strict';

import * as path from 'path';

import { workspace, Disposable, ExtensionContext } from 'vscode';
import { LanguageClient, LanguageClientOptions, SettingMonitor, ServerOptions, TransportKind } from 'vscode-languageclient';

export function activate(context: ExtensionContext) {

	let executable = process.platform == 'win32' ? 'xtext-server.bat' : 'xtext-server';
	let serverLauncher = context.asAbsolutePath(path.join(
        'xtext-server', 'bin', executable));
	let serverOptions: ServerOptions = {
    run : { command: serverLauncher }, debug: { command: serverLauncher }
	}
	
	// Options to control the language client
	let clientOptions: LanguageClientOptions = {
		// Register the server for plain text documents
		documentSelector: ['mydsl'],
		synchronize: {
			// Synchronize the setting section 'languageServerExample' to the server
			configurationSection: 'languageServerExample',
			// Notify the server about file changes to '.clientrc files contain in the workspace
			fileEvents: workspace.createFileSystemWatcher('**/.mydsl')
		}
	}
	
	// Create the language client and start the client.
	let disposable = new LanguageClient('Xtext Server', serverOptions, clientOptions).start();
	
	// Push the disposable to the context's subscriptions so that the 
	// client can be deactivated on extension deactivation
	context.subscriptions.push(disposable);
}

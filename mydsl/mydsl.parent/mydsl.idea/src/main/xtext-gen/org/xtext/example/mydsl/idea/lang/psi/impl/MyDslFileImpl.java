/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.mydsl.idea.lang.psi.impl;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.eclipse.xtext.psi.impl.BaseXtextFile;
import org.xtext.example.mydsl.idea.lang.MyDslFileType;
import org.xtext.example.mydsl.idea.lang.MyDslLanguage;

public final class MyDslFileImpl extends BaseXtextFile {

	public MyDslFileImpl(FileViewProvider viewProvider) {
		super(viewProvider, MyDslLanguage.INSTANCE);
	}

	@Override
	public FileType getFileType() {
		return MyDslFileType.INSTANCE;
	}
}
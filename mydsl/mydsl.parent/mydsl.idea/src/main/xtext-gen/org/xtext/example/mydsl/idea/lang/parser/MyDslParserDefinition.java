/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.mydsl.idea.lang.parser;

import com.google.inject.Inject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.eclipse.xtext.idea.parser.AbstractXtextParserDefinition;
import org.eclipse.xtext.psi.impl.PsiNamedEObjectImpl;
import org.xtext.example.mydsl.idea.lang.MyDslElementTypeProvider;
import org.xtext.example.mydsl.idea.lang.psi.impl.MyDslFileImpl;

public class MyDslParserDefinition extends AbstractXtextParserDefinition {

	@Inject 
	private MyDslElementTypeProvider elementTypeProvider;

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new MyDslFileImpl(viewProvider);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public PsiElement createElement(ASTNode node) {
		IElementType elementType = node.getElementType();
		if (elementType == elementTypeProvider.getModel_GreetingsMyGreetingParserRuleCall_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getMyGreeting_NameIDTerminalRuleCall_1_0ElementType()
			);
		}
		return super.createElement(node);
	}

}

/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.ourdsl.idea.lang.parser;

import com.google.inject.Inject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.eclipse.xtext.idea.parser.AbstractXtextParserDefinition;
import org.eclipse.xtext.psi.impl.PsiEObjectReference;
import org.eclipse.xtext.psi.impl.PsiNamedEObjectImpl;
import org.xtext.example.ourdsl.idea.lang.OurDslElementTypeProvider;
import org.xtext.example.ourdsl.idea.lang.psi.impl.OurDslFileImpl;

public class OurDslParserDefinition extends AbstractXtextParserDefinition {

	@Inject 
	private OurDslElementTypeProvider elementTypeProvider;

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new OurDslFileImpl(viewProvider);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public PsiElement createElement(ASTNode node) {
		IElementType elementType = node.getElementType();
		if (elementType == elementTypeProvider.getModel_GreetingsGreetingParserRuleCall_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getGreeting_NameIDTerminalRuleCall_1_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getGreeting_DslOneMyGreetingCrossReference_3_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getGreeting_DslTwoYourGreetingCrossReference_5_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		return super.createElement(node);
	}

}

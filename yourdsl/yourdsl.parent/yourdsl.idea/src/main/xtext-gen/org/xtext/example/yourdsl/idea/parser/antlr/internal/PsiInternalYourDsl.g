/*
 * generated by Xtext 2.9.0.beta5
 */
grammar PsiInternalYourDsl;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.xtext.example.yourdsl.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.yourdsl.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.xtext.example.yourdsl.idea.lang.YourDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.xtext.example.yourdsl.services.YourDslGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected YourDslGrammarAccess grammarAccess;

	protected YourDslElementTypeProvider elementTypeProvider;

	public PsiInternalYourDslParser(PsiBuilder builder, TokenStream input, YourDslElementTypeProvider elementTypeProvider, YourDslGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Model";
	}

}

//Entry rule entryRuleModel
entryRuleModel:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	ruleModel
	EOF;

// Rule Model
ruleModel:
	(
		(
			{
				markComposite(elementTypeProvider.getModel_GreetingsYourGreetingParserRuleCall_0ElementType());
			}
			lv_greetings_0_0=ruleYourGreeting
			{
				doneComposite();
			}
		)
	)*
;

//Entry rule entryRuleYourGreeting
entryRuleYourGreeting:
	{ markComposite(elementTypeProvider.getYourGreetingElementType()); }
	ruleYourGreeting
	EOF;

// Rule YourGreeting
ruleYourGreeting:
	(
		{
			markLeaf(elementTypeProvider.getYourGreeting_YourdslKeyword_0ElementType());
		}
		otherlv_0='yourdsl'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getYourGreeting_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
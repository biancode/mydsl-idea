/*
 * generated by Xtext 2.9.0.beta5
 */
grammar InternalYourDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.yourdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.yourdsl.ide.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.yourdsl.services.YourDslGrammarAccess;

}

@parser::members {
 
 	private YourDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(YourDslGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGreetingsAssignment()); }
(rule__Model__GreetingsAssignment)*
{ after(grammarAccess.getModelAccess().getGreetingsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleYourGreeting
entryRuleYourGreeting 
:
{ before(grammarAccess.getYourGreetingRule()); }
	 ruleYourGreeting
{ after(grammarAccess.getYourGreetingRule()); } 
	 EOF 
;

// Rule YourGreeting
ruleYourGreeting
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getYourGreetingAccess().getGroup()); }
(rule__YourGreeting__Group__0)
{ after(grammarAccess.getYourGreetingAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__YourGreeting__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__YourGreeting__Group__0__Impl
	rule__YourGreeting__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__YourGreeting__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getYourGreetingAccess().getYourdslKeyword_0()); }

	'yourdsl' 

{ after(grammarAccess.getYourGreetingAccess().getYourdslKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__YourGreeting__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__YourGreeting__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__YourGreeting__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getYourGreetingAccess().getNameAssignment_1()); }
(rule__YourGreeting__NameAssignment_1)
{ after(grammarAccess.getYourGreetingAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__GreetingsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getGreetingsYourGreetingParserRuleCall_0()); }
	ruleYourGreeting{ after(grammarAccess.getModelAccess().getGreetingsYourGreetingParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__YourGreeting__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getYourGreetingAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getYourGreetingAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



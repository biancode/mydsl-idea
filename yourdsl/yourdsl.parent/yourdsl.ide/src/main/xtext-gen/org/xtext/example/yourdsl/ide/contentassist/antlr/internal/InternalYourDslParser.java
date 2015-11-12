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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalYourDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'yourdsl'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalYourDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalYourDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalYourDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalYourDsl.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // InternalYourDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalYourDsl.g:61:1: ( ruleModel EOF )
            // InternalYourDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalYourDsl.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalYourDsl.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalYourDsl.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalYourDsl.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // InternalYourDsl.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalYourDsl.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalYourDsl.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleYourGreeting"
    // InternalYourDsl.g:88:1: entryRuleYourGreeting : ruleYourGreeting EOF ;
    public final void entryRuleYourGreeting() throws RecognitionException {
        try {
            // InternalYourDsl.g:89:1: ( ruleYourGreeting EOF )
            // InternalYourDsl.g:90:1: ruleYourGreeting EOF
            {
             before(grammarAccess.getYourGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleYourGreeting();

            state._fsp--;

             after(grammarAccess.getYourGreetingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYourGreeting"


    // $ANTLR start "ruleYourGreeting"
    // InternalYourDsl.g:97:1: ruleYourGreeting : ( ( rule__YourGreeting__Group__0 ) ) ;
    public final void ruleYourGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalYourDsl.g:101:2: ( ( ( rule__YourGreeting__Group__0 ) ) )
            // InternalYourDsl.g:102:1: ( ( rule__YourGreeting__Group__0 ) )
            {
            // InternalYourDsl.g:102:1: ( ( rule__YourGreeting__Group__0 ) )
            // InternalYourDsl.g:103:1: ( rule__YourGreeting__Group__0 )
            {
             before(grammarAccess.getYourGreetingAccess().getGroup()); 
            // InternalYourDsl.g:104:1: ( rule__YourGreeting__Group__0 )
            // InternalYourDsl.g:104:2: rule__YourGreeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YourGreeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYourGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYourGreeting"


    // $ANTLR start "rule__YourGreeting__Group__0"
    // InternalYourDsl.g:118:1: rule__YourGreeting__Group__0 : rule__YourGreeting__Group__0__Impl rule__YourGreeting__Group__1 ;
    public final void rule__YourGreeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalYourDsl.g:122:1: ( rule__YourGreeting__Group__0__Impl rule__YourGreeting__Group__1 )
            // InternalYourDsl.g:123:2: rule__YourGreeting__Group__0__Impl rule__YourGreeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__YourGreeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__YourGreeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YourGreeting__Group__0"


    // $ANTLR start "rule__YourGreeting__Group__0__Impl"
    // InternalYourDsl.g:130:1: rule__YourGreeting__Group__0__Impl : ( 'yourdsl' ) ;
    public final void rule__YourGreeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalYourDsl.g:134:1: ( ( 'yourdsl' ) )
            // InternalYourDsl.g:135:1: ( 'yourdsl' )
            {
            // InternalYourDsl.g:135:1: ( 'yourdsl' )
            // InternalYourDsl.g:136:1: 'yourdsl'
            {
             before(grammarAccess.getYourGreetingAccess().getYourdslKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getYourGreetingAccess().getYourdslKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YourGreeting__Group__0__Impl"


    // $ANTLR start "rule__YourGreeting__Group__1"
    // InternalYourDsl.g:149:1: rule__YourGreeting__Group__1 : rule__YourGreeting__Group__1__Impl ;
    public final void rule__YourGreeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalYourDsl.g:153:1: ( rule__YourGreeting__Group__1__Impl )
            // InternalYourDsl.g:154:2: rule__YourGreeting__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YourGreeting__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YourGreeting__Group__1"


    // $ANTLR start "rule__YourGreeting__Group__1__Impl"
    // InternalYourDsl.g:160:1: rule__YourGreeting__Group__1__Impl : ( ( rule__YourGreeting__NameAssignment_1 ) ) ;
    public final void rule__YourGreeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalYourDsl.g:164:1: ( ( ( rule__YourGreeting__NameAssignment_1 ) ) )
            // InternalYourDsl.g:165:1: ( ( rule__YourGreeting__NameAssignment_1 ) )
            {
            // InternalYourDsl.g:165:1: ( ( rule__YourGreeting__NameAssignment_1 ) )
            // InternalYourDsl.g:166:1: ( rule__YourGreeting__NameAssignment_1 )
            {
             before(grammarAccess.getYourGreetingAccess().getNameAssignment_1()); 
            // InternalYourDsl.g:167:1: ( rule__YourGreeting__NameAssignment_1 )
            // InternalYourDsl.g:167:2: rule__YourGreeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__YourGreeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getYourGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YourGreeting__Group__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalYourDsl.g:182:1: rule__Model__GreetingsAssignment : ( ruleYourGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalYourDsl.g:186:1: ( ( ruleYourGreeting ) )
            // InternalYourDsl.g:187:1: ( ruleYourGreeting )
            {
            // InternalYourDsl.g:187:1: ( ruleYourGreeting )
            // InternalYourDsl.g:188:1: ruleYourGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsYourGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleYourGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsYourGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__YourGreeting__NameAssignment_1"
    // InternalYourDsl.g:197:1: rule__YourGreeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__YourGreeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalYourDsl.g:201:1: ( ( RULE_ID ) )
            // InternalYourDsl.g:202:1: ( RULE_ID )
            {
            // InternalYourDsl.g:202:1: ( RULE_ID )
            // InternalYourDsl.g:203:1: RULE_ID
            {
             before(grammarAccess.getYourGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getYourGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YourGreeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}
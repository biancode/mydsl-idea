package org.xtext.example.mydsl.ide.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mydsl'"
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:61:1: ( ruleModel EOF )
            // InternalMyDsl.g:62:1: ruleModel EOF
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
    // InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalMyDsl.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalMyDsl.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // InternalMyDsl.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalMyDsl.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:76:2: rule__Model__GreetingsAssignment
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


    // $ANTLR start "entryRuleMyGreeting"
    // InternalMyDsl.g:88:1: entryRuleMyGreeting : ruleMyGreeting EOF ;
    public final void entryRuleMyGreeting() throws RecognitionException {
        try {
            // InternalMyDsl.g:89:1: ( ruleMyGreeting EOF )
            // InternalMyDsl.g:90:1: ruleMyGreeting EOF
            {
             before(grammarAccess.getMyGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleMyGreeting();

            state._fsp--;

             after(grammarAccess.getMyGreetingRule()); 
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
    // $ANTLR end "entryRuleMyGreeting"


    // $ANTLR start "ruleMyGreeting"
    // InternalMyDsl.g:97:1: ruleMyGreeting : ( ( rule__MyGreeting__Group__0 ) ) ;
    public final void ruleMyGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:101:2: ( ( ( rule__MyGreeting__Group__0 ) ) )
            // InternalMyDsl.g:102:1: ( ( rule__MyGreeting__Group__0 ) )
            {
            // InternalMyDsl.g:102:1: ( ( rule__MyGreeting__Group__0 ) )
            // InternalMyDsl.g:103:1: ( rule__MyGreeting__Group__0 )
            {
             before(grammarAccess.getMyGreetingAccess().getGroup()); 
            // InternalMyDsl.g:104:1: ( rule__MyGreeting__Group__0 )
            // InternalMyDsl.g:104:2: rule__MyGreeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyGreeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleMyGreeting"


    // $ANTLR start "rule__MyGreeting__Group__0"
    // InternalMyDsl.g:118:1: rule__MyGreeting__Group__0 : rule__MyGreeting__Group__0__Impl rule__MyGreeting__Group__1 ;
    public final void rule__MyGreeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:122:1: ( rule__MyGreeting__Group__0__Impl rule__MyGreeting__Group__1 )
            // InternalMyDsl.g:123:2: rule__MyGreeting__Group__0__Impl rule__MyGreeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MyGreeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyGreeting__Group__1();

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
    // $ANTLR end "rule__MyGreeting__Group__0"


    // $ANTLR start "rule__MyGreeting__Group__0__Impl"
    // InternalMyDsl.g:130:1: rule__MyGreeting__Group__0__Impl : ( 'mydsl' ) ;
    public final void rule__MyGreeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:134:1: ( ( 'mydsl' ) )
            // InternalMyDsl.g:135:1: ( 'mydsl' )
            {
            // InternalMyDsl.g:135:1: ( 'mydsl' )
            // InternalMyDsl.g:136:1: 'mydsl'
            {
             before(grammarAccess.getMyGreetingAccess().getMydslKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMyGreetingAccess().getMydslKeyword_0()); 

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
    // $ANTLR end "rule__MyGreeting__Group__0__Impl"


    // $ANTLR start "rule__MyGreeting__Group__1"
    // InternalMyDsl.g:149:1: rule__MyGreeting__Group__1 : rule__MyGreeting__Group__1__Impl ;
    public final void rule__MyGreeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:153:1: ( rule__MyGreeting__Group__1__Impl )
            // InternalMyDsl.g:154:2: rule__MyGreeting__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyGreeting__Group__1__Impl();

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
    // $ANTLR end "rule__MyGreeting__Group__1"


    // $ANTLR start "rule__MyGreeting__Group__1__Impl"
    // InternalMyDsl.g:160:1: rule__MyGreeting__Group__1__Impl : ( ( rule__MyGreeting__NameAssignment_1 ) ) ;
    public final void rule__MyGreeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:164:1: ( ( ( rule__MyGreeting__NameAssignment_1 ) ) )
            // InternalMyDsl.g:165:1: ( ( rule__MyGreeting__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:165:1: ( ( rule__MyGreeting__NameAssignment_1 ) )
            // InternalMyDsl.g:166:1: ( rule__MyGreeting__NameAssignment_1 )
            {
             before(grammarAccess.getMyGreetingAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:167:1: ( rule__MyGreeting__NameAssignment_1 )
            // InternalMyDsl.g:167:2: rule__MyGreeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyGreeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MyGreeting__Group__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalMyDsl.g:182:1: rule__Model__GreetingsAssignment : ( ruleMyGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:186:1: ( ( ruleMyGreeting ) )
            // InternalMyDsl.g:187:1: ( ruleMyGreeting )
            {
            // InternalMyDsl.g:187:1: ( ruleMyGreeting )
            // InternalMyDsl.g:188:1: ruleMyGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsMyGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMyGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsMyGreetingParserRuleCall_0()); 

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


    // $ANTLR start "rule__MyGreeting__NameAssignment_1"
    // InternalMyDsl.g:197:1: rule__MyGreeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MyGreeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalMyDsl.g:201:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:202:1: ( RULE_ID )
            {
            // InternalMyDsl.g:202:1: ( RULE_ID )
            // InternalMyDsl.g:203:1: RULE_ID
            {
             before(grammarAccess.getMyGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMyGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MyGreeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}
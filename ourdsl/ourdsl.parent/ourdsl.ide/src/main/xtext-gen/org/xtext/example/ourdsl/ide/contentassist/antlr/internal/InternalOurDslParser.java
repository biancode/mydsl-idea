package org.xtext.example.ourdsl.ide.contentassist.antlr.internal; 

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
import org.xtext.example.ourdsl.services.OurDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOurDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'using'", "'and'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalOurDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOurDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOurDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOurDsl.g"; }


     
     	private OurDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OurDslGrammarAccess grammarAccess) {
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
    // InternalOurDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOurDsl.g:61:1: ( ruleModel EOF )
            // InternalOurDsl.g:62:1: ruleModel EOF
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
    // InternalOurDsl.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalOurDsl.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalOurDsl.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // InternalOurDsl.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalOurDsl.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOurDsl.g:76:2: rule__Model__GreetingsAssignment
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


    // $ANTLR start "entryRuleGreeting"
    // InternalOurDsl.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalOurDsl.g:89:1: ( ruleGreeting EOF )
            // InternalOurDsl.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalOurDsl.g:97:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:101:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalOurDsl.g:102:1: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalOurDsl.g:102:1: ( ( rule__Greeting__Group__0 ) )
            // InternalOurDsl.g:103:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalOurDsl.g:104:1: ( rule__Greeting__Group__0 )
            // InternalOurDsl.g:104:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalOurDsl.g:118:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:122:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalOurDsl.g:123:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

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
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalOurDsl.g:130:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:134:1: ( ( 'Hello' ) )
            // InternalOurDsl.g:135:1: ( 'Hello' )
            {
            // InternalOurDsl.g:135:1: ( 'Hello' )
            // InternalOurDsl.g:136:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

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
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalOurDsl.g:149:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:153:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalOurDsl.g:154:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2();

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
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalOurDsl.g:161:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:165:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalOurDsl.g:166:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalOurDsl.g:166:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalOurDsl.g:167:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalOurDsl.g:168:1: ( rule__Greeting__NameAssignment_1 )
            // InternalOurDsl.g:168:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // InternalOurDsl.g:178:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl rule__Greeting__Group__3 ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:182:1: ( rule__Greeting__Group__2__Impl rule__Greeting__Group__3 )
            // InternalOurDsl.g:183:2: rule__Greeting__Group__2__Impl rule__Greeting__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__3();

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
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // InternalOurDsl.g:190:1: rule__Greeting__Group__2__Impl : ( 'using' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:194:1: ( ( 'using' ) )
            // InternalOurDsl.g:195:1: ( 'using' )
            {
            // InternalOurDsl.g:195:1: ( 'using' )
            // InternalOurDsl.g:196:1: 'using'
            {
             before(grammarAccess.getGreetingAccess().getUsingKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getUsingKeyword_2()); 

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
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Greeting__Group__3"
    // InternalOurDsl.g:209:1: rule__Greeting__Group__3 : rule__Greeting__Group__3__Impl rule__Greeting__Group__4 ;
    public final void rule__Greeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:213:1: ( rule__Greeting__Group__3__Impl rule__Greeting__Group__4 )
            // InternalOurDsl.g:214:2: rule__Greeting__Group__3__Impl rule__Greeting__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Greeting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__4();

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
    // $ANTLR end "rule__Greeting__Group__3"


    // $ANTLR start "rule__Greeting__Group__3__Impl"
    // InternalOurDsl.g:221:1: rule__Greeting__Group__3__Impl : ( ( rule__Greeting__DslOneAssignment_3 ) ) ;
    public final void rule__Greeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:225:1: ( ( ( rule__Greeting__DslOneAssignment_3 ) ) )
            // InternalOurDsl.g:226:1: ( ( rule__Greeting__DslOneAssignment_3 ) )
            {
            // InternalOurDsl.g:226:1: ( ( rule__Greeting__DslOneAssignment_3 ) )
            // InternalOurDsl.g:227:1: ( rule__Greeting__DslOneAssignment_3 )
            {
             before(grammarAccess.getGreetingAccess().getDslOneAssignment_3()); 
            // InternalOurDsl.g:228:1: ( rule__Greeting__DslOneAssignment_3 )
            // InternalOurDsl.g:228:2: rule__Greeting__DslOneAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__DslOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getDslOneAssignment_3()); 

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
    // $ANTLR end "rule__Greeting__Group__3__Impl"


    // $ANTLR start "rule__Greeting__Group__4"
    // InternalOurDsl.g:238:1: rule__Greeting__Group__4 : rule__Greeting__Group__4__Impl rule__Greeting__Group__5 ;
    public final void rule__Greeting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:242:1: ( rule__Greeting__Group__4__Impl rule__Greeting__Group__5 )
            // InternalOurDsl.g:243:2: rule__Greeting__Group__4__Impl rule__Greeting__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__5();

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
    // $ANTLR end "rule__Greeting__Group__4"


    // $ANTLR start "rule__Greeting__Group__4__Impl"
    // InternalOurDsl.g:250:1: rule__Greeting__Group__4__Impl : ( 'and' ) ;
    public final void rule__Greeting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:254:1: ( ( 'and' ) )
            // InternalOurDsl.g:255:1: ( 'and' )
            {
            // InternalOurDsl.g:255:1: ( 'and' )
            // InternalOurDsl.g:256:1: 'and'
            {
             before(grammarAccess.getGreetingAccess().getAndKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getAndKeyword_4()); 

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
    // $ANTLR end "rule__Greeting__Group__4__Impl"


    // $ANTLR start "rule__Greeting__Group__5"
    // InternalOurDsl.g:269:1: rule__Greeting__Group__5 : rule__Greeting__Group__5__Impl rule__Greeting__Group__6 ;
    public final void rule__Greeting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:273:1: ( rule__Greeting__Group__5__Impl rule__Greeting__Group__6 )
            // InternalOurDsl.g:274:2: rule__Greeting__Group__5__Impl rule__Greeting__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Greeting__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__6();

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
    // $ANTLR end "rule__Greeting__Group__5"


    // $ANTLR start "rule__Greeting__Group__5__Impl"
    // InternalOurDsl.g:281:1: rule__Greeting__Group__5__Impl : ( ( rule__Greeting__DslTwoAssignment_5 ) ) ;
    public final void rule__Greeting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:285:1: ( ( ( rule__Greeting__DslTwoAssignment_5 ) ) )
            // InternalOurDsl.g:286:1: ( ( rule__Greeting__DslTwoAssignment_5 ) )
            {
            // InternalOurDsl.g:286:1: ( ( rule__Greeting__DslTwoAssignment_5 ) )
            // InternalOurDsl.g:287:1: ( rule__Greeting__DslTwoAssignment_5 )
            {
             before(grammarAccess.getGreetingAccess().getDslTwoAssignment_5()); 
            // InternalOurDsl.g:288:1: ( rule__Greeting__DslTwoAssignment_5 )
            // InternalOurDsl.g:288:2: rule__Greeting__DslTwoAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__DslTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getDslTwoAssignment_5()); 

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
    // $ANTLR end "rule__Greeting__Group__5__Impl"


    // $ANTLR start "rule__Greeting__Group__6"
    // InternalOurDsl.g:298:1: rule__Greeting__Group__6 : rule__Greeting__Group__6__Impl ;
    public final void rule__Greeting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:302:1: ( rule__Greeting__Group__6__Impl )
            // InternalOurDsl.g:303:2: rule__Greeting__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__6__Impl();

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
    // $ANTLR end "rule__Greeting__Group__6"


    // $ANTLR start "rule__Greeting__Group__6__Impl"
    // InternalOurDsl.g:309:1: rule__Greeting__Group__6__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:313:1: ( ( '!' ) )
            // InternalOurDsl.g:314:1: ( '!' )
            {
            // InternalOurDsl.g:314:1: ( '!' )
            // InternalOurDsl.g:315:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_6()); 

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
    // $ANTLR end "rule__Greeting__Group__6__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalOurDsl.g:343:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:347:1: ( ( ruleGreeting ) )
            // InternalOurDsl.g:348:1: ( ruleGreeting )
            {
            // InternalOurDsl.g:348:1: ( ruleGreeting )
            // InternalOurDsl.g:349:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

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


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // InternalOurDsl.g:358:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:362:1: ( ( RULE_ID ) )
            // InternalOurDsl.g:363:1: ( RULE_ID )
            {
            // InternalOurDsl.g:363:1: ( RULE_ID )
            // InternalOurDsl.g:364:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1"


    // $ANTLR start "rule__Greeting__DslOneAssignment_3"
    // InternalOurDsl.g:373:1: rule__Greeting__DslOneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Greeting__DslOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:377:1: ( ( ( RULE_ID ) ) )
            // InternalOurDsl.g:378:1: ( ( RULE_ID ) )
            {
            // InternalOurDsl.g:378:1: ( ( RULE_ID ) )
            // InternalOurDsl.g:379:1: ( RULE_ID )
            {
             before(grammarAccess.getGreetingAccess().getDslOneMyGreetingCrossReference_3_0()); 
            // InternalOurDsl.g:380:1: ( RULE_ID )
            // InternalOurDsl.g:381:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getDslOneMyGreetingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getDslOneMyGreetingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getDslOneMyGreetingCrossReference_3_0()); 

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
    // $ANTLR end "rule__Greeting__DslOneAssignment_3"


    // $ANTLR start "rule__Greeting__DslTwoAssignment_5"
    // InternalOurDsl.g:392:1: rule__Greeting__DslTwoAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Greeting__DslTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOurDsl.g:396:1: ( ( ( RULE_ID ) ) )
            // InternalOurDsl.g:397:1: ( ( RULE_ID ) )
            {
            // InternalOurDsl.g:397:1: ( ( RULE_ID ) )
            // InternalOurDsl.g:398:1: ( RULE_ID )
            {
             before(grammarAccess.getGreetingAccess().getDslTwoYourGreetingCrossReference_5_0()); 
            // InternalOurDsl.g:399:1: ( RULE_ID )
            // InternalOurDsl.g:400:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getDslTwoYourGreetingIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getDslTwoYourGreetingIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getDslTwoYourGreetingCrossReference_5_0()); 

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
    // $ANTLR end "rule__Greeting__DslTwoAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}
package org.xtext.example.yourdsl.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.xtext.example.yourdsl.idea.lang.YourDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.xtext.example.yourdsl.services.YourDslGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalYourDslParser extends AbstractPsiAntlrParser {
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


        public PsiInternalYourDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalYourDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalYourDslParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalYourDsl.g"; }



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




    // $ANTLR start "entryRuleModel"
    // PsiInternalYourDsl.g:52:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // PsiInternalYourDsl.g:52:15: ( ruleModel EOF )
            // PsiInternalYourDsl.g:53:2: ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

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
    // PsiInternalYourDsl.g:58:1: ruleModel : ( (lv_greetings_0_0= ruleYourGreeting ) )* ;
    public final void ruleModel() throws RecognitionException {
        try {
            // PsiInternalYourDsl.g:58:10: ( ( (lv_greetings_0_0= ruleYourGreeting ) )* )
            // PsiInternalYourDsl.g:59:2: ( (lv_greetings_0_0= ruleYourGreeting ) )*
            {
            // PsiInternalYourDsl.g:59:2: ( (lv_greetings_0_0= ruleYourGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalYourDsl.g:60:3: (lv_greetings_0_0= ruleYourGreeting )
            	    {
            	    // PsiInternalYourDsl.g:60:3: (lv_greetings_0_0= ruleYourGreeting )
            	    // PsiInternalYourDsl.g:61:4: lv_greetings_0_0= ruleYourGreeting
            	    {

            	    				markComposite(elementTypeProvider.getModel_GreetingsYourGreetingParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_3);
            	    ruleYourGreeting();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleYourGreeting"
    // PsiInternalYourDsl.g:73:1: entryRuleYourGreeting : ruleYourGreeting EOF ;
    public final void entryRuleYourGreeting() throws RecognitionException {
        try {
            // PsiInternalYourDsl.g:73:22: ( ruleYourGreeting EOF )
            // PsiInternalYourDsl.g:74:2: ruleYourGreeting EOF
            {
             markComposite(elementTypeProvider.getYourGreetingElementType()); 
            pushFollow(FOLLOW_1);
            ruleYourGreeting();

            state._fsp--;

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
    // PsiInternalYourDsl.g:79:1: ruleYourGreeting : (otherlv_0= 'yourdsl' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final void ruleYourGreeting() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalYourDsl.g:79:17: ( (otherlv_0= 'yourdsl' ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalYourDsl.g:80:2: (otherlv_0= 'yourdsl' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalYourDsl.g:80:2: (otherlv_0= 'yourdsl' ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalYourDsl.g:81:3: otherlv_0= 'yourdsl' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getYourGreeting_YourdslKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalYourDsl.g:88:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalYourDsl.g:89:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalYourDsl.g:89:4: (lv_name_1_0= RULE_ID )
            // PsiInternalYourDsl.g:90:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getYourGreeting_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            }


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
    // $ANTLR end "ruleYourGreeting"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}
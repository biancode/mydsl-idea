package org.xtext.example.ourdsl.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.xtext.example.ourdsl.idea.lang.OurDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.xtext.example.ourdsl.services.OurDslGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalOurDslParser extends AbstractPsiAntlrParser {
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


        public PsiInternalOurDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalOurDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalOurDslParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalOurDsl.g"; }



    	protected OurDslGrammarAccess grammarAccess;

    	protected OurDslElementTypeProvider elementTypeProvider;

    	public PsiInternalOurDslParser(PsiBuilder builder, TokenStream input, OurDslElementTypeProvider elementTypeProvider, OurDslGrammarAccess grammarAccess) {
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
    // PsiInternalOurDsl.g:52:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // PsiInternalOurDsl.g:52:15: ( ruleModel EOF )
            // PsiInternalOurDsl.g:53:2: ruleModel EOF
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
    // PsiInternalOurDsl.g:58:1: ruleModel : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final void ruleModel() throws RecognitionException {
        try {
            // PsiInternalOurDsl.g:58:10: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // PsiInternalOurDsl.g:59:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // PsiInternalOurDsl.g:59:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalOurDsl.g:60:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // PsiInternalOurDsl.g:60:3: (lv_greetings_0_0= ruleGreeting )
            	    // PsiInternalOurDsl.g:61:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				markComposite(elementTypeProvider.getModel_GreetingsGreetingParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_3);
            	    ruleGreeting();

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


    // $ANTLR start "entryRuleGreeting"
    // PsiInternalOurDsl.g:73:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // PsiInternalOurDsl.g:73:18: ( ruleGreeting EOF )
            // PsiInternalOurDsl.g:74:2: ruleGreeting EOF
            {
             markComposite(elementTypeProvider.getGreetingElementType()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // PsiInternalOurDsl.g:79:1: ruleGreeting : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) otherlv_6= '!' ) ;
    public final void ruleGreeting() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // PsiInternalOurDsl.g:79:13: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) otherlv_6= '!' ) )
            // PsiInternalOurDsl.g:80:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) otherlv_6= '!' )
            {
            // PsiInternalOurDsl.g:80:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) otherlv_6= '!' )
            // PsiInternalOurDsl.g:81:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) otherlv_6= '!'
            {

            			markLeaf(elementTypeProvider.getGreeting_HelloKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOurDsl.g:88:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOurDsl.g:89:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOurDsl.g:89:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOurDsl.g:90:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getGreeting_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getGreeting_UsingKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOurDsl.g:106:3: ( (otherlv_3= RULE_ID ) )
            // PsiInternalOurDsl.g:107:4: (otherlv_3= RULE_ID )
            {
            // PsiInternalOurDsl.g:107:4: (otherlv_3= RULE_ID )
            // PsiInternalOurDsl.g:108:5: otherlv_3= RULE_ID
            {

            					markLeaf(elementTypeProvider.getGreeting_DslOneMyGreetingCrossReference_3_0ElementType());
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					doneLeaf(otherlv_3);
            				

            }


            }


            			markLeaf(elementTypeProvider.getGreeting_AndKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOurDsl.g:124:3: ( (otherlv_5= RULE_ID ) )
            // PsiInternalOurDsl.g:125:4: (otherlv_5= RULE_ID )
            {
            // PsiInternalOurDsl.g:125:4: (otherlv_5= RULE_ID )
            // PsiInternalOurDsl.g:126:5: otherlv_5= RULE_ID
            {

            					markLeaf(elementTypeProvider.getGreeting_DslTwoYourGreetingCrossReference_5_0ElementType());
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					doneLeaf(otherlv_5);
            				

            }


            }


            			markLeaf(elementTypeProvider.getGreeting_ExclamationMarkKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			doneLeaf(otherlv_6);
            		

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
    // $ANTLR end "ruleGreeting"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}
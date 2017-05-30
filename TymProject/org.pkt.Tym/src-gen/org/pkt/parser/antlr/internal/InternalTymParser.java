package org.pkt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.pkt.services.TymGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTymParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<F'", "'('", "','", "')'", "'num'", "'word'", "'Bool'", "'print'", "'test'", "'or'", "'end'", "'loop'", "'re'", "'func'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTymParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTymParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTymParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTym.g"; }



     	private TymGrammarAccess grammarAccess;

        public InternalTymParser(TokenStream input, TymGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TymGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTym.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTym.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTym.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTym.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_elements_0_1= ruleAbstractElement | lv_elements_0_2= ruleFunction ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_1 = null;

        EObject lv_elements_0_2 = null;



        	enterRule();

        try {
            // InternalTym.g:77:2: ( ( ( (lv_elements_0_1= ruleAbstractElement | lv_elements_0_2= ruleFunction ) ) )* )
            // InternalTym.g:78:2: ( ( (lv_elements_0_1= ruleAbstractElement | lv_elements_0_2= ruleFunction ) ) )*
            {
            // InternalTym.g:78:2: ( ( (lv_elements_0_1= ruleAbstractElement | lv_elements_0_2= ruleFunction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==12||(LA2_0>=16 && LA2_0<=20)||(LA2_0>=23 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTym.g:79:3: ( (lv_elements_0_1= ruleAbstractElement | lv_elements_0_2= ruleFunction ) )
            	    {
            	    // InternalTym.g:79:3: ( (lv_elements_0_1= ruleAbstractElement | lv_elements_0_2= ruleFunction ) )
            	    // InternalTym.g:80:4: (lv_elements_0_1= ruleAbstractElement | lv_elements_0_2= ruleFunction )
            	    {
            	    // InternalTym.g:80:4: (lv_elements_0_1= ruleAbstractElement | lv_elements_0_2= ruleFunction )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_ID||(LA1_0>=16 && LA1_0<=20)||(LA1_0>=23 && LA1_0<=25)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==12) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalTym.g:81:5: lv_elements_0_1= ruleAbstractElement
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_elements_0_1=ruleAbstractElement();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"elements",
            	              						lv_elements_0_1,
            	              						"org.pkt.Tym.AbstractElement");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTym.g:97:5: lv_elements_0_2= ruleFunction
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getModelAccess().getElementsFunctionParserRuleCall_0_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_elements_0_2=ruleFunction();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"elements",
            	              						lv_elements_0_2,
            	              						"org.pkt.Tym.Function");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalTym.g:118:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalTym.g:118:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalTym.g:119:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalTym.g:125:1: ruleAbstractElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_PrintStatement_1= rulePrintStatement | this_TestStatement_2= ruleTestStatement | this_LoopStatement_3= ruleLoopStatement | this_Return_4= ruleReturn | this_FunctionCall_5= ruleFunctionCall ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_PrintStatement_1 = null;

        EObject this_TestStatement_2 = null;

        EObject this_LoopStatement_3 = null;

        EObject this_Return_4 = null;

        EObject this_FunctionCall_5 = null;



        	enterRule();

        try {
            // InternalTym.g:131:2: ( (this_Variable_0= ruleVariable | this_PrintStatement_1= rulePrintStatement | this_TestStatement_2= ruleTestStatement | this_LoopStatement_3= ruleLoopStatement | this_Return_4= ruleReturn | this_FunctionCall_5= ruleFunctionCall ) )
            // InternalTym.g:132:2: (this_Variable_0= ruleVariable | this_PrintStatement_1= rulePrintStatement | this_TestStatement_2= ruleTestStatement | this_LoopStatement_3= ruleLoopStatement | this_Return_4= ruleReturn | this_FunctionCall_5= ruleFunctionCall )
            {
            // InternalTym.g:132:2: (this_Variable_0= ruleVariable | this_PrintStatement_1= rulePrintStatement | this_TestStatement_2= ruleTestStatement | this_LoopStatement_3= ruleLoopStatement | this_Return_4= ruleReturn | this_FunctionCall_5= ruleFunctionCall )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 16:
            case 17:
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTym.g:133:3: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTym.g:142:3: this_PrintStatement_1= rulePrintStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getPrintStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrintStatement_1=rulePrintStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrintStatement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTym.g:151:3: this_TestStatement_2= ruleTestStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getTestStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TestStatement_2=ruleTestStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TestStatement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTym.g:160:3: this_LoopStatement_3= ruleLoopStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getLoopStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_3=ruleLoopStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LoopStatement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTym.g:169:3: this_Return_4= ruleReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getReturnParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Return_4=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Return_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTym.g:178:3: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getFunctionCallParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_5=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // InternalTym.g:190:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTym.g:190:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTym.g:191:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTym.g:197:1: ruleVariable returns [EObject current=null] : ( ( ( ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '=' ( ( (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_vartype_0_0 = null;

        EObject lv_expression_4_1 = null;

        EObject lv_expression_4_2 = null;



        	enterRule();

        try {
            // InternalTym.g:203:2: ( ( ( ( ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '=' ( ( (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall ) ) ) ) )
            // InternalTym.g:204:2: ( ( ( ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '=' ( ( (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall ) ) ) )
            {
            // InternalTym.g:204:2: ( ( ( ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '=' ( ( (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall ) ) ) )
            // InternalTym.g:205:3: ( ( ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '=' ( ( (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall ) ) )
            {
            // InternalTym.g:205:3: ( ( ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=18)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTym.g:206:4: ( ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalTym.g:206:4: ( ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalTym.g:207:5: ( (lv_vartype_0_0= ruleVariableType ) ) ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalTym.g:207:5: ( (lv_vartype_0_0= ruleVariableType ) )
                    // InternalTym.g:208:6: (lv_vartype_0_0= ruleVariableType )
                    {
                    // InternalTym.g:208:6: (lv_vartype_0_0= ruleVariableType )
                    // InternalTym.g:209:7: lv_vartype_0_0= ruleVariableType
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getVariableAccess().getVartypeVariableTypeParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_4);
                    lv_vartype_0_0=ruleVariableType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getVariableRule());
                      							}
                      							set(
                      								current,
                      								"vartype",
                      								lv_vartype_0_0,
                      								"org.pkt.Tym.VariableType");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTym.g:226:5: ( (lv_name_1_0= RULE_ID ) )
                    // InternalTym.g:227:6: (lv_name_1_0= RULE_ID )
                    {
                    // InternalTym.g:227:6: (lv_name_1_0= RULE_ID )
                    // InternalTym.g:228:7: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVariableRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_1_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTym.g:246:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalTym.g:246:4: ( (otherlv_2= RULE_ID ) )
                    // InternalTym.g:247:5: (otherlv_2= RULE_ID )
                    {
                    // InternalTym.g:247:5: (otherlv_2= RULE_ID )
                    // InternalTym.g:248:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getVariableVariableCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalTym.g:264:3: ( ( (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall ) ) )
            // InternalTym.g:265:4: ( (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall ) )
            {
            // InternalTym.g:265:4: ( (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall ) )
            // InternalTym.g:266:5: (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall )
            {
            // InternalTym.g:266:5: (lv_expression_4_1= ruleExpression | lv_expression_4_2= ruleFunctionCall )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||LA5_0==13||(LA5_0>=38 && LA5_0<=40)) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTym.g:267:6: lv_expression_4_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_4_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_4_1,
                      							"org.pkt.Tym.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTym.g:283:6: lv_expression_4_2= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableAccess().getExpressionFunctionCallParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_4_2=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_4_2,
                      							"org.pkt.Tym.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleFunction"
    // InternalTym.g:305:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalTym.g:305:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalTym.g:306:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalTym.g:312:1: ruleFunction returns [EObject current=null] : (otherlv_0= '<F' ( (lv_return_1_0= ruleVariableType ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleFunctionBlock ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_return_1_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalTym.g:318:2: ( (otherlv_0= '<F' ( (lv_return_1_0= ruleVariableType ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleFunctionBlock ) ) ) )
            // InternalTym.g:319:2: (otherlv_0= '<F' ( (lv_return_1_0= ruleVariableType ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleFunctionBlock ) ) )
            {
            // InternalTym.g:319:2: (otherlv_0= '<F' ( (lv_return_1_0= ruleVariableType ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleFunctionBlock ) ) )
            // InternalTym.g:320:3: otherlv_0= '<F' ( (lv_return_1_0= ruleVariableType ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleFunctionBlock ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFKeyword_0());
              		
            }
            // InternalTym.g:324:3: ( (lv_return_1_0= ruleVariableType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=18)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTym.g:325:4: (lv_return_1_0= ruleVariableType )
                    {
                    // InternalTym.g:325:4: (lv_return_1_0= ruleVariableType )
                    // InternalTym.g:326:5: lv_return_1_0= ruleVariableType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionAccess().getReturnVariableTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    lv_return_1_0=ruleVariableType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionRule());
                      					}
                      					set(
                      						current,
                      						"return",
                      						lv_return_1_0,
                      						"org.pkt.Tym.VariableType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTym.g:343:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTym.g:344:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTym.g:344:4: (lv_name_2_0= RULE_ID )
            // InternalTym.g:345:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalTym.g:365:3: ( ( (lv_params_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=16 && LA8_0<=18)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTym.g:366:4: ( (lv_params_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) ) )*
                    {
                    // InternalTym.g:366:4: ( (lv_params_4_0= ruleVariable ) )
                    // InternalTym.g:367:5: (lv_params_4_0= ruleVariable )
                    {
                    // InternalTym.g:367:5: (lv_params_4_0= ruleVariable )
                    // InternalTym.g:368:6: lv_params_4_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionAccess().getParamsVariableParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_params_4_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_4_0,
                      							"org.pkt.Tym.Variable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTym.g:385:4: (otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTym.g:386:5: otherlv_5= ',' ( (lv_params_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalTym.g:390:5: ( (lv_params_6_0= ruleVariable ) )
                    	    // InternalTym.g:391:6: (lv_params_6_0= ruleVariable )
                    	    {
                    	    // InternalTym.g:391:6: (lv_params_6_0= ruleVariable )
                    	    // InternalTym.g:392:7: lv_params_6_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionAccess().getParamsVariableParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_params_6_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_6_0,
                    	      								"org.pkt.Tym.Variable");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalTym.g:415:3: ( (lv_body_8_0= ruleFunctionBlock ) )
            // InternalTym.g:416:4: (lv_body_8_0= ruleFunctionBlock )
            {
            // InternalTym.g:416:4: (lv_body_8_0= ruleFunctionBlock )
            // InternalTym.g:417:5: lv_body_8_0= ruleFunctionBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getBodyFunctionBlockParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_8_0=ruleFunctionBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_8_0,
              						"org.pkt.Tym.FunctionBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVariableType"
    // InternalTym.g:438:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // InternalTym.g:438:52: (iv_ruleVariableType= ruleVariableType EOF )
            // InternalTym.g:439:2: iv_ruleVariableType= ruleVariableType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalTym.g:445:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'num' | kw= 'word' | kw= 'Bool' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTym.g:451:2: ( (kw= 'num' | kw= 'word' | kw= 'Bool' ) )
            // InternalTym.g:452:2: (kw= 'num' | kw= 'word' | kw= 'Bool' )
            {
            // InternalTym.g:452:2: (kw= 'num' | kw= 'word' | kw= 'Bool' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTym.g:453:3: kw= 'num'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getNumKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTym.g:459:3: kw= 'word'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getWordKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTym.g:465:3: kw= 'Bool'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getBoolKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRulePrintStatement"
    // InternalTym.g:474:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalTym.g:474:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalTym.g:475:2: iv_rulePrintStatement= rulePrintStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrintStatement=rulePrintStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrintStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalTym.g:481:1: rulePrintStatement returns [EObject current=null] : (otherlv_0= 'print' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ) ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_1 = null;

        EObject lv_expression_1_2 = null;



        	enterRule();

        try {
            // InternalTym.g:487:2: ( (otherlv_0= 'print' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ) )
            // InternalTym.g:488:2: (otherlv_0= 'print' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) )
            {
            // InternalTym.g:488:2: (otherlv_0= 'print' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) )
            // InternalTym.g:489:3: otherlv_0= 'print' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintStatementAccess().getPrintKeyword_0());
              		
            }
            // InternalTym.g:493:3: ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) )
            // InternalTym.g:494:4: ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) )
            {
            // InternalTym.g:494:4: ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) )
            // InternalTym.g:495:5: (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall )
            {
            // InternalTym.g:495:5: (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==13||(LA10_0>=38 && LA10_0<=40)) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTym.g:496:6: lv_expression_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrintStatementAccess().getExpressionExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_1_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrintStatementRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_1,
                      							"org.pkt.Tym.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTym.g:512:6: lv_expression_1_2= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrintStatementAccess().getExpressionFunctionCallParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_1_2=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrintStatementRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_2,
                      							"org.pkt.Tym.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRuleTestStatement"
    // InternalTym.g:534:1: entryRuleTestStatement returns [EObject current=null] : iv_ruleTestStatement= ruleTestStatement EOF ;
    public final EObject entryRuleTestStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestStatement = null;


        try {
            // InternalTym.g:534:54: (iv_ruleTestStatement= ruleTestStatement EOF )
            // InternalTym.g:535:2: iv_ruleTestStatement= ruleTestStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTestStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTestStatement=ruleTestStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTestStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestStatement"


    // $ANTLR start "ruleTestStatement"
    // InternalTym.g:541:1: ruleTestStatement returns [EObject current=null] : (otherlv_0= 'test' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_thenBlock_2_0= ruleBlock ) ) ( ( ( 'or' )=>otherlv_3= 'or' ) ( (lv_elseBlock_4_0= ruleBlock ) ) )? ) ;
    public final EObject ruleTestStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_1_1 = null;

        EObject lv_expression_1_2 = null;

        EObject lv_thenBlock_2_0 = null;

        EObject lv_elseBlock_4_0 = null;



        	enterRule();

        try {
            // InternalTym.g:547:2: ( (otherlv_0= 'test' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_thenBlock_2_0= ruleBlock ) ) ( ( ( 'or' )=>otherlv_3= 'or' ) ( (lv_elseBlock_4_0= ruleBlock ) ) )? ) )
            // InternalTym.g:548:2: (otherlv_0= 'test' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_thenBlock_2_0= ruleBlock ) ) ( ( ( 'or' )=>otherlv_3= 'or' ) ( (lv_elseBlock_4_0= ruleBlock ) ) )? )
            {
            // InternalTym.g:548:2: (otherlv_0= 'test' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_thenBlock_2_0= ruleBlock ) ) ( ( ( 'or' )=>otherlv_3= 'or' ) ( (lv_elseBlock_4_0= ruleBlock ) ) )? )
            // InternalTym.g:549:3: otherlv_0= 'test' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_thenBlock_2_0= ruleBlock ) ) ( ( ( 'or' )=>otherlv_3= 'or' ) ( (lv_elseBlock_4_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTestStatementAccess().getTestKeyword_0());
              		
            }
            // InternalTym.g:553:3: ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) )
            // InternalTym.g:554:4: ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) )
            {
            // InternalTym.g:554:4: ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) )
            // InternalTym.g:555:5: (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall )
            {
            // InternalTym.g:555:5: (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||LA11_0==13||(LA11_0>=38 && LA11_0<=40)) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTym.g:556:6: lv_expression_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTestStatementAccess().getExpressionExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expression_1_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTestStatementRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_1,
                      							"org.pkt.Tym.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTym.g:572:6: lv_expression_1_2= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTestStatementAccess().getExpressionFunctionCallParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expression_1_2=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTestStatementRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_2,
                      							"org.pkt.Tym.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalTym.g:590:3: ( (lv_thenBlock_2_0= ruleBlock ) )
            // InternalTym.g:591:4: (lv_thenBlock_2_0= ruleBlock )
            {
            // InternalTym.g:591:4: (lv_thenBlock_2_0= ruleBlock )
            // InternalTym.g:592:5: lv_thenBlock_2_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTestStatementAccess().getThenBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_thenBlock_2_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTestStatementRule());
              					}
              					set(
              						current,
              						"thenBlock",
              						lv_thenBlock_2_0,
              						"org.pkt.Tym.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTym.g:609:3: ( ( ( 'or' )=>otherlv_3= 'or' ) ( (lv_elseBlock_4_0= ruleBlock ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) && (synpred1_InternalTym())) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTym.g:610:4: ( ( 'or' )=>otherlv_3= 'or' ) ( (lv_elseBlock_4_0= ruleBlock ) )
                    {
                    // InternalTym.g:610:4: ( ( 'or' )=>otherlv_3= 'or' )
                    // InternalTym.g:611:5: ( 'or' )=>otherlv_3= 'or'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getTestStatementAccess().getOrKeyword_3_0());
                      				
                    }

                    }

                    // InternalTym.g:617:4: ( (lv_elseBlock_4_0= ruleBlock ) )
                    // InternalTym.g:618:5: (lv_elseBlock_4_0= ruleBlock )
                    {
                    // InternalTym.g:618:5: (lv_elseBlock_4_0= ruleBlock )
                    // InternalTym.g:619:6: lv_elseBlock_4_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTestStatementAccess().getElseBlockBlockParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_4_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTestStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_4_0,
                      							"org.pkt.Tym.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestStatement"


    // $ANTLR start "entryRuleBlock"
    // InternalTym.g:641:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalTym.g:641:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalTym.g:642:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalTym.g:648:1: ruleBlock returns [EObject current=null] : ( ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTym.g:654:2: ( ( ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end' ) )
            // InternalTym.g:655:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end' )
            {
            // InternalTym.g:655:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end' )
            // InternalTym.g:656:3: ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end'
            {
            // InternalTym.g:656:3: ( (lv_elements_0_0= ruleAbstractElement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=16 && LA13_0<=20)||(LA13_0>=23 && LA13_0<=25)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTym.g:657:4: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalTym.g:657:4: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalTym.g:658:5: lv_elements_0_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getElementsAbstractElementParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_0_0,
            	      						"org.pkt.Tym.AbstractElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getEndKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleFunctionBlock"
    // InternalTym.g:683:1: entryRuleFunctionBlock returns [EObject current=null] : iv_ruleFunctionBlock= ruleFunctionBlock EOF ;
    public final EObject entryRuleFunctionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBlock = null;


        try {
            // InternalTym.g:683:54: (iv_ruleFunctionBlock= ruleFunctionBlock EOF )
            // InternalTym.g:684:2: iv_ruleFunctionBlock= ruleFunctionBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBlock=ruleFunctionBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBlock"


    // $ANTLR start "ruleFunctionBlock"
    // InternalTym.g:690:1: ruleFunctionBlock returns [EObject current=null] : ( ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end' ) ;
    public final EObject ruleFunctionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTym.g:696:2: ( ( ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end' ) )
            // InternalTym.g:697:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end' )
            {
            // InternalTym.g:697:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end' )
            // InternalTym.g:698:3: ( (lv_elements_0_0= ruleAbstractElement ) )+ otherlv_1= 'end'
            {
            // InternalTym.g:698:3: ( (lv_elements_0_0= ruleAbstractElement ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=16 && LA14_0<=20)||(LA14_0>=23 && LA14_0<=25)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTym.g:699:4: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalTym.g:699:4: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalTym.g:700:5: lv_elements_0_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionBlockAccess().getElementsAbstractElementParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctionBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_0_0,
            	      						"org.pkt.Tym.AbstractElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionBlockAccess().getEndKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBlock"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalTym.g:725:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalTym.g:725:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalTym.g:726:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalTym.g:732:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'loop' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_body_2_0= ruleBlock ) ) ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_1 = null;

        EObject lv_expression_1_2 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalTym.g:738:2: ( (otherlv_0= 'loop' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_body_2_0= ruleBlock ) ) ) )
            // InternalTym.g:739:2: (otherlv_0= 'loop' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_body_2_0= ruleBlock ) ) )
            {
            // InternalTym.g:739:2: (otherlv_0= 'loop' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_body_2_0= ruleBlock ) ) )
            // InternalTym.g:740:3: otherlv_0= 'loop' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ( (lv_body_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getLoopKeyword_0());
              		
            }
            // InternalTym.g:744:3: ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) )
            // InternalTym.g:745:4: ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) )
            {
            // InternalTym.g:745:4: ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) )
            // InternalTym.g:746:5: (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall )
            {
            // InternalTym.g:746:5: (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==13||(LA15_0>=38 && LA15_0<=40)) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTym.g:747:6: lv_expression_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLoopStatementAccess().getExpressionExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expression_1_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLoopStatementRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_1,
                      							"org.pkt.Tym.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTym.g:763:6: lv_expression_1_2= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLoopStatementAccess().getExpressionFunctionCallParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expression_1_2=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLoopStatementRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_2,
                      							"org.pkt.Tym.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalTym.g:781:3: ( (lv_body_2_0= ruleBlock ) )
            // InternalTym.g:782:4: (lv_body_2_0= ruleBlock )
            {
            // InternalTym.g:782:4: (lv_body_2_0= ruleBlock )
            // InternalTym.g:783:5: lv_body_2_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLoopStatementAccess().getBodyBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_2_0,
              						"org.pkt.Tym.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleReturn"
    // InternalTym.g:804:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalTym.g:804:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalTym.g:805:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalTym.g:811:1: ruleReturn returns [EObject current=null] : (otherlv_0= 're' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_1 = null;

        EObject lv_expression_1_2 = null;



        	enterRule();

        try {
            // InternalTym.g:817:2: ( (otherlv_0= 're' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) ) )
            // InternalTym.g:818:2: (otherlv_0= 're' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) )
            {
            // InternalTym.g:818:2: (otherlv_0= 're' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) ) )
            // InternalTym.g:819:3: otherlv_0= 're' ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReKeyword_0());
              		
            }
            // InternalTym.g:823:3: ( ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) ) )
            // InternalTym.g:824:4: ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) )
            {
            // InternalTym.g:824:4: ( (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall ) )
            // InternalTym.g:825:5: (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall )
            {
            // InternalTym.g:825:5: (lv_expression_1_1= ruleExpression | lv_expression_1_2= ruleFunctionCall )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==13||(LA16_0>=38 && LA16_0<=40)) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTym.g:826:6: lv_expression_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_1_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReturnRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_1,
                      							"org.pkt.Tym.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTym.g:842:6: lv_expression_1_2= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnAccess().getExpressionFunctionCallParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_1_2=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReturnRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_2,
                      							"org.pkt.Tym.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalTym.g:864:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalTym.g:864:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalTym.g:865:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalTym.g:871:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'func' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalTym.g:877:2: ( (otherlv_0= 'func' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalTym.g:878:2: (otherlv_0= 'func' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalTym.g:878:2: (otherlv_0= 'func' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // InternalTym.g:879:3: otherlv_0= 'func' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getFuncKeyword_0());
              		
            }
            // InternalTym.g:883:3: ( (otherlv_1= RULE_ID ) )
            // InternalTym.g:884:4: (otherlv_1= RULE_ID )
            {
            // InternalTym.g:884:4: (otherlv_1= RULE_ID )
            // InternalTym.g:885:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFuncnameFunctionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalTym.g:900:3: ( ( (lv_params_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==13||(LA18_0>=38 && LA18_0<=40)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTym.g:901:4: ( (lv_params_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                    {
                    // InternalTym.g:901:4: ( (lv_params_3_0= ruleExpression ) )
                    // InternalTym.g:902:5: (lv_params_3_0= ruleExpression )
                    {
                    // InternalTym.g:902:5: (lv_params_3_0= ruleExpression )
                    // InternalTym.g:903:6: lv_params_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_params_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"org.pkt.Tym.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTym.g:920:4: (otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalTym.g:921:5: otherlv_4= ',' ( (lv_params_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalTym.g:925:5: ( (lv_params_5_0= ruleExpression ) )
                    	    // InternalTym.g:926:6: (lv_params_5_0= ruleExpression )
                    	    {
                    	    // InternalTym.g:926:6: (lv_params_5_0= ruleExpression )
                    	    // InternalTym.g:927:7: lv_params_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_params_5_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_5_0,
                    	      								"org.pkt.Tym.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleExpression"
    // InternalTym.g:954:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTym.g:954:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTym.g:955:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTym.g:961:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalTym.g:967:2: (this_Or_0= ruleOr )
            // InternalTym.g:968:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalTym.g:979:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalTym.g:979:43: (iv_ruleOr= ruleOr EOF )
            // InternalTym.g:980:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalTym.g:986:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTym.g:992:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalTym.g:993:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalTym.g:993:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalTym.g:994:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTym.g:1002:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTym.g:1003:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalTym.g:1003:4: ()
            	    // InternalTym.g:1004:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalTym.g:1014:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalTym.g:1015:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalTym.g:1015:5: (lv_right_3_0= ruleAnd )
            	    // InternalTym.g:1016:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.pkt.Tym.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalTym.g:1038:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalTym.g:1038:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalTym.g:1039:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalTym.g:1045:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTym.g:1051:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalTym.g:1052:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalTym.g:1052:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalTym.g:1053:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTym.g:1061:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTym.g:1062:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalTym.g:1062:4: ()
            	    // InternalTym.g:1063:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalTym.g:1073:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalTym.g:1074:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalTym.g:1074:5: (lv_right_3_0= ruleEquality )
            	    // InternalTym.g:1075:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.pkt.Tym.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalTym.g:1097:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalTym.g:1097:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalTym.g:1098:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalTym.g:1104:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTym.g:1110:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalTym.g:1111:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalTym.g:1111:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalTym.g:1112:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTym.g:1120:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=28 && LA22_0<=29)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTym.g:1121:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalTym.g:1121:4: ()
            	    // InternalTym.g:1122:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTym.g:1128:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalTym.g:1129:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalTym.g:1129:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalTym.g:1130:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalTym.g:1130:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==28) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==29) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalTym.g:1131:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTym.g:1142:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTym.g:1155:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalTym.g:1156:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalTym.g:1156:5: (lv_right_3_0= ruleComparison )
            	    // InternalTym.g:1157:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.pkt.Tym.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalTym.g:1179:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalTym.g:1179:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalTym.g:1180:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalTym.g:1186:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTym.g:1192:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalTym.g:1193:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalTym.g:1193:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalTym.g:1194:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTym.g:1202:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=30 && LA24_0<=33)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTym.g:1203:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalTym.g:1203:4: ()
            	    // InternalTym.g:1204:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTym.g:1210:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalTym.g:1211:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalTym.g:1211:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalTym.g:1212:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalTym.g:1212:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // InternalTym.g:1213:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTym.g:1224:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalTym.g:1235:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalTym.g:1246:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTym.g:1259:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalTym.g:1260:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalTym.g:1260:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalTym.g:1261:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.pkt.Tym.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalTym.g:1283:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalTym.g:1283:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalTym.g:1284:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalTym.g:1290:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalTym.g:1296:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalTym.g:1297:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalTym.g:1297:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalTym.g:1298:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTym.g:1306:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=34 && LA26_0<=35)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTym.g:1307:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalTym.g:1307:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==34) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==35) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalTym.g:1308:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalTym.g:1308:5: ( () otherlv_2= '+' )
            	            // InternalTym.g:1309:6: () otherlv_2= '+'
            	            {
            	            // InternalTym.g:1309:6: ()
            	            // InternalTym.g:1310:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,34,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalTym.g:1322:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalTym.g:1322:5: ( () otherlv_4= '-' )
            	            // InternalTym.g:1323:6: () otherlv_4= '-'
            	            {
            	            // InternalTym.g:1323:6: ()
            	            // InternalTym.g:1324:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,35,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalTym.g:1336:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalTym.g:1337:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalTym.g:1337:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalTym.g:1338:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.pkt.Tym.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalTym.g:1360:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalTym.g:1360:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalTym.g:1361:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalTym.g:1367:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTym.g:1373:2: ( (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTym.g:1374:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTym.g:1374:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTym.g:1375:3: this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTym.g:1383:3: ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=36 && LA28_0<=37)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTym.g:1384:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTym.g:1384:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) )
            	    // InternalTym.g:1385:5: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    {
            	    // InternalTym.g:1385:5: ()
            	    // InternalTym.g:1386:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalTym.g:1392:5: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalTym.g:1393:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalTym.g:1393:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalTym.g:1394:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalTym.g:1394:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==36) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==37) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalTym.g:1395:8: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMulOrDivRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTym.g:1406:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMulOrDivRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalTym.g:1420:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTym.g:1421:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTym.g:1421:5: (lv_right_3_0= rulePrimary )
            	    // InternalTym.g:1422:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.pkt.Tym.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalTym.g:1444:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTym.g:1444:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTym.g:1445:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalTym.g:1451:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalTym.g:1457:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalTym.g:1458:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalTym.g:1458:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt29=1;
                }
                break;
            case 38:
                {
                alt29=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 39:
            case 40:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalTym.g:1459:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalTym.g:1459:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalTym.g:1460:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTym.g:1478:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalTym.g:1478:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalTym.g:1479:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalTym.g:1479:4: ()
                    // InternalTym.g:1480:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalTym.g:1490:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalTym.g:1491:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalTym.g:1491:5: (lv_expression_5_0= rulePrimary )
                    // InternalTym.g:1492:6: lv_expression_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"org.pkt.Tym.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTym.g:1511:3: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalTym.g:1523:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalTym.g:1523:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalTym.g:1524:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalTym.g:1530:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTym.g:1536:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalTym.g:1537:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalTym.g:1537:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt31=1;
                }
                break;
            case RULE_STRING:
                {
                alt31=2;
                }
                break;
            case 39:
            case 40:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalTym.g:1538:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalTym.g:1538:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalTym.g:1539:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalTym.g:1539:4: ()
                    // InternalTym.g:1540:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTym.g:1546:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalTym.g:1547:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalTym.g:1547:5: (lv_value_1_0= RULE_INT )
                    // InternalTym.g:1548:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTym.g:1566:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalTym.g:1566:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalTym.g:1567:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalTym.g:1567:4: ()
                    // InternalTym.g:1568:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTym.g:1574:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalTym.g:1575:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalTym.g:1575:5: (lv_value_3_0= RULE_STRING )
                    // InternalTym.g:1576:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTym.g:1594:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalTym.g:1594:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalTym.g:1595:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalTym.g:1595:4: ()
                    // InternalTym.g:1596:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTym.g:1602:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalTym.g:1603:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalTym.g:1603:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalTym.g:1604:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalTym.g:1604:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==39) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==40) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalTym.g:1605:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTym.g:1616:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTym.g:1631:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalTym.g:1631:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalTym.g:1632:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalTym.g:1632:4: ()
                    // InternalTym.g:1633:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTym.g:1639:4: ( (otherlv_7= RULE_ID ) )
                    // InternalTym.g:1640:5: (otherlv_7= RULE_ID )
                    {
                    // InternalTym.g:1640:5: (otherlv_7= RULE_ID )
                    // InternalTym.g:1641:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // $ANTLR start synpred1_InternalTym
    public final void synpred1_InternalTym_fragment() throws RecognitionException {   
        // InternalTym.g:611:5: ( 'or' )
        // InternalTym.g:611:6: 'or'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTym

    // Delegated rules

    public final boolean synpred1_InternalTym() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTym_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000039F1012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001C0039F2070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000078010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000039F0010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003DF0010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000001C00000A070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001C000002070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});

}
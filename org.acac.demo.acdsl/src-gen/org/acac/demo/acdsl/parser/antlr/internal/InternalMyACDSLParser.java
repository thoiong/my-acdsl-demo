package org.acac.demo.acdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.acac.demo.acdsl.services.MyACDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyACDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'configuration'", "'of'", "'on'", "'OS,'", "'Server'", "'begin-common-parameters'", "'end-common-parameters'", "'begin-application-configuration'", "'end-application-configuration'", "'deployment'", "'operations:'", "'operation'", "'all'", "'commonParam'", "'dataSource'", "'jdbcProvider'", "'jaasAlias'", "'serverJvmSetting'", "'WebSphere'", "'Tomcat'", "'stop'", "'start'", "'restart'", "'Linux'", "'Win'", "'Aix'", "'uninstall'", "'install'", "'update'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


        public InternalMyACDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyACDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyACDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyACDSL.g"; }



     	private MyACDSLGrammarAccess grammarAccess;

        public InternalMyACDSLParser(TokenStream input, MyACDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyACDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyACDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyACDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyACDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyACDSL.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyACDSL.g:78:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalMyACDSL.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalMyACDSL.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==21||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyACDSL.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalMyACDSL.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalMyACDSL.g:81:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.acac.demo.acdsl.MyACDSL.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDOUBLE"
    // InternalMyACDSL.g:101:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalMyACDSL.g:101:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalMyACDSL.g:102:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalMyACDSL.g:108:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:114:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyACDSL.g:115:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyACDSL.g:115:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyACDSL.g:116:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,11,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalMyACDSL.g:139:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalMyACDSL.g:139:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalMyACDSL.g:140:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyACDSL.g:146:1: ruleAbstractElement returns [EObject current=null] : (this_Configuration_0= ruleConfiguration | this_Deployment_1= ruleDeployment | this_Operation_2= ruleOperation ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Configuration_0 = null;

        EObject this_Deployment_1 = null;

        EObject this_Operation_2 = null;



        	enterRule();

        try {
            // InternalMyACDSL.g:152:2: ( (this_Configuration_0= ruleConfiguration | this_Deployment_1= ruleDeployment | this_Operation_2= ruleOperation ) )
            // InternalMyACDSL.g:153:2: (this_Configuration_0= ruleConfiguration | this_Deployment_1= ruleDeployment | this_Operation_2= ruleOperation )
            {
            // InternalMyACDSL.g:153:2: (this_Configuration_0= ruleConfiguration | this_Deployment_1= ruleDeployment | this_Operation_2= ruleOperation )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyACDSL.g:154:3: this_Configuration_0= ruleConfiguration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getConfigurationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Configuration_0=ruleConfiguration();

                    state._fsp--;


                    			current = this_Configuration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyACDSL.g:163:3: this_Deployment_1= ruleDeployment
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getDeploymentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Deployment_1=ruleDeployment();

                    state._fsp--;


                    			current = this_Deployment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyACDSL.g:172:3: this_Operation_2= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_2=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleConfiguration"
    // InternalMyACDSL.g:184:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalMyACDSL.g:184:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalMyACDSL.g:185:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalMyACDSL.g:191:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' otherlv_1= 'of' ( (lv_appName_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_os_4_0= ruleSupportedOs ) ) otherlv_5= 'OS,' ( (lv_appServer_6_0= ruleAppServerInfo ) ) otherlv_7= 'Server' otherlv_8= 'begin-common-parameters' ( (lv_commonParams_9_0= ruleCommonParam ) )* otherlv_10= 'end-common-parameters' otherlv_11= 'begin-application-configuration' ( (lv_configurations_12_0= ruleConfigurationType ) )* otherlv_13= 'end-application-configuration' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_appName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_os_4_0 = null;

        EObject lv_appServer_6_0 = null;

        EObject lv_commonParams_9_0 = null;

        EObject lv_configurations_12_0 = null;



        	enterRule();

        try {
            // InternalMyACDSL.g:197:2: ( (otherlv_0= 'configuration' otherlv_1= 'of' ( (lv_appName_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_os_4_0= ruleSupportedOs ) ) otherlv_5= 'OS,' ( (lv_appServer_6_0= ruleAppServerInfo ) ) otherlv_7= 'Server' otherlv_8= 'begin-common-parameters' ( (lv_commonParams_9_0= ruleCommonParam ) )* otherlv_10= 'end-common-parameters' otherlv_11= 'begin-application-configuration' ( (lv_configurations_12_0= ruleConfigurationType ) )* otherlv_13= 'end-application-configuration' ) )
            // InternalMyACDSL.g:198:2: (otherlv_0= 'configuration' otherlv_1= 'of' ( (lv_appName_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_os_4_0= ruleSupportedOs ) ) otherlv_5= 'OS,' ( (lv_appServer_6_0= ruleAppServerInfo ) ) otherlv_7= 'Server' otherlv_8= 'begin-common-parameters' ( (lv_commonParams_9_0= ruleCommonParam ) )* otherlv_10= 'end-common-parameters' otherlv_11= 'begin-application-configuration' ( (lv_configurations_12_0= ruleConfigurationType ) )* otherlv_13= 'end-application-configuration' )
            {
            // InternalMyACDSL.g:198:2: (otherlv_0= 'configuration' otherlv_1= 'of' ( (lv_appName_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_os_4_0= ruleSupportedOs ) ) otherlv_5= 'OS,' ( (lv_appServer_6_0= ruleAppServerInfo ) ) otherlv_7= 'Server' otherlv_8= 'begin-common-parameters' ( (lv_commonParams_9_0= ruleCommonParam ) )* otherlv_10= 'end-common-parameters' otherlv_11= 'begin-application-configuration' ( (lv_configurations_12_0= ruleConfigurationType ) )* otherlv_13= 'end-application-configuration' )
            // InternalMyACDSL.g:199:3: otherlv_0= 'configuration' otherlv_1= 'of' ( (lv_appName_2_0= RULE_ID ) ) otherlv_3= 'on' ( (lv_os_4_0= ruleSupportedOs ) ) otherlv_5= 'OS,' ( (lv_appServer_6_0= ruleAppServerInfo ) ) otherlv_7= 'Server' otherlv_8= 'begin-common-parameters' ( (lv_commonParams_9_0= ruleCommonParam ) )* otherlv_10= 'end-common-parameters' otherlv_11= 'begin-application-configuration' ( (lv_configurations_12_0= ruleConfigurationType ) )* otherlv_13= 'end-application-configuration'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getOfKeyword_1());
            		
            // InternalMyACDSL.g:207:3: ( (lv_appName_2_0= RULE_ID ) )
            // InternalMyACDSL.g:208:4: (lv_appName_2_0= RULE_ID )
            {
            // InternalMyACDSL.g:208:4: (lv_appName_2_0= RULE_ID )
            // InternalMyACDSL.g:209:5: lv_appName_2_0= RULE_ID
            {
            lv_appName_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_appName_2_0, grammarAccess.getConfigurationAccess().getAppNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appName",
            						lv_appName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getOnKeyword_3());
            		
            // InternalMyACDSL.g:229:3: ( (lv_os_4_0= ruleSupportedOs ) )
            // InternalMyACDSL.g:230:4: (lv_os_4_0= ruleSupportedOs )
            {
            // InternalMyACDSL.g:230:4: (lv_os_4_0= ruleSupportedOs )
            // InternalMyACDSL.g:231:5: lv_os_4_0= ruleSupportedOs
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getOsSupportedOsEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_os_4_0=ruleSupportedOs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"os",
            						lv_os_4_0,
            						"org.acac.demo.acdsl.MyACDSL.SupportedOs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getOSKeyword_5());
            		
            // InternalMyACDSL.g:252:3: ( (lv_appServer_6_0= ruleAppServerInfo ) )
            // InternalMyACDSL.g:253:4: (lv_appServer_6_0= ruleAppServerInfo )
            {
            // InternalMyACDSL.g:253:4: (lv_appServer_6_0= ruleAppServerInfo )
            // InternalMyACDSL.g:254:5: lv_appServer_6_0= ruleAppServerInfo
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getAppServerAppServerInfoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_appServer_6_0=ruleAppServerInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"appServer",
            						lv_appServer_6_0,
            						"org.acac.demo.acdsl.MyACDSL.AppServerInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getServerKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getBeginCommonParametersKeyword_8());
            		
            // InternalMyACDSL.g:279:3: ( (lv_commonParams_9_0= ruleCommonParam ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyACDSL.g:280:4: (lv_commonParams_9_0= ruleCommonParam )
            	    {
            	    // InternalMyACDSL.g:280:4: (lv_commonParams_9_0= ruleCommonParam )
            	    // InternalMyACDSL.g:281:5: lv_commonParams_9_0= ruleCommonParam
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getCommonParamsCommonParamParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_commonParams_9_0=ruleCommonParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commonParams",
            	    						lv_commonParams_9_0,
            	    						"org.acac.demo.acdsl.MyACDSL.CommonParam");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getEndCommonParametersKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getConfigurationAccess().getBeginApplicationConfigurationKeyword_11());
            		
            // InternalMyACDSL.g:306:3: ( (lv_configurations_12_0= ruleConfigurationType ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=26 && LA4_0<=29)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyACDSL.g:307:4: (lv_configurations_12_0= ruleConfigurationType )
            	    {
            	    // InternalMyACDSL.g:307:4: (lv_configurations_12_0= ruleConfigurationType )
            	    // InternalMyACDSL.g:308:5: lv_configurations_12_0= ruleConfigurationType
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getConfigurationsConfigurationTypeParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_configurations_12_0=ruleConfigurationType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configurations",
            	    						lv_configurations_12_0,
            	    						"org.acac.demo.acdsl.MyACDSL.ConfigurationType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getConfigurationAccess().getEndApplicationConfigurationKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleDeployment"
    // InternalMyACDSL.g:333:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalMyACDSL.g:333:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalMyACDSL.g:334:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalMyACDSL.g:340:1: ruleDeployment returns [EObject current=null] : ( () otherlv_1= 'deployment' otherlv_2= 'operations:' ( (lv_appOp_3_0= ruleDeploymentOp ) )* ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_appOp_3_0 = null;



        	enterRule();

        try {
            // InternalMyACDSL.g:346:2: ( ( () otherlv_1= 'deployment' otherlv_2= 'operations:' ( (lv_appOp_3_0= ruleDeploymentOp ) )* ) )
            // InternalMyACDSL.g:347:2: ( () otherlv_1= 'deployment' otherlv_2= 'operations:' ( (lv_appOp_3_0= ruleDeploymentOp ) )* )
            {
            // InternalMyACDSL.g:347:2: ( () otherlv_1= 'deployment' otherlv_2= 'operations:' ( (lv_appOp_3_0= ruleDeploymentOp ) )* )
            // InternalMyACDSL.g:348:3: () otherlv_1= 'deployment' otherlv_2= 'operations:' ( (lv_appOp_3_0= ruleDeploymentOp ) )*
            {
            // InternalMyACDSL.g:348:3: ()
            // InternalMyACDSL.g:349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeploymentAccess().getDeploymentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDeploymentAccess().getDeploymentKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getOperationsKeyword_2());
            		
            // InternalMyACDSL.g:363:3: ( (lv_appOp_3_0= ruleDeploymentOp ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=38 && LA5_0<=40)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyACDSL.g:364:4: (lv_appOp_3_0= ruleDeploymentOp )
            	    {
            	    // InternalMyACDSL.g:364:4: (lv_appOp_3_0= ruleDeploymentOp )
            	    // InternalMyACDSL.g:365:5: lv_appOp_3_0= ruleDeploymentOp
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentAccess().getAppOpDeploymentOpEnumRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_appOp_3_0=ruleDeploymentOp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"appOp",
            	    						lv_appOp_3_0,
            	    						"org.acac.demo.acdsl.MyACDSL.DeploymentOp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleOperation"
    // InternalMyACDSL.g:386:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMyACDSL.g:386:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyACDSL.g:387:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyACDSL.g:393:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_serverOp_2_0= ruleSupportedContainerOperations ) )* ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_serverOp_2_0 = null;



        	enterRule();

        try {
            // InternalMyACDSL.g:399:2: ( ( () otherlv_1= 'operation' ( (lv_serverOp_2_0= ruleSupportedContainerOperations ) )* ) )
            // InternalMyACDSL.g:400:2: ( () otherlv_1= 'operation' ( (lv_serverOp_2_0= ruleSupportedContainerOperations ) )* )
            {
            // InternalMyACDSL.g:400:2: ( () otherlv_1= 'operation' ( (lv_serverOp_2_0= ruleSupportedContainerOperations ) )* )
            // InternalMyACDSL.g:401:3: () otherlv_1= 'operation' ( (lv_serverOp_2_0= ruleSupportedContainerOperations ) )*
            {
            // InternalMyACDSL.g:401:3: ()
            // InternalMyACDSL.g:402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
            		
            // InternalMyACDSL.g:412:3: ( (lv_serverOp_2_0= ruleSupportedContainerOperations ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=32 && LA6_0<=34)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyACDSL.g:413:4: (lv_serverOp_2_0= ruleSupportedContainerOperations )
            	    {
            	    // InternalMyACDSL.g:413:4: (lv_serverOp_2_0= ruleSupportedContainerOperations )
            	    // InternalMyACDSL.g:414:5: lv_serverOp_2_0= ruleSupportedContainerOperations
            	    {

            	    					newCompositeNode(grammarAccess.getOperationAccess().getServerOpSupportedContainerOperationsEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_serverOp_2_0=ruleSupportedContainerOperations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"serverOp",
            	    						lv_serverOp_2_0,
            	    						"org.acac.demo.acdsl.MyACDSL.SupportedContainerOperations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAppServerInfo"
    // InternalMyACDSL.g:435:1: entryRuleAppServerInfo returns [EObject current=null] : iv_ruleAppServerInfo= ruleAppServerInfo EOF ;
    public final EObject entryRuleAppServerInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppServerInfo = null;


        try {
            // InternalMyACDSL.g:435:54: (iv_ruleAppServerInfo= ruleAppServerInfo EOF )
            // InternalMyACDSL.g:436:2: iv_ruleAppServerInfo= ruleAppServerInfo EOF
            {
             newCompositeNode(grammarAccess.getAppServerInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppServerInfo=ruleAppServerInfo();

            state._fsp--;

             current =iv_ruleAppServerInfo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAppServerInfo"


    // $ANTLR start "ruleAppServerInfo"
    // InternalMyACDSL.g:442:1: ruleAppServerInfo returns [EObject current=null] : ( ( (lv_name_0_0= ruleSupportedContainer ) ) | (otherlv_1= 'all' ( (lv_version_2_0= ruleDOUBLE ) ) ) ) ;
    public final EObject ruleAppServerInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_version_2_0 = null;



        	enterRule();

        try {
            // InternalMyACDSL.g:448:2: ( ( ( (lv_name_0_0= ruleSupportedContainer ) ) | (otherlv_1= 'all' ( (lv_version_2_0= ruleDOUBLE ) ) ) ) )
            // InternalMyACDSL.g:449:2: ( ( (lv_name_0_0= ruleSupportedContainer ) ) | (otherlv_1= 'all' ( (lv_version_2_0= ruleDOUBLE ) ) ) )
            {
            // InternalMyACDSL.g:449:2: ( ( (lv_name_0_0= ruleSupportedContainer ) ) | (otherlv_1= 'all' ( (lv_version_2_0= ruleDOUBLE ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=30 && LA7_0<=31)) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyACDSL.g:450:3: ( (lv_name_0_0= ruleSupportedContainer ) )
                    {
                    // InternalMyACDSL.g:450:3: ( (lv_name_0_0= ruleSupportedContainer ) )
                    // InternalMyACDSL.g:451:4: (lv_name_0_0= ruleSupportedContainer )
                    {
                    // InternalMyACDSL.g:451:4: (lv_name_0_0= ruleSupportedContainer )
                    // InternalMyACDSL.g:452:5: lv_name_0_0= ruleSupportedContainer
                    {

                    					newCompositeNode(grammarAccess.getAppServerInfoAccess().getNameSupportedContainerEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_0=ruleSupportedContainer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppServerInfoRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.acac.demo.acdsl.MyACDSL.SupportedContainer");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyACDSL.g:470:3: (otherlv_1= 'all' ( (lv_version_2_0= ruleDOUBLE ) ) )
                    {
                    // InternalMyACDSL.g:470:3: (otherlv_1= 'all' ( (lv_version_2_0= ruleDOUBLE ) ) )
                    // InternalMyACDSL.g:471:4: otherlv_1= 'all' ( (lv_version_2_0= ruleDOUBLE ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getAppServerInfoAccess().getAllKeyword_1_0());
                    			
                    // InternalMyACDSL.g:475:4: ( (lv_version_2_0= ruleDOUBLE ) )
                    // InternalMyACDSL.g:476:5: (lv_version_2_0= ruleDOUBLE )
                    {
                    // InternalMyACDSL.g:476:5: (lv_version_2_0= ruleDOUBLE )
                    // InternalMyACDSL.g:477:6: lv_version_2_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getAppServerInfoAccess().getVersionDOUBLEParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_version_2_0=ruleDOUBLE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppServerInfoRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_2_0,
                    							"org.acac.demo.acdsl.MyACDSL.DOUBLE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppServerInfo"


    // $ANTLR start "entryRuleCommonParam"
    // InternalMyACDSL.g:499:1: entryRuleCommonParam returns [EObject current=null] : iv_ruleCommonParam= ruleCommonParam EOF ;
    public final EObject entryRuleCommonParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonParam = null;


        try {
            // InternalMyACDSL.g:499:52: (iv_ruleCommonParam= ruleCommonParam EOF )
            // InternalMyACDSL.g:500:2: iv_ruleCommonParam= ruleCommonParam EOF
            {
             newCompositeNode(grammarAccess.getCommonParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonParam=ruleCommonParam();

            state._fsp--;

             current =iv_ruleCommonParam; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommonParam"


    // $ANTLR start "ruleCommonParam"
    // InternalMyACDSL.g:506:1: ruleCommonParam returns [EObject current=null] : (otherlv_0= 'commonParam' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCommonParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:512:2: ( (otherlv_0= 'commonParam' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyACDSL.g:513:2: (otherlv_0= 'commonParam' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyACDSL.g:513:2: (otherlv_0= 'commonParam' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyACDSL.g:514:3: otherlv_0= 'commonParam' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCommonParamAccess().getCommonParamKeyword_0());
            		
            // InternalMyACDSL.g:518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyACDSL.g:519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyACDSL.g:519:4: (lv_name_1_0= RULE_ID )
            // InternalMyACDSL.g:520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCommonParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyACDSL.g:536:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyACDSL.g:537:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyACDSL.g:537:4: (lv_value_2_0= RULE_STRING )
            // InternalMyACDSL.g:538:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getCommonParamAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonParam"


    // $ANTLR start "entryRuleConfigurationType"
    // InternalMyACDSL.g:558:1: entryRuleConfigurationType returns [EObject current=null] : iv_ruleConfigurationType= ruleConfigurationType EOF ;
    public final EObject entryRuleConfigurationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationType = null;


        try {
            // InternalMyACDSL.g:558:58: (iv_ruleConfigurationType= ruleConfigurationType EOF )
            // InternalMyACDSL.g:559:2: iv_ruleConfigurationType= ruleConfigurationType EOF
            {
             newCompositeNode(grammarAccess.getConfigurationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationType=ruleConfigurationType();

            state._fsp--;

             current =iv_ruleConfigurationType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfigurationType"


    // $ANTLR start "ruleConfigurationType"
    // InternalMyACDSL.g:565:1: ruleConfigurationType returns [EObject current=null] : (this_ServerJvmSetting_0= ruleServerJvmSetting | this_JAASAlias_1= ruleJAASAlias | this_JdbcProvider_2= ruleJdbcProvider | this_DataSource_3= ruleDataSource ) ;
    public final EObject ruleConfigurationType() throws RecognitionException {
        EObject current = null;

        EObject this_ServerJvmSetting_0 = null;

        EObject this_JAASAlias_1 = null;

        EObject this_JdbcProvider_2 = null;

        EObject this_DataSource_3 = null;



        	enterRule();

        try {
            // InternalMyACDSL.g:571:2: ( (this_ServerJvmSetting_0= ruleServerJvmSetting | this_JAASAlias_1= ruleJAASAlias | this_JdbcProvider_2= ruleJdbcProvider | this_DataSource_3= ruleDataSource ) )
            // InternalMyACDSL.g:572:2: (this_ServerJvmSetting_0= ruleServerJvmSetting | this_JAASAlias_1= ruleJAASAlias | this_JdbcProvider_2= ruleJdbcProvider | this_DataSource_3= ruleDataSource )
            {
            // InternalMyACDSL.g:572:2: (this_ServerJvmSetting_0= ruleServerJvmSetting | this_JAASAlias_1= ruleJAASAlias | this_JdbcProvider_2= ruleJdbcProvider | this_DataSource_3= ruleDataSource )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyACDSL.g:573:3: this_ServerJvmSetting_0= ruleServerJvmSetting
                    {

                    			newCompositeNode(grammarAccess.getConfigurationTypeAccess().getServerJvmSettingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServerJvmSetting_0=ruleServerJvmSetting();

                    state._fsp--;


                    			current = this_ServerJvmSetting_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyACDSL.g:582:3: this_JAASAlias_1= ruleJAASAlias
                    {

                    			newCompositeNode(grammarAccess.getConfigurationTypeAccess().getJAASAliasParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JAASAlias_1=ruleJAASAlias();

                    state._fsp--;


                    			current = this_JAASAlias_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyACDSL.g:591:3: this_JdbcProvider_2= ruleJdbcProvider
                    {

                    			newCompositeNode(grammarAccess.getConfigurationTypeAccess().getJdbcProviderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JdbcProvider_2=ruleJdbcProvider();

                    state._fsp--;


                    			current = this_JdbcProvider_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyACDSL.g:600:3: this_DataSource_3= ruleDataSource
                    {

                    			newCompositeNode(grammarAccess.getConfigurationTypeAccess().getDataSourceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataSource_3=ruleDataSource();

                    state._fsp--;


                    			current = this_DataSource_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationType"


    // $ANTLR start "entryRuleDataSource"
    // InternalMyACDSL.g:612:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalMyACDSL.g:612:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalMyACDSL.g:613:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalMyACDSL.g:619:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'dataSource' ( (otherlv_1= RULE_ID ) ) ( (lv_dataSourceName_2_0= RULE_STRING ) ) ( (lv_jndiName_3_0= RULE_STRING ) ) ( (lv_jdbcProviderName_4_0= RULE_STRING ) ) ( (lv_dataSourceUrl_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dataSourceName_2_0=null;
        Token lv_jndiName_3_0=null;
        Token lv_jdbcProviderName_4_0=null;
        Token lv_dataSourceUrl_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:625:2: ( (otherlv_0= 'dataSource' ( (otherlv_1= RULE_ID ) ) ( (lv_dataSourceName_2_0= RULE_STRING ) ) ( (lv_jndiName_3_0= RULE_STRING ) ) ( (lv_jdbcProviderName_4_0= RULE_STRING ) ) ( (lv_dataSourceUrl_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) ) )
            // InternalMyACDSL.g:626:2: (otherlv_0= 'dataSource' ( (otherlv_1= RULE_ID ) ) ( (lv_dataSourceName_2_0= RULE_STRING ) ) ( (lv_jndiName_3_0= RULE_STRING ) ) ( (lv_jdbcProviderName_4_0= RULE_STRING ) ) ( (lv_dataSourceUrl_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalMyACDSL.g:626:2: (otherlv_0= 'dataSource' ( (otherlv_1= RULE_ID ) ) ( (lv_dataSourceName_2_0= RULE_STRING ) ) ( (lv_jndiName_3_0= RULE_STRING ) ) ( (lv_jdbcProviderName_4_0= RULE_STRING ) ) ( (lv_dataSourceUrl_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )
            // InternalMyACDSL.g:627:3: otherlv_0= 'dataSource' ( (otherlv_1= RULE_ID ) ) ( (lv_dataSourceName_2_0= RULE_STRING ) ) ( (lv_jndiName_3_0= RULE_STRING ) ) ( (lv_jdbcProviderName_4_0= RULE_STRING ) ) ( (lv_dataSourceUrl_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDataSourceKeyword_0());
            		
            // InternalMyACDSL.g:631:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyACDSL.g:632:4: (otherlv_1= RULE_ID )
            {
            // InternalMyACDSL.g:632:4: (otherlv_1= RULE_ID )
            // InternalMyACDSL.g:633:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getDataSourceAccess().getScopeCommonParamCrossReference_1_0());
            				

            }


            }

            // InternalMyACDSL.g:644:3: ( (lv_dataSourceName_2_0= RULE_STRING ) )
            // InternalMyACDSL.g:645:4: (lv_dataSourceName_2_0= RULE_STRING )
            {
            // InternalMyACDSL.g:645:4: (lv_dataSourceName_2_0= RULE_STRING )
            // InternalMyACDSL.g:646:5: lv_dataSourceName_2_0= RULE_STRING
            {
            lv_dataSourceName_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_dataSourceName_2_0, grammarAccess.getDataSourceAccess().getDataSourceNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataSourceName",
            						lv_dataSourceName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:662:3: ( (lv_jndiName_3_0= RULE_STRING ) )
            // InternalMyACDSL.g:663:4: (lv_jndiName_3_0= RULE_STRING )
            {
            // InternalMyACDSL.g:663:4: (lv_jndiName_3_0= RULE_STRING )
            // InternalMyACDSL.g:664:5: lv_jndiName_3_0= RULE_STRING
            {
            lv_jndiName_3_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_jndiName_3_0, grammarAccess.getDataSourceAccess().getJndiNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"jndiName",
            						lv_jndiName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:680:3: ( (lv_jdbcProviderName_4_0= RULE_STRING ) )
            // InternalMyACDSL.g:681:4: (lv_jdbcProviderName_4_0= RULE_STRING )
            {
            // InternalMyACDSL.g:681:4: (lv_jdbcProviderName_4_0= RULE_STRING )
            // InternalMyACDSL.g:682:5: lv_jdbcProviderName_4_0= RULE_STRING
            {
            lv_jdbcProviderName_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_jdbcProviderName_4_0, grammarAccess.getDataSourceAccess().getJdbcProviderNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"jdbcProviderName",
            						lv_jdbcProviderName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:698:3: ( (lv_dataSourceUrl_5_0= RULE_STRING ) )
            // InternalMyACDSL.g:699:4: (lv_dataSourceUrl_5_0= RULE_STRING )
            {
            // InternalMyACDSL.g:699:4: (lv_dataSourceUrl_5_0= RULE_STRING )
            // InternalMyACDSL.g:700:5: lv_dataSourceUrl_5_0= RULE_STRING
            {
            lv_dataSourceUrl_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_dataSourceUrl_5_0, grammarAccess.getDataSourceAccess().getDataSourceUrlSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataSourceUrl",
            						lv_dataSourceUrl_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:716:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyACDSL.g:717:4: (otherlv_6= RULE_ID )
            {
            // InternalMyACDSL.g:717:4: (otherlv_6= RULE_ID )
            // InternalMyACDSL.g:718:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getComponentManagedAuthenticationAliasCommonParamCrossReference_6_0());
            				

            }


            }

            // InternalMyACDSL.g:729:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyACDSL.g:730:4: (otherlv_7= RULE_ID )
            {
            // InternalMyACDSL.g:730:4: (otherlv_7= RULE_ID )
            // InternalMyACDSL.g:731:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_7, grammarAccess.getDataSourceAccess().getMappingConfigurationAliasCommonParamCrossReference_7_0());
            				

            }


            }

            // InternalMyACDSL.g:742:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyACDSL.g:743:4: (otherlv_8= RULE_ID )
            {
            // InternalMyACDSL.g:743:4: (otherlv_8= RULE_ID )
            // InternalMyACDSL.g:744:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_8, grammarAccess.getDataSourceAccess().getContainerMmanagedAuthenticationAliasCommonParamCrossReference_8_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleJdbcProvider"
    // InternalMyACDSL.g:759:1: entryRuleJdbcProvider returns [EObject current=null] : iv_ruleJdbcProvider= ruleJdbcProvider EOF ;
    public final EObject entryRuleJdbcProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJdbcProvider = null;


        try {
            // InternalMyACDSL.g:759:53: (iv_ruleJdbcProvider= ruleJdbcProvider EOF )
            // InternalMyACDSL.g:760:2: iv_ruleJdbcProvider= ruleJdbcProvider EOF
            {
             newCompositeNode(grammarAccess.getJdbcProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJdbcProvider=ruleJdbcProvider();

            state._fsp--;

             current =iv_ruleJdbcProvider; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJdbcProvider"


    // $ANTLR start "ruleJdbcProvider"
    // InternalMyACDSL.g:766:1: ruleJdbcProvider returns [EObject current=null] : (otherlv_0= 'jdbcProvider' ( (otherlv_1= RULE_ID ) ) ( (lv_databaseType_2_0= RULE_STRING ) ) ( (lv_providerType_3_0= RULE_STRING ) ) ( (lv_implementationType_4_0= RULE_STRING ) ) ( (lv_name_5_0= RULE_STRING ) ) ( (lv_description_6_0= RULE_STRING ) ) ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleJdbcProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_databaseType_2_0=null;
        Token lv_providerType_3_0=null;
        Token lv_implementationType_4_0=null;
        Token lv_name_5_0=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:772:2: ( (otherlv_0= 'jdbcProvider' ( (otherlv_1= RULE_ID ) ) ( (lv_databaseType_2_0= RULE_STRING ) ) ( (lv_providerType_3_0= RULE_STRING ) ) ( (lv_implementationType_4_0= RULE_STRING ) ) ( (lv_name_5_0= RULE_STRING ) ) ( (lv_description_6_0= RULE_STRING ) ) ( (otherlv_7= RULE_ID ) ) ) )
            // InternalMyACDSL.g:773:2: (otherlv_0= 'jdbcProvider' ( (otherlv_1= RULE_ID ) ) ( (lv_databaseType_2_0= RULE_STRING ) ) ( (lv_providerType_3_0= RULE_STRING ) ) ( (lv_implementationType_4_0= RULE_STRING ) ) ( (lv_name_5_0= RULE_STRING ) ) ( (lv_description_6_0= RULE_STRING ) ) ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalMyACDSL.g:773:2: (otherlv_0= 'jdbcProvider' ( (otherlv_1= RULE_ID ) ) ( (lv_databaseType_2_0= RULE_STRING ) ) ( (lv_providerType_3_0= RULE_STRING ) ) ( (lv_implementationType_4_0= RULE_STRING ) ) ( (lv_name_5_0= RULE_STRING ) ) ( (lv_description_6_0= RULE_STRING ) ) ( (otherlv_7= RULE_ID ) ) )
            // InternalMyACDSL.g:774:3: otherlv_0= 'jdbcProvider' ( (otherlv_1= RULE_ID ) ) ( (lv_databaseType_2_0= RULE_STRING ) ) ( (lv_providerType_3_0= RULE_STRING ) ) ( (lv_implementationType_4_0= RULE_STRING ) ) ( (lv_name_5_0= RULE_STRING ) ) ( (lv_description_6_0= RULE_STRING ) ) ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJdbcProviderAccess().getJdbcProviderKeyword_0());
            		
            // InternalMyACDSL.g:778:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyACDSL.g:779:4: (otherlv_1= RULE_ID )
            {
            // InternalMyACDSL.g:779:4: (otherlv_1= RULE_ID )
            // InternalMyACDSL.g:780:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJdbcProviderRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getJdbcProviderAccess().getScopeCommonParamCrossReference_1_0());
            				

            }


            }

            // InternalMyACDSL.g:791:3: ( (lv_databaseType_2_0= RULE_STRING ) )
            // InternalMyACDSL.g:792:4: (lv_databaseType_2_0= RULE_STRING )
            {
            // InternalMyACDSL.g:792:4: (lv_databaseType_2_0= RULE_STRING )
            // InternalMyACDSL.g:793:5: lv_databaseType_2_0= RULE_STRING
            {
            lv_databaseType_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_databaseType_2_0, grammarAccess.getJdbcProviderAccess().getDatabaseTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJdbcProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"databaseType",
            						lv_databaseType_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:809:3: ( (lv_providerType_3_0= RULE_STRING ) )
            // InternalMyACDSL.g:810:4: (lv_providerType_3_0= RULE_STRING )
            {
            // InternalMyACDSL.g:810:4: (lv_providerType_3_0= RULE_STRING )
            // InternalMyACDSL.g:811:5: lv_providerType_3_0= RULE_STRING
            {
            lv_providerType_3_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_providerType_3_0, grammarAccess.getJdbcProviderAccess().getProviderTypeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJdbcProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"providerType",
            						lv_providerType_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:827:3: ( (lv_implementationType_4_0= RULE_STRING ) )
            // InternalMyACDSL.g:828:4: (lv_implementationType_4_0= RULE_STRING )
            {
            // InternalMyACDSL.g:828:4: (lv_implementationType_4_0= RULE_STRING )
            // InternalMyACDSL.g:829:5: lv_implementationType_4_0= RULE_STRING
            {
            lv_implementationType_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_implementationType_4_0, grammarAccess.getJdbcProviderAccess().getImplementationTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJdbcProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"implementationType",
            						lv_implementationType_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:845:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalMyACDSL.g:846:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalMyACDSL.g:846:4: (lv_name_5_0= RULE_STRING )
            // InternalMyACDSL.g:847:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_name_5_0, grammarAccess.getJdbcProviderAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJdbcProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:863:3: ( (lv_description_6_0= RULE_STRING ) )
            // InternalMyACDSL.g:864:4: (lv_description_6_0= RULE_STRING )
            {
            // InternalMyACDSL.g:864:4: (lv_description_6_0= RULE_STRING )
            // InternalMyACDSL.g:865:5: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_description_6_0, grammarAccess.getJdbcProviderAccess().getDescriptionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJdbcProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:881:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyACDSL.g:882:4: (otherlv_7= RULE_ID )
            {
            // InternalMyACDSL.g:882:4: (otherlv_7= RULE_ID )
            // InternalMyACDSL.g:883:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJdbcProviderRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getJdbcProviderAccess().getClasspathCommonParamCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJdbcProvider"


    // $ANTLR start "entryRuleJAASAlias"
    // InternalMyACDSL.g:898:1: entryRuleJAASAlias returns [EObject current=null] : iv_ruleJAASAlias= ruleJAASAlias EOF ;
    public final EObject entryRuleJAASAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJAASAlias = null;


        try {
            // InternalMyACDSL.g:898:50: (iv_ruleJAASAlias= ruleJAASAlias EOF )
            // InternalMyACDSL.g:899:2: iv_ruleJAASAlias= ruleJAASAlias EOF
            {
             newCompositeNode(grammarAccess.getJAASAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJAASAlias=ruleJAASAlias();

            state._fsp--;

             current =iv_ruleJAASAlias; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJAASAlias"


    // $ANTLR start "ruleJAASAlias"
    // InternalMyACDSL.g:905:1: ruleJAASAlias returns [EObject current=null] : (otherlv_0= 'jaasAlias' ( (otherlv_1= RULE_ID ) ) ( (lv_username_2_0= RULE_STRING ) ) ( (lv_password_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleJAASAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_username_2_0=null;
        Token lv_password_3_0=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:911:2: ( (otherlv_0= 'jaasAlias' ( (otherlv_1= RULE_ID ) ) ( (lv_username_2_0= RULE_STRING ) ) ( (lv_password_3_0= RULE_STRING ) ) ) )
            // InternalMyACDSL.g:912:2: (otherlv_0= 'jaasAlias' ( (otherlv_1= RULE_ID ) ) ( (lv_username_2_0= RULE_STRING ) ) ( (lv_password_3_0= RULE_STRING ) ) )
            {
            // InternalMyACDSL.g:912:2: (otherlv_0= 'jaasAlias' ( (otherlv_1= RULE_ID ) ) ( (lv_username_2_0= RULE_STRING ) ) ( (lv_password_3_0= RULE_STRING ) ) )
            // InternalMyACDSL.g:913:3: otherlv_0= 'jaasAlias' ( (otherlv_1= RULE_ID ) ) ( (lv_username_2_0= RULE_STRING ) ) ( (lv_password_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJAASAliasAccess().getJaasAliasKeyword_0());
            		
            // InternalMyACDSL.g:917:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyACDSL.g:918:4: (otherlv_1= RULE_ID )
            {
            // InternalMyACDSL.g:918:4: (otherlv_1= RULE_ID )
            // InternalMyACDSL.g:919:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJAASAliasRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getJAASAliasAccess().getAliasCommonParamCrossReference_1_0());
            				

            }


            }

            // InternalMyACDSL.g:930:3: ( (lv_username_2_0= RULE_STRING ) )
            // InternalMyACDSL.g:931:4: (lv_username_2_0= RULE_STRING )
            {
            // InternalMyACDSL.g:931:4: (lv_username_2_0= RULE_STRING )
            // InternalMyACDSL.g:932:5: lv_username_2_0= RULE_STRING
            {
            lv_username_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_username_2_0, grammarAccess.getJAASAliasAccess().getUsernameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJAASAliasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:948:3: ( (lv_password_3_0= RULE_STRING ) )
            // InternalMyACDSL.g:949:4: (lv_password_3_0= RULE_STRING )
            {
            // InternalMyACDSL.g:949:4: (lv_password_3_0= RULE_STRING )
            // InternalMyACDSL.g:950:5: lv_password_3_0= RULE_STRING
            {
            lv_password_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_password_3_0, grammarAccess.getJAASAliasAccess().getPasswordSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJAASAliasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJAASAlias"


    // $ANTLR start "entryRuleServerJvmSetting"
    // InternalMyACDSL.g:970:1: entryRuleServerJvmSetting returns [EObject current=null] : iv_ruleServerJvmSetting= ruleServerJvmSetting EOF ;
    public final EObject entryRuleServerJvmSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerJvmSetting = null;


        try {
            // InternalMyACDSL.g:970:57: (iv_ruleServerJvmSetting= ruleServerJvmSetting EOF )
            // InternalMyACDSL.g:971:2: iv_ruleServerJvmSetting= ruleServerJvmSetting EOF
            {
             newCompositeNode(grammarAccess.getServerJvmSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerJvmSetting=ruleServerJvmSetting();

            state._fsp--;

             current =iv_ruleServerJvmSetting; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServerJvmSetting"


    // $ANTLR start "ruleServerJvmSetting"
    // InternalMyACDSL.g:977:1: ruleServerJvmSetting returns [EObject current=null] : (otherlv_0= 'serverJvmSetting' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleServerJvmSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:983:2: ( (otherlv_0= 'serverJvmSetting' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyACDSL.g:984:2: (otherlv_0= 'serverJvmSetting' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyACDSL.g:984:2: (otherlv_0= 'serverJvmSetting' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyACDSL.g:985:3: otherlv_0= 'serverJvmSetting' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getServerJvmSettingAccess().getServerJvmSettingKeyword_0());
            		
            // InternalMyACDSL.g:989:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyACDSL.g:990:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyACDSL.g:990:4: (lv_name_1_0= RULE_STRING )
            // InternalMyACDSL.g:991:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServerJvmSettingAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerJvmSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyACDSL.g:1007:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyACDSL.g:1008:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyACDSL.g:1008:4: (lv_value_2_0= RULE_STRING )
            // InternalMyACDSL.g:1009:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getServerJvmSettingAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerJvmSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServerJvmSetting"


    // $ANTLR start "ruleSupportedContainer"
    // InternalMyACDSL.g:1029:1: ruleSupportedContainer returns [Enumerator current=null] : ( (enumLiteral_0= 'WebSphere' ) | (enumLiteral_1= 'Tomcat' ) ) ;
    public final Enumerator ruleSupportedContainer() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:1035:2: ( ( (enumLiteral_0= 'WebSphere' ) | (enumLiteral_1= 'Tomcat' ) ) )
            // InternalMyACDSL.g:1036:2: ( (enumLiteral_0= 'WebSphere' ) | (enumLiteral_1= 'Tomcat' ) )
            {
            // InternalMyACDSL.g:1036:2: ( (enumLiteral_0= 'WebSphere' ) | (enumLiteral_1= 'Tomcat' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyACDSL.g:1037:3: (enumLiteral_0= 'WebSphere' )
                    {
                    // InternalMyACDSL.g:1037:3: (enumLiteral_0= 'WebSphere' )
                    // InternalMyACDSL.g:1038:4: enumLiteral_0= 'WebSphere'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSupportedContainerAccess().getWebSphereEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSupportedContainerAccess().getWebSphereEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyACDSL.g:1045:3: (enumLiteral_1= 'Tomcat' )
                    {
                    // InternalMyACDSL.g:1045:3: (enumLiteral_1= 'Tomcat' )
                    // InternalMyACDSL.g:1046:4: enumLiteral_1= 'Tomcat'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSupportedContainerAccess().getTomcatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSupportedContainerAccess().getTomcatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupportedContainer"


    // $ANTLR start "ruleSupportedContainerOperations"
    // InternalMyACDSL.g:1056:1: ruleSupportedContainerOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'stop' ) | (enumLiteral_1= 'start' ) | (enumLiteral_2= 'restart' ) ) ;
    public final Enumerator ruleSupportedContainerOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:1062:2: ( ( (enumLiteral_0= 'stop' ) | (enumLiteral_1= 'start' ) | (enumLiteral_2= 'restart' ) ) )
            // InternalMyACDSL.g:1063:2: ( (enumLiteral_0= 'stop' ) | (enumLiteral_1= 'start' ) | (enumLiteral_2= 'restart' ) )
            {
            // InternalMyACDSL.g:1063:2: ( (enumLiteral_0= 'stop' ) | (enumLiteral_1= 'start' ) | (enumLiteral_2= 'restart' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyACDSL.g:1064:3: (enumLiteral_0= 'stop' )
                    {
                    // InternalMyACDSL.g:1064:3: (enumLiteral_0= 'stop' )
                    // InternalMyACDSL.g:1065:4: enumLiteral_0= 'stop'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSupportedContainerOperationsAccess().getStopEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSupportedContainerOperationsAccess().getStopEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyACDSL.g:1072:3: (enumLiteral_1= 'start' )
                    {
                    // InternalMyACDSL.g:1072:3: (enumLiteral_1= 'start' )
                    // InternalMyACDSL.g:1073:4: enumLiteral_1= 'start'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSupportedContainerOperationsAccess().getStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSupportedContainerOperationsAccess().getStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyACDSL.g:1080:3: (enumLiteral_2= 'restart' )
                    {
                    // InternalMyACDSL.g:1080:3: (enumLiteral_2= 'restart' )
                    // InternalMyACDSL.g:1081:4: enumLiteral_2= 'restart'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSupportedContainerOperationsAccess().getRestartEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSupportedContainerOperationsAccess().getRestartEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupportedContainerOperations"


    // $ANTLR start "ruleSupportedOs"
    // InternalMyACDSL.g:1091:1: ruleSupportedOs returns [Enumerator current=null] : ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'Win' ) | (enumLiteral_2= 'Aix' ) ) ;
    public final Enumerator ruleSupportedOs() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:1097:2: ( ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'Win' ) | (enumLiteral_2= 'Aix' ) ) )
            // InternalMyACDSL.g:1098:2: ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'Win' ) | (enumLiteral_2= 'Aix' ) )
            {
            // InternalMyACDSL.g:1098:2: ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'Win' ) | (enumLiteral_2= 'Aix' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyACDSL.g:1099:3: (enumLiteral_0= 'Linux' )
                    {
                    // InternalMyACDSL.g:1099:3: (enumLiteral_0= 'Linux' )
                    // InternalMyACDSL.g:1100:4: enumLiteral_0= 'Linux'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSupportedOsAccess().getLinuxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSupportedOsAccess().getLinuxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyACDSL.g:1107:3: (enumLiteral_1= 'Win' )
                    {
                    // InternalMyACDSL.g:1107:3: (enumLiteral_1= 'Win' )
                    // InternalMyACDSL.g:1108:4: enumLiteral_1= 'Win'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSupportedOsAccess().getWinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSupportedOsAccess().getWinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyACDSL.g:1115:3: (enumLiteral_2= 'Aix' )
                    {
                    // InternalMyACDSL.g:1115:3: (enumLiteral_2= 'Aix' )
                    // InternalMyACDSL.g:1116:4: enumLiteral_2= 'Aix'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSupportedOsAccess().getAixEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSupportedOsAccess().getAixEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupportedOs"


    // $ANTLR start "ruleDeploymentOp"
    // InternalMyACDSL.g:1126:1: ruleDeploymentOp returns [Enumerator current=null] : ( (enumLiteral_0= 'uninstall' ) | (enumLiteral_1= 'install' ) | (enumLiteral_2= 'update' ) ) ;
    public final Enumerator ruleDeploymentOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyACDSL.g:1132:2: ( ( (enumLiteral_0= 'uninstall' ) | (enumLiteral_1= 'install' ) | (enumLiteral_2= 'update' ) ) )
            // InternalMyACDSL.g:1133:2: ( (enumLiteral_0= 'uninstall' ) | (enumLiteral_1= 'install' ) | (enumLiteral_2= 'update' ) )
            {
            // InternalMyACDSL.g:1133:2: ( (enumLiteral_0= 'uninstall' ) | (enumLiteral_1= 'install' ) | (enumLiteral_2= 'update' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyACDSL.g:1134:3: (enumLiteral_0= 'uninstall' )
                    {
                    // InternalMyACDSL.g:1134:3: (enumLiteral_0= 'uninstall' )
                    // InternalMyACDSL.g:1135:4: enumLiteral_0= 'uninstall'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDeploymentOpAccess().getUninstallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeploymentOpAccess().getUninstallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyACDSL.g:1142:3: (enumLiteral_1= 'install' )
                    {
                    // InternalMyACDSL.g:1142:3: (enumLiteral_1= 'install' )
                    // InternalMyACDSL.g:1143:4: enumLiteral_1= 'install'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDeploymentOpAccess().getInstallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeploymentOpAccess().getInstallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyACDSL.g:1150:3: (enumLiteral_2= 'update' )
                    {
                    // InternalMyACDSL.g:1150:3: (enumLiteral_2= 'update' )
                    // InternalMyACDSL.g:1151:4: enumLiteral_2= 'update'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDeploymentOpAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDeploymentOpAccess().getUpdateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeploymentOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000A01002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000C1000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003C100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}
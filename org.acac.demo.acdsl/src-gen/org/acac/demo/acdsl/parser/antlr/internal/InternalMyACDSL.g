/*
 * generated by Xtext 2.11.0
 */
grammar InternalMyACDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.acac.demo.acdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleAbstractElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.acac.demo.acdsl.MyACDSL.AbstractElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleDOUBLE
entryRuleDOUBLE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDOUBLERule()); }
	iv_ruleDOUBLE=ruleDOUBLE
	{ $current=$iv_ruleDOUBLE.current.getText(); }
	EOF;

// Rule DOUBLE
ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	iv_ruleAbstractElement=ruleAbstractElement
	{ $current=$iv_ruleAbstractElement.current; }
	EOF;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getConfigurationParserRuleCall_0());
		}
		this_Configuration_0=ruleConfiguration
		{
			$current = $this_Configuration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getDeploymentParserRuleCall_1());
		}
		this_Deployment_1=ruleDeployment
		{
			$current = $this_Deployment_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getOperationParserRuleCall_2());
		}
		this_Operation_2=ruleOperation
		{
			$current = $this_Operation_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConfiguration
entryRuleConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationRule()); }
	iv_ruleConfiguration=ruleConfiguration
	{ $current=$iv_ruleConfiguration.current; }
	EOF;

// Rule Configuration
ruleConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='configuration'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
		}
		otherlv_1='of'
		{
			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getOfKeyword_1());
		}
		(
			(
				lv_appName_2_0=RULE_ID
				{
					newLeafNode(lv_appName_2_0, grammarAccess.getConfigurationAccess().getAppNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"appName",
						lv_appName_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='on'
		{
			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getOnKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getOsSupportedOsEnumRuleCall_4_0());
				}
				lv_os_4_0=ruleSupportedOs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					set(
						$current,
						"os",
						lv_os_4_0,
						"org.acac.demo.acdsl.MyACDSL.SupportedOs");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='OS,'
		{
			newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getOSKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getAppServerAppServerInfoParserRuleCall_6_0());
				}
				lv_appServer_6_0=ruleAppServerInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					set(
						$current,
						"appServer",
						lv_appServer_6_0,
						"org.acac.demo.acdsl.MyACDSL.AppServerInfo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='Server'
		{
			newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getServerKeyword_7());
		}
		otherlv_8='begin-common-parameters'
		{
			newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getBeginCommonParametersKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getCommonParamsCommonParamParserRuleCall_9_0());
				}
				lv_commonParams_9_0=ruleCommonParam
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					add(
						$current,
						"commonParams",
						lv_commonParams_9_0,
						"org.acac.demo.acdsl.MyACDSL.CommonParam");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='end-common-parameters'
		{
			newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getEndCommonParametersKeyword_10());
		}
		otherlv_11='begin-application-configuration'
		{
			newLeafNode(otherlv_11, grammarAccess.getConfigurationAccess().getBeginApplicationConfigurationKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getConfigurationsConfigurationTypeParserRuleCall_12_0());
				}
				lv_configurations_12_0=ruleConfigurationType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					add(
						$current,
						"configurations",
						lv_configurations_12_0,
						"org.acac.demo.acdsl.MyACDSL.ConfigurationType");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_13='end-application-configuration'
		{
			newLeafNode(otherlv_13, grammarAccess.getConfigurationAccess().getEndApplicationConfigurationKeyword_13());
		}
	)
;

// Entry rule entryRuleDeployment
entryRuleDeployment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeploymentRule()); }
	iv_ruleDeployment=ruleDeployment
	{ $current=$iv_ruleDeployment.current; }
	EOF;

// Rule Deployment
ruleDeployment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDeploymentAccess().getDeploymentAction_0(),
					$current);
			}
		)
		otherlv_1='deployment'
		{
			newLeafNode(otherlv_1, grammarAccess.getDeploymentAccess().getDeploymentKeyword_1());
		}
		otherlv_2='operations:'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getOperationsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeploymentAccess().getAppOpDeploymentOpEnumRuleCall_3_0());
				}
				lv_appOp_3_0=ruleDeploymentOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeploymentRule());
					}
					add(
						$current,
						"appOp",
						lv_appOp_3_0,
						"org.acac.demo.acdsl.MyACDSL.DeploymentOp");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getOperationAccess().getOperationAction_0(),
					$current);
			}
		)
		otherlv_1='operation'
		{
			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationAccess().getServerOpSupportedContainerOperationsEnumRuleCall_2_0());
				}
				lv_serverOp_2_0=ruleSupportedContainerOperations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationRule());
					}
					add(
						$current,
						"serverOp",
						lv_serverOp_2_0,
						"org.acac.demo.acdsl.MyACDSL.SupportedContainerOperations");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAppServerInfo
entryRuleAppServerInfo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppServerInfoRule()); }
	iv_ruleAppServerInfo=ruleAppServerInfo
	{ $current=$iv_ruleAppServerInfo.current; }
	EOF;

// Rule AppServerInfo
ruleAppServerInfo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAppServerInfoAccess().getNameSupportedContainerEnumRuleCall_0_0());
				}
				lv_name_0_0=ruleSupportedContainer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppServerInfoRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.acac.demo.acdsl.MyACDSL.SupportedContainer");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_1='all'
			{
				newLeafNode(otherlv_1, grammarAccess.getAppServerInfoAccess().getAllKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAppServerInfoAccess().getVersionDOUBLEParserRuleCall_1_1_0());
					}
					lv_version_2_0=ruleDOUBLE
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAppServerInfoRule());
						}
						set(
							$current,
							"version",
							lv_version_2_0,
							"org.acac.demo.acdsl.MyACDSL.DOUBLE");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleCommonParam
entryRuleCommonParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommonParamRule()); }
	iv_ruleCommonParam=ruleCommonParam
	{ $current=$iv_ruleCommonParam.current; }
	EOF;

// Rule CommonParam
ruleCommonParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='commonParam'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommonParamAccess().getCommonParamKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCommonParamAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommonParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getCommonParamAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommonParamRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleConfigurationType
entryRuleConfigurationType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationTypeRule()); }
	iv_ruleConfigurationType=ruleConfigurationType
	{ $current=$iv_ruleConfigurationType.current; }
	EOF;

// Rule ConfigurationType
ruleConfigurationType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConfigurationTypeAccess().getServerJvmSettingParserRuleCall_0());
		}
		this_ServerJvmSetting_0=ruleServerJvmSetting
		{
			$current = $this_ServerJvmSetting_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConfigurationTypeAccess().getJAASAliasParserRuleCall_1());
		}
		this_JAASAlias_1=ruleJAASAlias
		{
			$current = $this_JAASAlias_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConfigurationTypeAccess().getJdbcProviderParserRuleCall_2());
		}
		this_JdbcProvider_2=ruleJdbcProvider
		{
			$current = $this_JdbcProvider_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConfigurationTypeAccess().getDataSourceParserRuleCall_3());
		}
		this_DataSource_3=ruleDataSource
		{
			$current = $this_DataSource_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataSource
entryRuleDataSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataSourceRule()); }
	iv_ruleDataSource=ruleDataSource
	{ $current=$iv_ruleDataSource.current; }
	EOF;

// Rule DataSource
ruleDataSource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='dataSource'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDataSourceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataSourceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDataSourceAccess().getScopeCommonParamCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_dataSourceName_2_0=RULE_STRING
				{
					newLeafNode(lv_dataSourceName_2_0, grammarAccess.getDataSourceAccess().getDataSourceNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataSourceRule());
					}
					setWithLastConsumed(
						$current,
						"dataSourceName",
						lv_dataSourceName_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_jndiName_3_0=RULE_STRING
				{
					newLeafNode(lv_jndiName_3_0, grammarAccess.getDataSourceAccess().getJndiNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataSourceRule());
					}
					setWithLastConsumed(
						$current,
						"jndiName",
						lv_jndiName_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_jdbcProviderName_4_0=RULE_STRING
				{
					newLeafNode(lv_jdbcProviderName_4_0, grammarAccess.getDataSourceAccess().getJdbcProviderNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataSourceRule());
					}
					setWithLastConsumed(
						$current,
						"jdbcProviderName",
						lv_jdbcProviderName_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_dataSourceUrl_5_0=RULE_STRING
				{
					newLeafNode(lv_dataSourceUrl_5_0, grammarAccess.getDataSourceAccess().getDataSourceUrlSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataSourceRule());
					}
					setWithLastConsumed(
						$current,
						"dataSourceUrl",
						lv_dataSourceUrl_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataSourceRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getComponentManagedAuthenticationAliasCommonParamCrossReference_6_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataSourceRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getDataSourceAccess().getMappingConfigurationAliasCommonParamCrossReference_7_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataSourceRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getDataSourceAccess().getContainerMmanagedAuthenticationAliasCommonParamCrossReference_8_0());
				}
			)
		)
	)
;

// Entry rule entryRuleJdbcProvider
entryRuleJdbcProvider returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJdbcProviderRule()); }
	iv_ruleJdbcProvider=ruleJdbcProvider
	{ $current=$iv_ruleJdbcProvider.current; }
	EOF;

// Rule JdbcProvider
ruleJdbcProvider returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='jdbcProvider'
		{
			newLeafNode(otherlv_0, grammarAccess.getJdbcProviderAccess().getJdbcProviderKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJdbcProviderRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getJdbcProviderAccess().getScopeCommonParamCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_databaseType_2_0=RULE_STRING
				{
					newLeafNode(lv_databaseType_2_0, grammarAccess.getJdbcProviderAccess().getDatabaseTypeSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJdbcProviderRule());
					}
					setWithLastConsumed(
						$current,
						"databaseType",
						lv_databaseType_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_providerType_3_0=RULE_STRING
				{
					newLeafNode(lv_providerType_3_0, grammarAccess.getJdbcProviderAccess().getProviderTypeSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJdbcProviderRule());
					}
					setWithLastConsumed(
						$current,
						"providerType",
						lv_providerType_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_implementationType_4_0=RULE_STRING
				{
					newLeafNode(lv_implementationType_4_0, grammarAccess.getJdbcProviderAccess().getImplementationTypeSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJdbcProviderRule());
					}
					setWithLastConsumed(
						$current,
						"implementationType",
						lv_implementationType_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_name_5_0=RULE_STRING
				{
					newLeafNode(lv_name_5_0, grammarAccess.getJdbcProviderAccess().getNameSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJdbcProviderRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_description_6_0=RULE_STRING
				{
					newLeafNode(lv_description_6_0, grammarAccess.getJdbcProviderAccess().getDescriptionSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJdbcProviderRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJdbcProviderRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getJdbcProviderAccess().getClasspathCommonParamCrossReference_7_0());
				}
			)
		)
	)
;

// Entry rule entryRuleJAASAlias
entryRuleJAASAlias returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJAASAliasRule()); }
	iv_ruleJAASAlias=ruleJAASAlias
	{ $current=$iv_ruleJAASAlias.current; }
	EOF;

// Rule JAASAlias
ruleJAASAlias returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='jaasAlias'
		{
			newLeafNode(otherlv_0, grammarAccess.getJAASAliasAccess().getJaasAliasKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJAASAliasRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getJAASAliasAccess().getAliasCommonParamCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_username_2_0=RULE_STRING
				{
					newLeafNode(lv_username_2_0, grammarAccess.getJAASAliasAccess().getUsernameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJAASAliasRule());
					}
					setWithLastConsumed(
						$current,
						"username",
						lv_username_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_password_3_0=RULE_STRING
				{
					newLeafNode(lv_password_3_0, grammarAccess.getJAASAliasAccess().getPasswordSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJAASAliasRule());
					}
					setWithLastConsumed(
						$current,
						"password",
						lv_password_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleServerJvmSetting
entryRuleServerJvmSetting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServerJvmSettingRule()); }
	iv_ruleServerJvmSetting=ruleServerJvmSetting
	{ $current=$iv_ruleServerJvmSetting.current; }
	EOF;

// Rule ServerJvmSetting
ruleServerJvmSetting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='serverJvmSetting'
		{
			newLeafNode(otherlv_0, grammarAccess.getServerJvmSettingAccess().getServerJvmSettingKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getServerJvmSettingAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getServerJvmSettingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getServerJvmSettingAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getServerJvmSettingRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Rule SupportedContainer
ruleSupportedContainer returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='WebSphere'
			{
				$current = grammarAccess.getSupportedContainerAccess().getWebSphereEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSupportedContainerAccess().getWebSphereEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Tomcat'
			{
				$current = grammarAccess.getSupportedContainerAccess().getTomcatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSupportedContainerAccess().getTomcatEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule SupportedContainerOperations
ruleSupportedContainerOperations returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='stop'
			{
				$current = grammarAccess.getSupportedContainerOperationsAccess().getStopEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSupportedContainerOperationsAccess().getStopEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='start'
			{
				$current = grammarAccess.getSupportedContainerOperationsAccess().getStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSupportedContainerOperationsAccess().getStartEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='restart'
			{
				$current = grammarAccess.getSupportedContainerOperationsAccess().getRestartEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSupportedContainerOperationsAccess().getRestartEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule SupportedOs
ruleSupportedOs returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Linux'
			{
				$current = grammarAccess.getSupportedOsAccess().getLinuxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSupportedOsAccess().getLinuxEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Win'
			{
				$current = grammarAccess.getSupportedOsAccess().getWinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSupportedOsAccess().getWinEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Aix'
			{
				$current = grammarAccess.getSupportedOsAccess().getAixEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSupportedOsAccess().getAixEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule DeploymentOp
ruleDeploymentOp returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='uninstall'
			{
				$current = grammarAccess.getDeploymentOpAccess().getUninstallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDeploymentOpAccess().getUninstallEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='install'
			{
				$current = grammarAccess.getDeploymentOpAccess().getInstallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDeploymentOpAccess().getInstallEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='update'
			{
				$current = grammarAccess.getDeploymentOpAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDeploymentOpAccess().getUpdateEnumLiteralDeclaration_2());
			}
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
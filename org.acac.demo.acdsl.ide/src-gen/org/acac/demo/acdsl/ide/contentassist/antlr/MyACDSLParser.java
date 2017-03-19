/*
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.acac.demo.acdsl.ide.contentassist.antlr.internal.InternalMyACDSLParser;
import org.acac.demo.acdsl.services.MyACDSLGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyACDSLParser extends AbstractContentAssistParser {

	@Inject
	private MyACDSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyACDSLParser createParser() {
		InternalMyACDSLParser result = new InternalMyACDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getAppServerInfoAccess().getAlternatives(), "rule__AppServerInfo__Alternatives");
					put(grammarAccess.getConfigurationTypeAccess().getAlternatives(), "rule__ConfigurationType__Alternatives");
					put(grammarAccess.getSupportedContainerAccess().getAlternatives(), "rule__SupportedContainer__Alternatives");
					put(grammarAccess.getSupportedContainerOperationsAccess().getAlternatives(), "rule__SupportedContainerOperations__Alternatives");
					put(grammarAccess.getSupportedOsAccess().getAlternatives(), "rule__SupportedOs__Alternatives");
					put(grammarAccess.getDeploymentOpAccess().getAlternatives(), "rule__DeploymentOp__Alternatives");
					put(grammarAccess.getDOUBLEAccess().getGroup(), "rule__DOUBLE__Group__0");
					put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
					put(grammarAccess.getDeploymentAccess().getGroup(), "rule__Deployment__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getAppServerInfoAccess().getGroup_1(), "rule__AppServerInfo__Group_1__0");
					put(grammarAccess.getCommonParamAccess().getGroup(), "rule__CommonParam__Group__0");
					put(grammarAccess.getDataSourceAccess().getGroup(), "rule__DataSource__Group__0");
					put(grammarAccess.getJdbcProviderAccess().getGroup(), "rule__JdbcProvider__Group__0");
					put(grammarAccess.getJAASAliasAccess().getGroup(), "rule__JAASAlias__Group__0");
					put(grammarAccess.getServerJvmSettingAccess().getGroup(), "rule__ServerJvmSetting__Group__0");
					put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
					put(grammarAccess.getConfigurationAccess().getAppNameAssignment_2(), "rule__Configuration__AppNameAssignment_2");
					put(grammarAccess.getConfigurationAccess().getOsAssignment_4(), "rule__Configuration__OsAssignment_4");
					put(grammarAccess.getConfigurationAccess().getAppServerAssignment_6(), "rule__Configuration__AppServerAssignment_6");
					put(grammarAccess.getConfigurationAccess().getCommonParamsAssignment_9(), "rule__Configuration__CommonParamsAssignment_9");
					put(grammarAccess.getConfigurationAccess().getConfigurationsAssignment_12(), "rule__Configuration__ConfigurationsAssignment_12");
					put(grammarAccess.getDeploymentAccess().getAppOpAssignment_3(), "rule__Deployment__AppOpAssignment_3");
					put(grammarAccess.getOperationAccess().getServerOpAssignment_2(), "rule__Operation__ServerOpAssignment_2");
					put(grammarAccess.getAppServerInfoAccess().getNameAssignment_0(), "rule__AppServerInfo__NameAssignment_0");
					put(grammarAccess.getAppServerInfoAccess().getVersionAssignment_1_1(), "rule__AppServerInfo__VersionAssignment_1_1");
					put(grammarAccess.getCommonParamAccess().getNameAssignment_1(), "rule__CommonParam__NameAssignment_1");
					put(grammarAccess.getCommonParamAccess().getValueAssignment_2(), "rule__CommonParam__ValueAssignment_2");
					put(grammarAccess.getDataSourceAccess().getScopeAssignment_1(), "rule__DataSource__ScopeAssignment_1");
					put(grammarAccess.getDataSourceAccess().getDataSourceNameAssignment_2(), "rule__DataSource__DataSourceNameAssignment_2");
					put(grammarAccess.getDataSourceAccess().getJndiNameAssignment_3(), "rule__DataSource__JndiNameAssignment_3");
					put(grammarAccess.getDataSourceAccess().getJdbcProviderNameAssignment_4(), "rule__DataSource__JdbcProviderNameAssignment_4");
					put(grammarAccess.getDataSourceAccess().getDataSourceUrlAssignment_5(), "rule__DataSource__DataSourceUrlAssignment_5");
					put(grammarAccess.getDataSourceAccess().getComponentManagedAuthenticationAliasAssignment_6(), "rule__DataSource__ComponentManagedAuthenticationAliasAssignment_6");
					put(grammarAccess.getDataSourceAccess().getMappingConfigurationAliasAssignment_7(), "rule__DataSource__MappingConfigurationAliasAssignment_7");
					put(grammarAccess.getDataSourceAccess().getContainerMmanagedAuthenticationAliasAssignment_8(), "rule__DataSource__ContainerMmanagedAuthenticationAliasAssignment_8");
					put(grammarAccess.getJdbcProviderAccess().getScopeAssignment_1(), "rule__JdbcProvider__ScopeAssignment_1");
					put(grammarAccess.getJdbcProviderAccess().getDatabaseTypeAssignment_2(), "rule__JdbcProvider__DatabaseTypeAssignment_2");
					put(grammarAccess.getJdbcProviderAccess().getProviderTypeAssignment_3(), "rule__JdbcProvider__ProviderTypeAssignment_3");
					put(grammarAccess.getJdbcProviderAccess().getImplementationTypeAssignment_4(), "rule__JdbcProvider__ImplementationTypeAssignment_4");
					put(grammarAccess.getJdbcProviderAccess().getNameAssignment_5(), "rule__JdbcProvider__NameAssignment_5");
					put(grammarAccess.getJdbcProviderAccess().getDescriptionAssignment_6(), "rule__JdbcProvider__DescriptionAssignment_6");
					put(grammarAccess.getJdbcProviderAccess().getClasspathAssignment_7(), "rule__JdbcProvider__ClasspathAssignment_7");
					put(grammarAccess.getJAASAliasAccess().getAliasAssignment_1(), "rule__JAASAlias__AliasAssignment_1");
					put(grammarAccess.getJAASAliasAccess().getUsernameAssignment_2(), "rule__JAASAlias__UsernameAssignment_2");
					put(grammarAccess.getJAASAliasAccess().getPasswordAssignment_3(), "rule__JAASAlias__PasswordAssignment_3");
					put(grammarAccess.getServerJvmSettingAccess().getNameAssignment_1(), "rule__ServerJvmSetting__NameAssignment_1");
					put(grammarAccess.getServerJvmSettingAccess().getValueAssignment_2(), "rule__ServerJvmSetting__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyACDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyACDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
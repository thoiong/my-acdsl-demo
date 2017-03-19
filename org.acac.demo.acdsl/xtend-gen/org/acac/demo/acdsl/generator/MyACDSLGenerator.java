/**
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.acac.demo.acdsl.myACDSL.CommonParam;
import org.acac.demo.acdsl.myACDSL.Configuration;
import org.acac.demo.acdsl.myACDSL.Deployment;
import org.acac.demo.acdsl.myACDSL.DeploymentOp;
import org.acac.demo.acdsl.myACDSL.Operation;
import org.acac.demo.acdsl.myACDSL.SupportedContainerOperations;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyACDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterator<Configuration> configuration = Iterators.<Configuration>filter(resource.getAllContents(), Configuration.class);
    while (configuration.hasNext()) {
      {
        Configuration config = configuration.next();
        fsa.generateFile("scripts/setEnv.sh", this.setEnvContents(config.getCommonParams()));
      }
    }
    Iterator<Deployment> deployment = Iterators.<Deployment>filter(resource.getAllContents(), Deployment.class);
    while (deployment.hasNext()) {
      {
        Deployment deploy = deployment.next();
        fsa.generateFile("scripts/deployApp.sh", this.setDeployAppContents(deploy.getAppOp()));
      }
    }
    Iterator<Operation> operation = Iterators.<Operation>filter(resource.getAllContents(), Operation.class);
    while (operation.hasNext()) {
      {
        Operation oper = operation.next();
        fsa.generateFile("scripts/manageEnv.sh", this.setManageEnvContents(oper.getServerOp()));
      }
    }
  }
  
  public CharSequence setManageEnvContents(final EList<SupportedContainerOperations> ops) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/bin/bash");
    _builder.newLine();
    _builder.append("# generated by My Application Configuration DSL (myACDSL) 0.1");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("# example manageEnv script.  ");
    _builder.newLine();
    _builder.append("# =============================================================================");
    _builder.newLine();
    _builder.append("# ");
    _builder.newLine();
    _builder.append("usage () {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \" \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"Usage: $0 <${MANAGE_ENV_USAGE_PARAMS}>\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"eg: $0 ${MANAGE_ENV_OP1}\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \" \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("exit 1");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# validating input");
    _builder.newLine();
    _builder.append("validate () {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"validating input....\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if [ -z \"${OP}\" ]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("usage");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for knownOp in ${KNOWN_MANAGE_ENV_OPS}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("do");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("if [ \"${knownOp}\" = \"${OP}\" ]");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("echo \"input validated.\"");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("done");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"===============================\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"    **** invalid input ****    \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"===============================\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("usage");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      for(final SupportedContainerOperations op : ops) {
        _builder.append("# ");
        _builder.append(op);
        _builder.append(" server");
        _builder.newLineIfNotEmpty();
        _builder.append(op);
        _builder.append(" () {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t  ");
        _builder.append("echo \"to be implemented ");
        _builder.append(op, "\t  ");
        _builder.append(" server\"");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append("#==========");
    _builder.newLine();
    _builder.append("# main");
    _builder.newLine();
    _builder.append("#==========");
    _builder.newLine();
    _builder.append("SCRIPTS_HOME=`dirname $0` ");
    _builder.newLine();
    _builder.append(". ${SCRIPTS_HOME}/setEnv.sh");
    _builder.newLine();
    _builder.append("OP=$1");
    _builder.newLine();
    _builder.append("validate");
    _builder.newLine();
    _builder.append("${OP}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence setDeployAppContents(final EList<DeploymentOp> ops) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/bin/bash");
    _builder.newLine();
    _builder.append("# generated by My Application Configuration DSL (myACDSL) 0.1");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("# example deployApp script.  ");
    _builder.newLine();
    _builder.append("# =============================================================================");
    _builder.newLine();
    _builder.append("# ");
    _builder.newLine();
    _builder.append("usage () {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \" \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"Usage: $0 <${DEPLOY_APP_USAGE_PARAMS}>\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"eg: $0 ${DEPLOY_APP_OP1}\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \" \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("exit 1");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# validating input");
    _builder.newLine();
    _builder.append("validate () {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"validating input....\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if [ -z \"${OP}\" ]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("usage");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for knownOp in ${KNOWN_DEPLOY_APP_OPS}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("do");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("if [ \"${knownOp}\" = \"${OP}\" ]");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("echo \"input validated.\"");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("done");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \" \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"===============================\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"    **** invalid input ****    \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \"===============================\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("echo \" \"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("usage");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      for(final DeploymentOp op : ops) {
        _builder.append("# ");
        _builder.append(op);
        _builder.append(" function");
        _builder.newLineIfNotEmpty();
        _builder.append(op);
        _builder.append(" () {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t   ");
        _builder.append("#to do:");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("#implement ");
        _builder.append(op, "\t   ");
        _builder.append(" Application");
        _builder.newLineIfNotEmpty();
        _builder.append("\t   ");
        _builder.append("echo \"to be implemented - ");
        _builder.append(op, "\t   ");
        _builder.append(" application !\"");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append("#==========");
    _builder.newLine();
    _builder.append("# main");
    _builder.newLine();
    _builder.append("#==========");
    _builder.newLine();
    _builder.append("SCRIPTS_HOME=`dirname $0` ");
    _builder.newLine();
    _builder.append(". ${SCRIPTS_HOME}/setEnv.sh");
    _builder.newLine();
    _builder.append("OP=$1");
    _builder.newLine();
    _builder.append("validate");
    _builder.newLine();
    _builder.append("${OP}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence setEnvContents(final EList<CommonParam> commonParams) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/bin/bash");
    _builder.newLine();
    _builder.append("# generated by My Application Configuration DSL (myACDSL) 0.1");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("# set common environment variables.  ");
    _builder.newLine();
    _builder.append("# =============================================================================");
    _builder.newLine();
    {
      for(final CommonParam commonParam : commonParams) {
        _builder.append("export ");
        String _name = commonParam.getName();
        _builder.append(_name);
        _builder.append("=\"");
        String _value = commonParam.getValue();
        _builder.append(_value);
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}

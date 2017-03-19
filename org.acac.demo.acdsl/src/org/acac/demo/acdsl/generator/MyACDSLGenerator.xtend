/*
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.acac.demo.acdsl.myACDSL.Configuration
import org.acac.demo.acdsl.myACDSL.Deployment
import org.acac.demo.acdsl.myACDSL.Operation
import org.acac.demo.acdsl.myACDSL.CommonParam
import org.acac.demo.acdsl.myACDSL.DeploymentOp
import org.eclipse.emf.common.util.EList
import org.acac.demo.acdsl.myACDSL.SupportedContainerOperations

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyACDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var configuration = resource.allContents.filter(typeof(Configuration))
		while (configuration.hasNext) {
			var config = configuration.next();
			fsa.generateFile('scripts/setEnv.sh', setEnvContents(config.commonParams))
		}

		var deployment = resource.allContents.filter(typeof(Deployment))
		while (deployment.hasNext) {
			var deploy = deployment.next();
			fsa.generateFile('scripts/deployApp.sh', setDeployAppContents(deploy.appOp))
		}

		var operation = resource.allContents.filter(typeof(Operation))
		while (operation.hasNext) {
			var oper = operation.next();
			fsa.generateFile('scripts/manageEnv.sh', setManageEnvContents(oper.serverOp))
		}
	}

	def setManageEnvContents(EList<SupportedContainerOperations> ops) {
		'''
			#!/bin/bash
			# generated by My Application Configuration DSL (myACDSL) 0.1
			#
			# example manageEnv script.  
			# =============================================================================
			# 
			usage () {
				echo " "
				echo "Usage: $0 <${MANAGE_ENV_USAGE_PARAMS}>"
				echo "eg: $0 ${MANAGE_ENV_OP1}"
				echo " "
				
				exit 1
			}
			
			# validating input
			validate () {
				echo "validating input...."
				
				if [ -z "${OP}" ]
				then
				    usage
				fi
				
				for knownOp in ${KNOWN_MANAGE_ENV_OPS}
				do
				    if [ "${knownOp}" = "${OP}" ]
				    then
				        echo "input validated."
				        return;
				    fi
				done
				echo "==============================="
				echo "    **** invalid input ****    "
				echo "==============================="
				usage
			}
			
			�FOR op : ops�
				# �op� server
				�op� () {
					  echo "to be implemented �op� server"
				}
				
			�ENDFOR�
			#==========
			# main
			#==========
			SCRIPTS_HOME=`dirname $0` 
			. ${SCRIPTS_HOME}/setEnv.sh
			OP=$1
			validate
			${OP}
		'''
	}

	def setDeployAppContents(EList<DeploymentOp> ops) {
		'''
			#!/bin/bash
			# generated by My Application Configuration DSL (myACDSL) 0.1
			#
			# example deployApp script.  
			# =============================================================================
			# 
			usage () {
				echo " "
				echo "Usage: $0 <${DEPLOY_APP_USAGE_PARAMS}>"
				echo "eg: $0 ${DEPLOY_APP_OP1}"
				echo " "
				
				exit 1
			}
			
			# validating input
			validate () {
				echo "validating input...."
				
				if [ -z "${OP}" ]
				then
				    usage
				fi
				
				for knownOp in ${KNOWN_DEPLOY_APP_OPS}
				do
				    if [ "${knownOp}" = "${OP}" ]
				    then
				        echo "input validated."
				        return;
				    fi
				done
				echo " "
				echo "==============================="
				echo "    **** invalid input ****    "
				echo "==============================="
				echo " "
				usage
			}
			
			�FOR op : ops�
				# �op� function
				�op� () {
					   #to do:
					   #implement �op� Application
					   echo "to be implemented - �op� application !"
				}
				
			�ENDFOR�
			#==========
			# main
			#==========
			SCRIPTS_HOME=`dirname $0` 
			. ${SCRIPTS_HOME}/setEnv.sh
			OP=$1
			validate
			${OP}
		'''
	}

	def setEnvContents(EList<CommonParam> commonParams) {
		'''
			#!/bin/bash
			# generated by My Application Configuration DSL (myACDSL) 0.1
			#
			# set common environment variables.  
			# =============================================================================
			�FOR commonParam : commonParams�
				export �commonParam.name�="�commonParam.value�"
			�ENDFOR�
		'''
	}

}
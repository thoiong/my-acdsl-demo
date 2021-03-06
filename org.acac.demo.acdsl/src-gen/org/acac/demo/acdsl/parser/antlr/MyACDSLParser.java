/*
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.parser.antlr;

import com.google.inject.Inject;
import org.acac.demo.acdsl.parser.antlr.internal.InternalMyACDSLParser;
import org.acac.demo.acdsl.services.MyACDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MyACDSLParser extends AbstractAntlrParser {

	@Inject
	private MyACDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyACDSLParser createParser(XtextTokenStream stream) {
		return new InternalMyACDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MyACDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyACDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

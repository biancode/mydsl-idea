/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.mydsl.idea.lang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/example/mydsl/idea/parser/antlr/internal/PsiInternalMyDsl.tokens");
	}
}
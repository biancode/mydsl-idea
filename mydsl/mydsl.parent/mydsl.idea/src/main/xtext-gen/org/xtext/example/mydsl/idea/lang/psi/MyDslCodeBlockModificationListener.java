/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.mydsl.idea.lang.psi;

import com.intellij.psi.util.PsiModificationTracker;
import org.eclipse.xtext.psi.BaseXtextCodeBlockModificationListener;
import org.xtext.example.mydsl.idea.lang.MyDslLanguage;

public class MyDslCodeBlockModificationListener extends BaseXtextCodeBlockModificationListener {

	public MyDslCodeBlockModificationListener(PsiModificationTracker psiModificationTracker) {
		super(MyDslLanguage.INSTANCE, psiModificationTracker);
	}

}

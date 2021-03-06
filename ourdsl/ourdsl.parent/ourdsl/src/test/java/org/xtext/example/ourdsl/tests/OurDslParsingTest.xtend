/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.ourdsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.ourdsl.ourDsl.Model

@RunWith(XtextRunner)
@InjectWith(OurDslInjectorProvider)
class OurDslParsingTest{

	@Inject
	ParseHelper<Model> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}

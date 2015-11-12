/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.ourdsl.idea

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.ourdsl.OurDslRuntimeModule
import org.xtext.example.ourdsl.OurDslStandaloneSetupGenerated

class OurDslStandaloneSetupIdea extends OurDslStandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new OurDslRuntimeModule()
		val ideaModule = new OurDslIdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}
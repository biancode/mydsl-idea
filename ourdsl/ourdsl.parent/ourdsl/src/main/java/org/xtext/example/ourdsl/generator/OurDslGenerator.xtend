/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.ourdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.ourdsl.ourDsl.Greeting

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class OurDslGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('ourdsl.txt', 'Our People to greet: ' +
			resource.allContents
				.filter(typeof(Greeting))
				.map[name]
				.join(', '))
	}

}

/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.yourdsl.idea.facet;

import com.intellij.facet.Facet;
import com.intellij.facet.FacetTypeId;
import org.eclipse.xtext.idea.facet.AbstractFacetType;
import org.xtext.example.yourdsl.idea.lang.YourDslLanguage;

public class YourDslFacetType extends AbstractFacetType<YourDslFacetConfiguration> {

	public static final FacetTypeId<Facet<YourDslFacetConfiguration>> TYPEID = new FacetTypeId<Facet<YourDslFacetConfiguration>>("org.xtext.example.yourdsl.YourDsl");

	public YourDslFacetType() {
		super(TYPEID, "org.xtext.example.yourdsl.YourDsl", "YourDsl");
		YourDslLanguage.INSTANCE.injectMembers(this);
	}
}

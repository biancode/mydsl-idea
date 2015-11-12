/*
 * generated by Xtext 2.9.0.beta5
 */
package org.xtext.example.ourdsl.idea.lang;

import com.intellij.psi.tree.IFileElementType;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import org.eclipse.xtext.psi.stubs.XtextFileElementType;
import org.eclipse.xtext.psi.stubs.XtextFileStub;
import org.eclipse.xtext.psi.tree.IGrammarAwareElementType;
import org.xtext.example.ourdsl.idea.lang.psi.impl.OurDslFileImpl;
import org.xtext.example.ourdsl.services.OurDslGrammarAccess;

public class OurDslElementTypeProvider implements IElementTypeProvider {

	public static final IFileElementType FILE_TYPE = new XtextFileElementType<XtextFileStub<OurDslFileImpl>>(OurDslLanguage.INSTANCE);

	private static final Map<EObject, IGrammarAwareElementType> GRAMMAR_ELEMENT_TYPE = new HashMap<EObject, IGrammarAwareElementType>();

	private static IGrammarAwareElementType associate(IGrammarAwareElementType grammarAwareElementType) {
		GRAMMAR_ELEMENT_TYPE.put(grammarAwareElementType.getGrammarElement(), grammarAwareElementType);
		return grammarAwareElementType;
	}

	private static final OurDslGrammarAccess GRAMMAR_ACCESS = OurDslLanguage.INSTANCE.getInstance(OurDslGrammarAccess.class);

	private static class ModelFactory {
		public static IGrammarAwareElementType createModelElementType() {
			return new IGrammarAwareElementType("Model_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelRule());
		}
		public static IGrammarAwareElementType createModel_GreetingsAssignmentElementType() {
			return new IGrammarAwareElementType("Model_GreetingsAssignment_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getGreetingsAssignment());
		}
		public static IGrammarAwareElementType createModel_GreetingsGreetingParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Model_GreetingsGreetingParserRuleCall_0_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getGreetingsGreetingParserRuleCall_0());
		}
	}

	public static final IGrammarAwareElementType Model_ELEMENT_TYPE = associate(ModelFactory.createModelElementType());

	public static final IGrammarAwareElementType Model_GreetingsAssignment_ELEMENT_TYPE = associate(ModelFactory.createModel_GreetingsAssignmentElementType());

	public static final IGrammarAwareElementType Model_GreetingsGreetingParserRuleCall_0_ELEMENT_TYPE = associate(ModelFactory.createModel_GreetingsGreetingParserRuleCall_0ElementType());

	private static class GreetingFactory {
		public static IGrammarAwareElementType createGreetingElementType() {
			return new IGrammarAwareElementType("Greeting_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingRule());
		}
		public static IGrammarAwareElementType createGreeting_GroupElementType() {
			return new IGrammarAwareElementType("Greeting_Group_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getGroup());
		}
		public static IGrammarAwareElementType createGreeting_HelloKeyword_0ElementType() {
			return new IGrammarAwareElementType("Greeting_HelloKeyword_0_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getHelloKeyword_0());
		}
		public static IGrammarAwareElementType createGreeting_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("Greeting_NameAssignment_1_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createGreeting_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Greeting_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createGreeting_UsingKeyword_2ElementType() {
			return new IGrammarAwareElementType("Greeting_UsingKeyword_2_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getUsingKeyword_2());
		}
		public static IGrammarAwareElementType createGreeting_DslOneAssignment_3ElementType() {
			return new IGrammarAwareElementType("Greeting_DslOneAssignment_3_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getDslOneAssignment_3());
		}
		public static IGrammarAwareElementType createGreeting_DslOneMyGreetingCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("Greeting_DslOneMyGreetingCrossReference_3_0_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getDslOneMyGreetingCrossReference_3_0());
		}
		public static IGrammarAwareElementType createGreeting_DslOneMyGreetingIDTerminalRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("Greeting_DslOneMyGreetingIDTerminalRuleCall_3_0_1_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getDslOneMyGreetingIDTerminalRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createGreeting_AndKeyword_4ElementType() {
			return new IGrammarAwareElementType("Greeting_AndKeyword_4_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getAndKeyword_4());
		}
		public static IGrammarAwareElementType createGreeting_DslTwoAssignment_5ElementType() {
			return new IGrammarAwareElementType("Greeting_DslTwoAssignment_5_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getDslTwoAssignment_5());
		}
		public static IGrammarAwareElementType createGreeting_DslTwoYourGreetingCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("Greeting_DslTwoYourGreetingCrossReference_5_0_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getDslTwoYourGreetingCrossReference_5_0());
		}
		public static IGrammarAwareElementType createGreeting_DslTwoYourGreetingIDTerminalRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("Greeting_DslTwoYourGreetingIDTerminalRuleCall_5_0_1_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getDslTwoYourGreetingIDTerminalRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createGreeting_ExclamationMarkKeyword_6ElementType() {
			return new IGrammarAwareElementType("Greeting_ExclamationMarkKeyword_6_ELEMENT_TYPE", OurDslLanguage.INSTANCE, GRAMMAR_ACCESS.getGreetingAccess().getExclamationMarkKeyword_6());
		}
	}

	public static final IGrammarAwareElementType Greeting_ELEMENT_TYPE = associate(GreetingFactory.createGreetingElementType());

	public static final IGrammarAwareElementType Greeting_Group_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_GroupElementType());

	public static final IGrammarAwareElementType Greeting_HelloKeyword_0_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_HelloKeyword_0ElementType());

	public static final IGrammarAwareElementType Greeting_NameAssignment_1_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType Greeting_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType Greeting_UsingKeyword_2_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_UsingKeyword_2ElementType());

	public static final IGrammarAwareElementType Greeting_DslOneAssignment_3_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_DslOneAssignment_3ElementType());

	public static final IGrammarAwareElementType Greeting_DslOneMyGreetingCrossReference_3_0_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_DslOneMyGreetingCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType Greeting_DslOneMyGreetingIDTerminalRuleCall_3_0_1_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_DslOneMyGreetingIDTerminalRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType Greeting_AndKeyword_4_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_AndKeyword_4ElementType());

	public static final IGrammarAwareElementType Greeting_DslTwoAssignment_5_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_DslTwoAssignment_5ElementType());

	public static final IGrammarAwareElementType Greeting_DslTwoYourGreetingCrossReference_5_0_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_DslTwoYourGreetingCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType Greeting_DslTwoYourGreetingIDTerminalRuleCall_5_0_1_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_DslTwoYourGreetingIDTerminalRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType Greeting_ExclamationMarkKeyword_6_ELEMENT_TYPE = associate(GreetingFactory.createGreeting_ExclamationMarkKeyword_6ElementType());

	@Override
	public IFileElementType getFileType() {
		return FILE_TYPE;
	}

	@Override
	public IGrammarAwareElementType findElementType(EObject grammarElement) {
		return GRAMMAR_ELEMENT_TYPE.get(grammarElement);
	}
	
	public IGrammarAwareElementType getModelElementType() {
		return Model_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_GreetingsAssignmentElementType() {
		return Model_GreetingsAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_GreetingsGreetingParserRuleCall_0ElementType() {
		return Model_GreetingsGreetingParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreetingElementType() {
		return Greeting_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_GroupElementType() {
		return Greeting_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_HelloKeyword_0ElementType() {
		return Greeting_HelloKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_NameAssignment_1ElementType() {
		return Greeting_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_NameIDTerminalRuleCall_1_0ElementType() {
		return Greeting_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_UsingKeyword_2ElementType() {
		return Greeting_UsingKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_DslOneAssignment_3ElementType() {
		return Greeting_DslOneAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_DslOneMyGreetingCrossReference_3_0ElementType() {
		return Greeting_DslOneMyGreetingCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_DslOneMyGreetingIDTerminalRuleCall_3_0_1ElementType() {
		return Greeting_DslOneMyGreetingIDTerminalRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_AndKeyword_4ElementType() {
		return Greeting_AndKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_DslTwoAssignment_5ElementType() {
		return Greeting_DslTwoAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_DslTwoYourGreetingCrossReference_5_0ElementType() {
		return Greeting_DslTwoYourGreetingCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_DslTwoYourGreetingIDTerminalRuleCall_5_0_1ElementType() {
		return Greeting_DslTwoYourGreetingIDTerminalRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGreeting_ExclamationMarkKeyword_6ElementType() {
		return Greeting_ExclamationMarkKeyword_6_ELEMENT_TYPE;
	}

}
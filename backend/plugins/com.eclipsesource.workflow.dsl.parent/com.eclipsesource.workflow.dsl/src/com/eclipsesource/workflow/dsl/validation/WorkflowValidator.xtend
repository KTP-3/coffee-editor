/*
 * generated by Xtext 2.12.0
 */
package com.eclipsesource.workflow.dsl.validation

import com.eclipsesource.workflow.dsl.workflow.ProbabilityConfiguration
import com.eclipsesource.workflow.dsl.workflow.WorkflowPackage
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class WorkflowValidator extends AbstractWorkflowValidator {

	public static val DUPLICATE_ACTION = 'duplicateAction'
	public static val WRONG_PROBABILITY_ORDER = "propabilityOrder"
	public static val PROBABILITY_NOT_IN_RANGE = "probabilityNotInRange"

	private static val PROBABILITY_ORDER_WARNING = "The probability value for \"%s\" is higher than the probability value for \"%s\"";
	private static val PROBABILITY_RANGE_ERROR = "The probability value for \"%s\" must be between 0.0 and 1.0"

	@Check
	def checkProbabilityRange(ProbabilityConfiguration probConf) {
		if (probConf.low < 0.0 || probConf.low > 1.0) {
			error(String.format(WorkflowValidator.PROBABILITY_RANGE_ERROR, "LOW"),
				WorkflowPackage.Literals.PROBABILITY_CONFIGURATION__LOW, PROBABILITY_NOT_IN_RANGE);
		}
		if (probConf.medium < 0.0 || probConf.medium > 1.0) {
			error(String.format(WorkflowValidator.PROBABILITY_RANGE_ERROR, "MEDIUM"),
				WorkflowPackage.Literals.PROBABILITY_CONFIGURATION__MEDIUM, PROBABILITY_NOT_IN_RANGE);
		}

		if (probConf.high < 0.0 || probConf.high > 1.0) {
			error(String.format(WorkflowValidator.PROBABILITY_RANGE_ERROR, "HIGH"),
				WorkflowPackage.Literals.PROBABILITY_CONFIGURATION__HIGH, PROBABILITY_NOT_IN_RANGE);
		}

	}

	@Check
	def checkProbabilityOrder(ProbabilityConfiguration probabilityConfiguration) {
		if (probabilityConfiguration.low > probabilityConfiguration.medium) {
			warning(String.format(WorkflowValidator.PROBABILITY_ORDER_WARNING, "LOW", "MEDIUM"),
				WorkflowPackage.Literals.PROBABILITY_CONFIGURATION__LOW, WRONG_PROBABILITY_ORDER);
		} else if (probabilityConfiguration.low > probabilityConfiguration.high) {
			warning(String.format(WorkflowValidator.PROBABILITY_ORDER_WARNING, "LOW", "HIGH"),
				WorkflowPackage.Literals.PROBABILITY_CONFIGURATION__LOW, WRONG_PROBABILITY_ORDER);
		} else if (probabilityConfiguration.medium > probabilityConfiguration.high) {
			warning(String.format(WorkflowValidator.PROBABILITY_ORDER_WARNING, "MEDIUM", "HIGH"),
				WorkflowPackage.Literals.PROBABILITY_CONFIGURATION__MEDIUM, WRONG_PROBABILITY_ORDER);
		}

	}
}
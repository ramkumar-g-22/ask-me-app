package in.ramkumar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestQuestionManager {

	private String validQuestion = "What is Java?";
	private String validDescription = "Help me to answer for this to talk about it in interview";
	private String questionWithGreaterThan300Letters = "What is meant by Java? Why we use getters and setters? "
			+ "What is meant by inheritance? What is method overriding? What is method overloading? "
			+ "What is the use of default keyword in Java? What is meant by polymorphism? Why we "
			+ "static keyword? What is meant by Java? Why we use getters and setters? Usage of polymorphism";
	private String descriptionWithGreaterThan600Letters = "What is meant by Java? Why we use getters and setters? "
			+ "What is meant by inheritance? What is method overriding? What is method overloading? "
			+ "What is the use of default keyword in Java? What is meant by polymorphism? Why we "
			+ "static keyword? What is meant by Java? Why we use getters and setters? Usage of polymorphism "
			+ "What is meant by Java? Why we use getters and setters?"
			+ "What is meant by inheritance? What is method overriding? What is method overloading?"
			+ "What is the use of default keyword in Java? What is meant by polymorphism? Why we "
			+ "static keyword? What is meant by Java? Why we use getters and setters? Usage of polymorphism?";

	
	/**
	 * Validation with valid question and valid description.
	 */
	@Test
	public void testAddQuestionWithValidQuestionAndDescription() {
		Question question = new Question();
		question.setQuestion(validQuestion);
		question.setDescription(validDescription);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertTrue(validQuestion);
	}

	/**
	 * Validation with valid question and null description.
	 */
	@Test
	public void testAddQuestionWithValidQuestionAndNullDescription() {
		Question question = new Question();
		question.setQuestion(validQuestion);
		question.setDescription(null);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}
	
	/**
	 * Validation with null question and valid description.
	 */
	@Test
	public void testAddQuestionWithNullQuestionAndValidDescription() {
		Question question = new Question();
		question.setQuestion(null);
		question.setDescription(validDescription);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}
	
	/**
	 * Validation with null question and null description.
	 */
	@Test
	public void testAddQuestionWithNullQuestionAndNullDescription() {
		Question question = new Question();
		question.setQuestion(null);
		question.setDescription(null);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}
	
	/**
	 * Validation with empty question and empty description.
	 */
	@Test
	public void testAddQuestionWithEmptyQuestionAndEmptyDescription() {
		Question question = new Question();
		question.setQuestion("");
		question.setDescription("");
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}
	
	/**
	 * Validation of question with >300 letters and description with >600
	 */
	@Test
	public void testAddQuestionWithGreaterThan300And600Letters() {
		Question question = new Question();
		question.setQuestion(questionWithGreaterThan300Letters);
		question.setDescription(descriptionWithGreaterThan600Letters);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}

}

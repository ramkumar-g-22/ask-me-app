package in.ramkumar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestQuestionManager {

	String validQuestion = "What is Java?";
	String validDescription = "Help me to answer for this to talk about it in interview";
	
	@Test
	public void testAddQuestionWithValidQuestionAndDescription() {
		Question question = new Question();
		question.setQuestion(validQuestion);
		question.setDescription(validDescription);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertTrue(validQuestion);
	}
	
	@Test
	public void testAddQuestionWithValidQuestionAndNullDescription() {
		Question question = new Question();
		question.setQuestion(validQuestion);
		question.setDescription(null);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}
	
	@Test
	public void testAddQuestionWithNullQuestionAndValidDescription() {
		Question question = new Question();
		question.setQuestion(null);
		question.setDescription(validDescription);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}
	
	@Test
	public void testAddQuestionWithNullQuestionAndNullDescription() {
		Question question = new Question();
		question.setQuestion(null);
		question.setDescription(null);
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}
	
	@Test
	public void testAddQuestionWithEmptyQuestionAndEmptyDescription() {
		Question question = new Question();
		question.setQuestion("    Hello  ");
		question.setDescription(" Hssbj");
		boolean validQuestion = QuestionManager.addQuestion(question);
		assertFalse(validQuestion);
	}

}

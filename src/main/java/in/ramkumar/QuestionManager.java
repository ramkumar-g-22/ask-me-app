package in.ramkumar;

import java.util.ArrayList;

public class QuestionManager {

	static ArrayList<Question> questionList = new ArrayList<Question>();

	/**
	 * This method validates the question, if it is a valid question then it will be
	 * added to questionList.
	 * 
	 * @param question
	 * @return
	 */
	public static boolean addQuestion(Question question) {
		boolean validQuestion = false;
		if (validateQuestion(question) && validateDescription(question)) {
			questionList.add(question);
			validQuestion = true;
		}
		return validQuestion;
	}

	/**
	 * This method returns list of questions.
	 * 
	 * @return
	 */
	public static ArrayList<Question> getAllQuestion() {
		return questionList;
	}

	/**
	 * This method validates the given question. Question should not be null, empty,
	 * and also the length of the question should not be > 300
	 * 
	 * @param questionObject
	 * @return
	 */
	public static boolean validateQuestion(Question questionObject) {
		String question = questionObject.getQuestion();
		boolean validQuestion = false;
		Integer numberOfCharactersForQuestion = 300;
		try {
			int questionLength = getLength(question);
			if (question != null && question.trim() != "" && questionLength <= numberOfCharactersForQuestion) {
				validQuestion = true;
			}
		} catch (Exception e) {
			validQuestion = false;
		}
		return validQuestion;
	}

	/**
	 * This method validates the given description. Description should not be null,
	 * empty, and also the length of the description should not be > 600
	 * 
	 * @param questionObject
	 * @return
	 */
	public static boolean validateDescription(Question questionObject) {
		boolean validDescription = false;
		String description = questionObject.getDescription();
		Integer numberOfCharactersForDescription = 600;
		try {
			int descriptionLength = getLength(description);
			if (description != null && description.trim() != ""
					&& descriptionLength <= numberOfCharactersForDescription) {
				validDescription = true;
			}
		} catch (Exception e) {
			validDescription = false;
		}
		return validDescription;
	}

	/**
	 * This method returns the length of the given string.
	 * 
	 * @param string
	 * @return
	 */
	public static int getLength(String string) {
		return string.length();
	}

}

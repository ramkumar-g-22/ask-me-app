package in.ramkumar.question;

import java.util.ArrayList;

import in.ramkumar.util.ValidationUtil;

public class QuestionManager {

	private static ArrayList<Question> questionList = new ArrayList<Question>();

	/**
	 * Add Question. This method validates the question, if it is a valid question
	 * then it will be added to questionList.
	 * 
	 * @param question
	 * @return Returns true iff it is a valid Question object.
	 */
	public static boolean addQuestion(Question question) {
		boolean validQuestion = false;
		if (ValidationUtil.validateQuestion(question) && ValidationUtil.validateDescription(question)) {
			questionList.add(question);
			validQuestion = true;
		}
		return validQuestion;
	}

	/**
	 * @return Returns list of questions.
	 */
	public static ArrayList<Question> getAllQuestion() {
		return questionList;
	}

	/**
	 * @return Returns number of questions in the question list.
	 */
	public static int getNumberOfQuestion() {
		return questionList.size();
	}

}

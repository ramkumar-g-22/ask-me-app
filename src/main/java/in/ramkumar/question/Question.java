package in.ramkumar.question;

public class Question {
	
	private String question;
	private String description;
	
	/**
	 * This method returns the question.
	 * @return
	 */
	public String getQuestion() {
		return question;
	}
	
	/**
	 * This method sets the question for the current Question object.
	 * @param question
	 * @return
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	
	/**
	 * This method returns the description.
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * This method sets the description for the current Question object.
	 * @param description
	 * @return
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return Returns the string representation of Question object.
	 */
	@Override
	public String toString() {
		return "Question [question=" + question + ", description=" + description + "]";
	}
	
}

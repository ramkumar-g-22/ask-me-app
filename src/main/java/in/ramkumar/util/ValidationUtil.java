package in.ramkumar.util;

import static in.ramkumar.util.StringUtil.*;

import java.util.regex.Pattern;

import in.ramkumar.question.Question;

public class ValidationUtil {

	/**
	 * UserName Validation. This method validates the given name. The name should
	 * not be null, empty, and also name length <=20 characters.
	 * 
	 * @param name
	 * @return Returns true iff meets the above condition.
	 */
	public static boolean validateName(String name) {
		boolean validName = false;
		try {
			int nameLength = getLength(name);
			int numberOfCharactersForName = 20;
			if (checkingForNullAndEmpty(name) && nameLength <= numberOfCharactersForName) {
				validName = true;
			}
		} catch (Exception e) {
			validName = false;
		}
		return validName;
	}

	/**
	 * Password Validation. This method validates the given password. The password
	 * should not be null, empty, and also password length >=8 characters.
	 * 
	 * @param password
	 * @return Returns true iff meets the above condition.
	 */
	public static boolean validatePassword(String password) {
		boolean validPassword = false;
		try {
			String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
			boolean validPasswordPattern = Pattern.matches(passwordPattern, password);
			if (checkingForNullAndEmpty(password) && validPasswordPattern) {
				validPassword = true;
			}
		} catch (Exception e) {
			validPassword = false;
		}
		return validPassword;
	}

	/**
	 * Email Validation. This method validates the given email. Condition: The email
	 * should not be null, empty, and also it should meet the email pattern.
	 * 
	 * @param email
	 * @return Returns true iff meets the above condition.
	 */
	public static boolean validateEmail(String email) {
		String emailPattern = "[[A-Za-z]?0-9.]+@(?:[a-zA-Z0-9]+\\.)+[a-z]{2,6}$";
		boolean validPassword = false;
		try {
			boolean validEmailPattern = Pattern.matches(emailPattern, email);
			if (checkingForNullAndEmpty(email) && validEmailPattern) {
				validPassword = true;
			}
		} catch (Exception e) {
			validPassword = false;
		}
		return validPassword;
	}

	/**
	 * Question Validation. This method validates the given question. Question
	 * should not be null, empty, and also the length of the question should not be
	 * > 300
	 * 
	 * @param questionObject
	 * @return Returns true iff it is a valid question.
	 */
	public static boolean validateQuestion(Question questionObject) {
		String question = questionObject.getQuestion();
		boolean validQuestion = false;
		Integer numberOfCharactersForQuestion = 300;
		try {
			int questionLength = getLength(question);
			if (checkingForNullAndEmpty(question) && questionLength <= numberOfCharactersForQuestion) {
				validQuestion = true;
			}
		} catch (Exception e) {
			validQuestion = false;
		}
		return validQuestion;
	}

	/**
	 * Description Validation. This method validates the given description.
	 * Description should not be null, empty, and also the length of the description
	 * should not be > 600
	 * 
	 * @param questionObject
	 * @return Returns true iff it is a valid description.
	 */
	public static boolean validateDescription(Question questionObject) {
		boolean validDescription = false;
		String description = questionObject.getDescription();
		Integer numberOfCharactersForDescription = 600;
		try {
			int descriptionLength = getLength(description);
			if (checkingForNullAndEmpty(description) && descriptionLength <= numberOfCharactersForDescription) {
				validDescription = true;
			}
		} catch (Exception e) {
			validDescription = false;
		}
		return validDescription;
	}

}

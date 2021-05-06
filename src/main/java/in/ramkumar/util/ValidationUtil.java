package in.ramkumar.util;

import static in.ramkumar.util.StringUtil.*;

import java.util.regex.Pattern;

public class ValidationUtil {

	/**
	 * This method validates the given name. The name should not be null, empty, and
	 * also name length <=20 characters.
	 * 
	 * @param name
	 * @return Returns true iff meets the above condition.
	 */
	public static boolean validateName(String name) {
		boolean validName = false;
		try {
			int nameLength = getLength(name);
			int numberOfCharactersForName = 20;
			if (name != null && name.trim() != "" && nameLength <= numberOfCharactersForName) {
				validName = true;
			}
		} catch (Exception e) {
			validName = false;
		}
		return validName;
	}

	/**
	 * This method validates the given password. The password should not be null,
	 * empty, and also password length >=8 characters.
	 * 
	 * @param password
	 * @return Returns true iff meets the above condition.
	 */
	public static boolean validatePassword(String password) {
		boolean validPassword = false;
		try {
			String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
			boolean validPasswordPattern = Pattern.matches(passwordPattern, password);
			if (password != null && password.trim() != "" && validPasswordPattern) {
				validPassword = true;
			}
		} catch (Exception e) {
			validPassword = false;
		}
		return validPassword;
	}

	/**
	 * This method validates the given email. Condition: The email should not be
	 * null, empty, and also it should meet the email pattern.
	 * 
	 * @param email
	 * @return Returns true iff meets the above condition.
	 */
	public static boolean validateEmail(String email) {
		String emailPattern = "[[A-Za-z]?0-9.]+@(?:[a-zA-Z0-9]+\\.)+[a-z]{2,6}$";
		boolean validPassword = false;
		try {
			boolean validEmailPattern = Pattern.matches(emailPattern, email);
			if (email != null && email.trim() != "" && validEmailPattern) {
				validPassword = true;
			}
		} catch (Exception e) {
			validPassword = false;
		}
		return validPassword;
	}
}

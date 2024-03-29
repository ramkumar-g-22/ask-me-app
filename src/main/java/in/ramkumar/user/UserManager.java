package in.ramkumar.user;

import java.util.ArrayList;

import in.ramkumar.util.ValidationUtil;

import static in.ramkumar.util.ValidationUtil.*;
import static in.ramkumar.util.StringUtil.*;

public class UserManager {

	private static ArrayList<User> userList = new ArrayList<User>();

	/**
	 * User Registration.
	 * This validates the user name, password, email given by the user. If it is a
	 * valid user then it will be added to the userList.
	 * 
	 * @param userObject
	 * @return Returns true iff all the details given by the user are valid.
	 */
	public static boolean registerUser(User userObject) {
		String name = userObject.getName();
		String email = userObject.getEmail().toLowerCase();
		String password = userObject.getPassword();
		boolean validUser = false;

		boolean validName = validateName(name);
		boolean validPassword = validatePassword(password);
		boolean validEmail = validateEmail(email);

		int userIndex = -1; // The user doesn't exist in the userList.
		if (validEmail) {
			userIndex = getUserIndexWithEmail(email); // Checking user already exists in the userList.
		}

		/*
		 * If the user does not exist in the userList, then only user information will
		 * be validated and added to the userList.
		 */
		if (userIndex == -1 && validEmail && validPassword && validName) {
			userList.add(userObject);
			validUser = true;
		}
		return validUser;
	}

	/**
	 * @return Returns the list of users as ArrayList.
	 */
	public static ArrayList<User> getAllUser() {
		return userList;
	}

	/**
	 * @return Returns the number of users in the userList.
	 */
	public static int getNumberOfUsers() {
		return userList.size();
	}

	/**
	 * This method checks the given email exist in the userList.
	 * 
	 * @param email
	 * @return Returns the user index for the given email.
	 */
	public static int getUserIndexWithEmail(String email) {
		int userIndex = -1;
		for (User user : userList) {
			if (user.getEmail().equals(email)) {
				userIndex = userList.indexOf(user);
				break;
			}
		}
		return userIndex;
	}

	/**
	 * User Login.
	 * This method checks the user exist in the userList. If the user exist, user
	 * object index will be return by getUserIndexWithEmail(email). With user index
	 * we can get the user object reference. And then email and password is
	 * verified.
	 * 
	 * @param email
	 * @return Returns true if the user email and password given by the user is
	 *         verified with user object and it should match with user
	 */
	public static boolean login(String email, String password) {
		boolean validUser = false;
		boolean validEmail = checkingForNullAndEmpty(email);
		boolean validPassword = checkingForNullAndEmpty(password);

		/*
		 * If the user email, password is not null and empty, then get the user index
		 * from the userList.
		 */
		if (validEmail && validPassword) {
			int userIndex = getUserIndexWithEmail(email);
			if (userIndex != -1) {
				User user = userList.get(userIndex);
				if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
					validUser = true;
				}
			}
		}
		return validUser;
	}

	/**
	 * Update UserName.
	 * This method validates the given new user name. If it is a valid user name
	 * then only it will change their new user name.
	 * 
	 * @param email
	 * @param newUserName
	 * @return Returns true iff the user name is successfully changed to new user
	 *         name.
	 */
	public static boolean changeUserName(String email, String newUserName) {
		boolean validUser = false;
		boolean validUserName = ValidationUtil.validateName(newUserName);
		int userIndex = -1;
		if (validUserName) {
			userIndex = getUserIndexWithEmail(email);
		}
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.setName(newUserName);
			userList.set(userIndex, user);
			validUser = true;
		}
		return validUser;
	}

	/**
	 * Update Password.
	 * This method validates the given new user password. If it is a valid password
	 * then only it will update their new password.
	 * 
	 * @param email
	 * @param newPassword
	 * @return Returns true iff the user password is successfully changed to new
	 *         password.
	 */
	public static boolean changePassword(String email, String newPassword) {
		boolean validUser = false;
		boolean validPassword = ValidationUtil.validatePassword(newPassword);
		int userIndex = -1;
		if (validPassword) {
			userIndex = getUserIndexWithEmail(email);
		}
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.setPassword(newPassword);
			userList.set(userIndex, user);
			validUser = true;
		}
		return validUser;
	}

	/**
	 * Update Email.
	 * This method validates the given new user email. If it is a valid email then
	 * only it will update their new email.
	 * 
	 * @param email
	 * @param newEmail
	 * @return Returns true iff the user newEmail is successfully changed to new
	 *         email.
	 */
	public static boolean changeEmail(String email, String newEmail) {
		boolean validUser = false;
		boolean validEmail = ValidationUtil.validateEmail(newEmail);
		int userIndex = -1;
		if (validEmail) {
			userIndex = getUserIndexWithEmail(email);
		}
		if (userIndex != -1) {
			User user = userList.get(userIndex);
			user.setEmail(newEmail.toLowerCase());
			userList.set(userIndex, user);
			validUser = true;
		}
		return validUser;
	}

}

package in.ramkumar.user;

import java.util.ArrayList;
import static in.ramkumar.util.ValidationUtil.*;

public class UserManager {

	private static ArrayList<User> userList = new ArrayList<User>();

	/**
	 * This validates the user name, password, email given by the user. If it is a
	 * valid user then it will be added to the userList.
	 * 
	 * @param userObject
	 * @return Returns true iff all the details given by the user are valid.
	 */
	public static boolean registerUser(User userObject) {
		String name = userObject.getName();
		String email = userObject.getEmail();
		String password = userObject.getPassword();
		boolean validUser = false;

		int userIndex = getUserIndexWithEmail(email); // Checking user already exists in the userList.

		/*
		 * If the user does not already exists in the userList, then only user
		 * information will be validated and added to the userList.
		 */
		if (userIndex == -1) {
			boolean validName = validateName(name);
			boolean validPassword = validatePassword(password);
			boolean validEmail = validateEmail(email);

			if (validName && validEmail && validPassword) {
				userList.add(userObject);
				validUser = true;
			}
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
}

package in.ramkumar.admin.user_manager_team;

import static in.ramkumar.util.ValidationUtil.validateEmail;
import static in.ramkumar.util.ValidationUtil.validateName;
import static in.ramkumar.util.ValidationUtil.validatePassword;

import java.util.ArrayList;

import in.ramkumar.user.User;
import in.ramkumar.user.UserManager;

public class UserManagerTeamManager {
	private static ArrayList<UserManagerTeam> userManagerTeams = new ArrayList<UserManagerTeam>();

	public static boolean registerUserManagerTeam(UserManagerTeam userManagerTeam) {
		boolean validUser = false;
		boolean validEmail = validateEmail(userManagerTeam.getEmail());
		boolean validPassword = validatePassword(userManagerTeam.getPassword());
		boolean validName = validateName(userManagerTeam.getName());
		
		int userIndex = -1; // The user doesn't exist in the userList.
		if (validEmail) {
			userIndex = getUserManagerIndexWithEmail(userManagerTeam.getEmail()); // Checking user already exists in the userList.
		}

		/*
		 * If the user does not exist in the userList, then only user
		 * information will be validated and added to the userList.
		 */
		if (userIndex == -1 && validEmail && validPassword && validName) {
				userManagerTeams.add(userManagerTeam);
				validUser = true;
		}
		return validUser;
	}
	
	/**
	 * @return Returns the list of users in userManagerTeams as ArrayList.
	 */
	public static ArrayList<UserManagerTeam> getAllUser() {
		return userManagerTeams;
	}

	/**
	 * @return Returns the number of users in the userManagerTeams.
	 */
	public static int getNumberOfUsersInUserManagerTeams() {
		return userManagerTeams.size();
	}

	/**
	 * This method checks the given email exist in the userManagerTeamList.
	 * 
	 * @param email
	 * @return Returns the user index for the given email.
	 */
	public static int getUserManagerIndexWithEmail(String email) {
		int userIndex = -1;
		for (UserManagerTeam userManagerTeam : userManagerTeams) {
			if (userManagerTeam.getEmail().equals(email)) {
				userIndex = userManagerTeams.indexOf(userManagerTeam);
				break;
			}
		}
		return userIndex;
	}

	/**
	 * UserManagerTeam can remove the user.
	 * @param user
	 * @return 
	 */
	public static boolean removeUser(User user) {
		ArrayList<User> users = UserManager.getAllUser();
		return users.remove(user);
	}

}

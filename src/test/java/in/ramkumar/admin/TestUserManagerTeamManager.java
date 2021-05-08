package in.ramkumar.admin;

import static org.junit.Assert.*;

import org.junit.Test;

import in.ramkumar.admin.user_manager_team.UserManagerTeamManager;
import in.ramkumar.user.User;
import in.ramkumar.user.UserManager;

public class TestUserManagerTeamManager {

	/**
	 * Testing with removing valid user
	 */
	@Test
	public void testRemoveValidUser() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar.g.04@gmail.com");
		user.setPassword("Pass@123");
		UserManager.registerUser(user);
		boolean validUser = UserManagerTeamManager.removeUser(user);
		assertTrue(validUser);
	}

	/**
	 * Testing with removing invalid user
	 */
	@Test
	public void testRemoveInvalidUser() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar.g.04@gmail.com");
		user.setPassword("Pass@123");
		UserManager.registerUser(user);
		boolean validUser = UserManagerTeamManager.removeUser(null);
		assertFalse(validUser);
	}

}

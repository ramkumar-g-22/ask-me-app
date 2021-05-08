package in.ramkumar.user;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLoginUserManager {

	/**
	 * This method performs user registration with valid inputs.
	 */
	public User registerUser() {
		User user = new User();
		user.setEmail("ramkumar.g.0420@gmail.com");
		user.setPassword("Pass@1234");
		user.setName("Ramkumar G");
		UserManager.registerUser(user);
		return user;
	}

	/**
	 * Testing with valid inputs.
	 */
	@Test
	public void testLoginUserWithValidInputs() {
		registerUser();
		boolean validUser = UserManager.login("ramkumar.g.0420@gmail.com", "Pass@1234");
		assertTrue(validUser);
	}

	/**
	 * Testing with invalid email(not exist in the userList).
	 */
	@Test
	public void testLoginUserWithInvalidEmail() {
		registerUser();
		boolean validUser = UserManager.login("ramkumar.g.042@gmail.com", "Pass@1234");
		assertFalse(validUser);
	}

	/**
	 * Testing with invalid password and valid email(exist in the userList).
	 */
	@Test
	public void testLoginUserWithValidEmailAndInvalidPassword() {
		registerUser();
		boolean validUser = UserManager.login("ramkumar.g.0420@gmail.com", "pass@1234");
		assertFalse(validUser);
	}

	/**
	 * Testing with empty email, password.
	 */
	@Test
	public void testLoginUserWithEmptyEmailAndPassword() {
		registerUser();
		boolean validUser = UserManager.login("", "");
		assertFalse(validUser);
	}

	/**
	 * Testing with null email, password.
	 */
	@Test
	public void testLoginUserNullEmailAndPassword() {
		registerUser();
		boolean validUser = UserManager.login(null, null);
		assertFalse(validUser);
	}

}

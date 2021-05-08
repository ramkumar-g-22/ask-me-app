package in.ramkumar.user;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUpdateUserProfile {

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
	 * Testing with changing user name with valid email
	 */
	@Test
	public void testChangeUserNameWithValidEmail() {
		registerUser();
		boolean validName = UserManager.changeUserName("ramkumar.g.0420@gmail.com", "Ram");
		assertTrue(validName);
	}

	/**
	 * Testing with changing user name with invalid name
	 */
	@Test
	public void testChangeUserNameWithInvalidName() {
		registerUser();
		boolean validName = UserManager.changeUserName("ramkumar.g.0420@gmail.com", "");
		assertFalse(validName);
	}

	/**
	 * Testing with changing new email with valid email.
	 */
	@Test
	public void testChangeUserEmailWithValidEmail() {
		registerUser();
		boolean validName = UserManager.changeEmail("ramkumar.g.0420@gmail.com", "Ram@gmail.com");
		assertTrue(validName);
	}

	/**
	 * Testing with changing new email with invalid email.
	 */
	@Test
	public void testChangeUserEmailWithInvalidEmail() {
		registerUser();
		boolean validName = UserManager.changeEmail("ramkumar.g.0420@gmail.com", "Ram@gmailcom");
		assertFalse(validName);
	}

	/**
	 * Testing with changing new password with valid password.
	 */
	@Test
	public void testChangeUserPasswordWithValidPassword() {
		registerUser();
		boolean validName = UserManager.changePassword("ramkumar.g.0420@gmail.com", "Ram@1234");
		assertTrue(validName);
	}

	/**
	 * Testing with changing new password with invalid password.
	 */
	@Test
	public void testChangeUserPasswordWithInvalidEmail() {
		registerUser();
		boolean validName = UserManager.changePassword("ramkumar.g.0420@gmail.com", "ram@1234");
		assertFalse(validName);
	}

}

package in.ramkumar.user;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRegisterUserManager {

	/**
	 * Testing with valid inputs.
	 */
	@Test
	public void testRegisterUserWithValidInputs() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar.g.0420@gmail.com");
		user.setPassword("Pass@123");
		boolean validUser = UserManager.registerUser(user);
		assertTrue(validUser);		
	}
	
	/**
	 * Testing with already existing user(same email).
	 */
	@Test
	public void testRegisterUserWithAlreadyExistingUser() {
		System.out.println("Users : " + UserManager.getNumberOfUsers());
		User user1 = new User();
		user1.setName("Ramkumar G");
		user1.setEmail("ramkumar.g.0420@gmail.com");
		user1.setPassword("Pass@123");
		boolean validUser1 = UserManager.registerUser(user1);
		
		User user2 = new User();
		user2.setName("Ram G");
		user2.setEmail("ramkumar.g.0420@gmail.com");
		user2.setPassword("Pass@123456");
		boolean validUser2 = UserManager.registerUser(user2);
		
				
		/*
		 * User1 has to be added to userList, because no user exists in the userList.
		 * So we are expecting true as output.
		 */
		assertTrue(validUser1);
		
		/*
		 * User2(Same user) should not be added to the userList, because user exists in the userList.
		 * So we are expecting false as output.
		 */
		assertFalse(validUser2);	
	}

	/**
	 * Testing with empty name and valid email and password.
	 */
	@Test
	public void testRegisterUserWithEmptyName() {
		User user = new User();
		user.setName("");
		user.setEmail("ramkumar.g.0420@psr.edu.in");
		user.setPassword("Pass@123");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with null name and valid email and password.
	 */
	@Test
	public void testRegisterUserWithNullName() {
		User user = new User();
		user.setName(null);
		user.setEmail("ramkumar.g.0420@gmail.com");
		user.setPassword("Pass@123");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}

	/**
	 * Testing with invalid email(without @) and valid name and password.
	 */
	@Test
	public void testRegisterUserWithoutAtInEmail() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar.g.0420gmail.com");
		user.setPassword("Pass@123");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
		
	/**
	 * Testing with invalid email(without .) and valid name and password.
	 */
	@Test
	public void testRegisterUserWithoutDotInEmailDomain() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar0420gmailcom");
		user.setPassword("Pass@123");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with invalid email(with special characters) and valid name and password.
	 */
	@Test
	public void testRegisterUserWithInvalidSpecialCharacterInEmail() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ram kumar#0420@gmail.com");
		user.setPassword("Pass@123");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with null email and valid name and password.
	 */
	@Test
	public void testRegisterUserWithNullEmail() {
		User user = new User();
		user.setName("Ram");
		user.setEmail(null);
		user.setPassword("Pass@123");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with empty email and valid name and password.
	 */
	@Test
	public void testRegisterUserWithEmptyEmail() {
		User user = new User();
		user.setName("Ram");
		user.setEmail("");
		user.setPassword("Pass@123");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}


	/**
	 * Testing with invalid password(without special characters) and valid name and email.
	 */
	@Test
	public void testRegiterUserWithoutSpecialCharacterInPassword() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar.g.0420@gmail.com");
		user.setPassword("Pass1234");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with invalid password(without numbers) and valid name and email.
	 */
	@Test
	public void testRegiterUserWithoutNumberInPassword() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar.g.0420@gmail.com");
		user.setPassword("Pass#one");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with invalid password(without upper case letters) and valid name and email.
	 */
	@Test
	public void testRegiterUserWithoutUpperCaseInPassword() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar.g.0420@gmail.com");
		user.setPassword("pass&123");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with invalid password(with <8 characters) and valid name and email.
	 */
	@Test
	public void testRegiterUserWithLessthan8CharactersInPassword() {
		User user = new User();
		user.setName("Ramkumar G");
		user.setEmail("ramkumar.g.0420@gmail.com");
		user.setPassword("pass&12");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with null password and valid name and email.
	 */
	@Test
	public void testRegisterUserWithNullPassword() {
		User user = new User();
		user.setName("Ram");
		user.setEmail("ramkumar.g.0420@gmail.com");
		user.setPassword(null);
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}
	
	/**
	 * Testing with empty password and valid email and name.
	 */
	@Test
	public void testRegisterUserWithEmptyPassword() {
		User user = new User();
		user.setName("Ram");
		user.setEmail("ramkumar.g.0420@psr.edu.in");
		user.setPassword("");
		boolean validUser = UserManager.registerUser(user);
		assertFalse(validUser);		
	}

}

package in.ramkumar.user;

public class User {

	private String name;
	private String email;
	private String password;
	
	/**
	 * @return Returns the name of the user.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name for the current user.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return Returns the email of the user.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the email for the current user.
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return Returns the password of the user.
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Set the password for the current user.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Returns the string representation of User object.
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
			
}

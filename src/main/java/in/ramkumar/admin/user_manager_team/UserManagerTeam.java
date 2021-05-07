package in.ramkumar.admin.user_manager_team;

public class UserManagerTeam {
	private String name;
	private String password;
	private String email;

	/**
	 * @return Returns the name of the UserManagerTeam.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name for the current UserManagerTeam.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the email of the UserManagerTeam.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the email for the current UserManagerTeam.
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return Returns the password of the UserManagerTeam.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password for the current UserManagerTeam.
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Returns the string representation of UserManagerTeam object.
	 */
	@Override
	public String toString() {
		return "UserManagerTeam [name=" + name + ", password=" + password + ", email=" + email + "]";
	}

}

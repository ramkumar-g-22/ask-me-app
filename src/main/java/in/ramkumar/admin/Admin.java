package in.ramkumar.admin;

import in.ramkumar.admin.user_manager_team.UserManagerTeam;

public class Admin {
	
	private UserManagerTeam userManager;

	public UserManagerTeam getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManagerTeam userManager) {
		this.userManager = userManager;
	}

	@Override
	public String toString() {
		return "Admin [userManager=" + userManager + "]";
	}
	
}

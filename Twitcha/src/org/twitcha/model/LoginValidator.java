package org.twitcha.model;

public class LoginValidator {

	public boolean isLoginValid(String username, String password) {
		
		if (username.equals("andgomes") && password.equals("qwe123")) {
			return true;
		}
		
		return false;
		
	}

}

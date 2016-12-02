package models;

import java.security.NoSuchAlgorithmException;

import play.data.validation.Constraints;

public class LoginForm {
	@Constraints.Required
	public String email;
	@Constraints.Required
	public String password;

	public String validate() throws NoSuchAlgorithmException {
		if (User.authenticate(email, password) == null) {
			return "Invalid user or password";
		}
		return null;
	}
}

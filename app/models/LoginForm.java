package models;

import java.security.NoSuchAlgorithmException;

import play.data.validation.Constraints;

public class LoginForm {
	// sau khi check annotation-based constraints va se dc ngay VALIDATE()method
	@Constraints.Required
	public String email;
	@Constraints.Required
	public String password;

	public String validate() throws NoSuchAlgorithmException  {
		if (User.authenticate(email, password) == null) {
			return "Invalid user or password";
		}
		return null;
	}
	public String validate1()  {
		String temp = "why auto pass here";
		if(temp != "")
			return "musukashi";
		return null;
	}

}

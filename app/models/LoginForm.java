package models;

import java.security.NoSuchAlgorithmException;

import play.data.validation.Constraints;

public class LoginForm {
	  @Constraints.Required
	  public String name;
	  @Constraints.Required
	  public String password;

	  public String validate() throws NoSuchAlgorithmException {
	    if (User.authenticate(name, password) == null) {
	      return "Invalid user or password";
	    }
	    return null;
	  }
	}

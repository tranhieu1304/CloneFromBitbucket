package controllers;

import java.util.Optional;

import com.google.inject.Inject;

import constants.Constant;
import helpers.Secured;
import models.LoginForm;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.filters.csrf.AddCSRFToken;
import play.filters.csrf.CSRF.Token;
import play.filters.csrf.RequireCSRFCheck;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

public class AuthController extends Controller {
	@Inject
	FormFactory formFactory;

	@AddCSRFToken
	public Result login() {
		Form<LoginForm> f = formFactory.form(LoginForm.class);
		@SuppressWarnings("unused")
		Optional<Token> tem = play.filters.csrf.CSRF.getToken(request());
		return ok(views.html.Author.login.render(f));
	}
	@AddCSRFToken
	@RequireCSRFCheck
	public Result auth() {
		Form<LoginForm> f = formFactory.form(LoginForm.class).bindFromRequest();
		@SuppressWarnings("unused")
		Optional<Token> tem = play.filters.csrf.CSRF.getToken(request());
		if (f.hasErrors()) {
			System.out.println(f.errors().toString());
			return badRequest(views.html.Author.login.render(f));
		} else {
			session(Constant.SESSION_USER_EMAIL, f.get().email);
			session(Constant.SESSION_USER_NAME, User.findByEmail(f.get().email).name);
			String returnUrl = ctx().session().get(Constant.SESSION_RETURN_URL);
			if (returnUrl == null
					|| returnUrl.equals("")
					|| returnUrl.equals(routes.AuthController.login().absoluteURL(request()))) {
				returnUrl = routes.Application.index().url();
			}
			return redirect(returnUrl);
		}
	}

	@Security.Authenticated(Secured.class)
	public Result logout() {
		session().clear();
		return redirect(routes.AuthController.login());
	}
}

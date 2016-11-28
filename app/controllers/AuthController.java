package controllers;

import com.google.inject.Inject;

import constants.Constant;
import helpers.Secured;
import models.LoginForm;
import play.data.Form;
import play.data.FormFactory;
import play.filters.csrf.AddCSRFToken;
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
		return ok(views.html.Author.login.render(f));
	}
	@AddCSRFToken
	@RequireCSRFCheck
	public Result auth() {
		Form<LoginForm> f = formFactory.form(LoginForm.class).bindFromRequest();

		if (f.hasErrors()) {
			return badRequest(views.html.Author.login.render(f));
		} else {
			session(Constant.SESSION_USER_NAME, f.get().name);
			String returnUrl = ctx().session().get(Constant.SESSION_RETURN_URL);
			if (returnUrl == null
					|| returnUrl.equals("")
					|| returnUrl.equals(routes.AuthController.login().absoluteURL(
							request()))) {
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

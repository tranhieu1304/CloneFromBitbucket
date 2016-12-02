package controllers;

import com.google.inject.Inject;

import constants.Constant;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller {
	@Inject
	FormFactory formFactory;

	public Result add() {
		Form<User> f = formFactory.form(User.class);

		return ok(views.html.User.add.render(f));
	}

	public Result create() {
		Form<User> f = formFactory.form(User.class).bindFromRequest();
		if (f.hasErrors()) {
			return badRequest(views.html.User.add.render(f));
		} else {
			User data = f.get();
			data.save();
			session(Constant.SESSION_USER_EMAIL, f.get().email);
			session(Constant.SESSION_USER_NAME, data.name);
			String returnUrl = ctx().session().get(Constant.SESSION_RETURN_URL);
			if (returnUrl == null || returnUrl.equals("")
					|| returnUrl.equals(routes.AuthController.login().absoluteURL(request()))) {
				returnUrl = routes.Application.index().url();
			}
			return redirect(returnUrl);
		}
	}

	public Result editUser(String userName) {
		User user = User.findByEmail(userName);
		if (user != null) {
			Form<User> f = formFactory.form(User.class).fill(user);
			return ok(views.html.User.userDetail.render(f));
		}
		return notFound();
	}

	public Result update() {
		Form<User> form = formFactory.form(User.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(views.html.User.userDetail.render(form));
		} else {
			User user = form.get();
			user.update();
			return ok(views.html.User.userDetail.render(form));
		}
	}
}

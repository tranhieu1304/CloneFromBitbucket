package controllers;

import com.google.inject.Inject;

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
			
			return ok("投稿記事一覧画面のURLを記載");
		}
	}
}

package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;

import constants.Constant;
import models.Favorite;
import models.Post;
import models.User;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class FavoriteController extends Controller {

	@Inject
	FormFactory formfactory;

	public Result favoriedPost() {
		String userName = session(Constant.SESSION_USER_EMAIL);
		User user = User.findByEmail(userName);

		DynamicForm form = formfactory.form().bindFromRequest();
		Form<User> userForm = formfactory.form(User.class).bindFromRequest();
		DynamicForm dyForm = DynamicForm.form().bindFromRequest();
		ObjectNode result = Json.newObject();
		if (!form.hasErrors()) {
			try {
				Long postId = Long.parseLong(form.get("postId"));
				Long favoriteId = Long.parseLong(form.get("favotiteId"));
				Post post = Post.findById(postId);
				Favorite favorite = Favorite.findbyId(favoriteId);
				if (favorite == null) {
					favorite = new Favorite();
					favorite.post = post;
					favorite.user = user;
					favorite.save();
				} else {
					favorite.changeStatus();
				}
				// Check data when get Favorite
				result.put("status", "ok");
				result.put("favoriteId", Favorite.findByUserAndPost(user, post).id);
			} catch (Exception e) {
				result.put("status", "fail");
				return notFound();
			}
		} else
			result.put("status", "fail");
		return ok(result);
	}

}

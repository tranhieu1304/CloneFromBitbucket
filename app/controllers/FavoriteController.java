package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;

import constants.Constant;
import models.Favorite;
import models.Post;
import models.User;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class FavoriteController extends Controller {

	@Inject
	FormFactory formfactory;

	public Result favoriedPost() {
		String userName = session(Constant.SESSION_USER_NAME);
		User user = User.findByName(userName);

		DynamicForm form = formfactory.form().bindFromRequest();
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
				result.put("status", "ok");
			} catch (Exception e) {
				return notFound();
			}
		} else
			result.put("status", "fail");
		return ok(result);
	}

}

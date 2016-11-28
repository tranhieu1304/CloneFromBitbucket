/**
 * 
 */
package controllers;

import java.util.List;

import com.google.inject.Inject;

import helpers.Secured;
import models.Comment;
import models.Post;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * @author mac_thieu
 *
 */
@Security.Authenticated(Secured.class)
public class CommentController extends Controller {

	@Inject
	FormFactory formFactory;

	public Result createComment(Long postId) {
		//  This request send one more time to server >>> let fix it
		Http.Request request = Http.Context.current().request();
		String userName = request.username();
		User user = User.findByName(userName);
		Post post = Post.findById(postId);
		Form<Comment> form = formFactory.form(Comment.class).bindFromRequest();
		if (!form.hasErrors()) {
			Comment comment = form.get();
			comment.user = user;
			comment.post = post;
			comment.save();
		} else {
			return badRequest("Have some error");
		}
		List<Post> posts = Post.findByUser(user);
		return ok(views.html.Post.postDetail.render(post, form));
	}


}

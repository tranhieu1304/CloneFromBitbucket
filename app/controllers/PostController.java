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
public class PostController extends Controller {

	@Inject
	FormFactory formFactory;

	public Result showAllPost() {
		List<Post> posts = Post.findAll();
		return ok(views.html.Post.showPostList.render(posts));
	}

	public Result addPost() {
		Http.Request request = Http.Context.current().request();
		String userName = request.username();
		User user = User.findByName(userName);
		Form<Post> form = formFactory.form(Post.class);
		List<Post> posts = Post.findByUser(user);
		return ok(views.html.Post.createNewPost.render(form, posts, ""));
	}

	public Result createPost() {
		//  This request send one more time to server >>> let fix it
		Http.Request request = Http.Context.current().request();
		String userName = request.username();
		User user = User.findByName(userName);
		
		Form<Post> form = formFactory.form(Post.class).bindFromRequest();
		if (!form.hasErrors()) {
			Post post = form.get();
			post.user = user;
			post.title = post.url;
			post.save();
		} else {
			return badRequest("Have some error");
		}
		List<Post> posts = Post.findByUser(user);
		return ok(views.html.Post.createNewPost.render(form, posts, ""));
	}
	
	public Result viewPostDetail(Long postId){
		Post post = Post.findById(postId);
		Form<Comment> formComment = formFactory.form(Comment.class);
		return ok(views.html.Post.postDetail.render(post, formComment));
	}

}
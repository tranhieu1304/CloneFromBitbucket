/**
 * 
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
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
import util.URLGetTitle;

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
		User user = User.findByEmail(userName);
		Form<Post> form = formFactory.form(Post.class);
		List<Post> posts = Post.findByUser(user);
		return ok(views.html.Post.createNewPost.render(form, posts, new ArrayList<String>()));
	}

	public Result createPost() {
		// This request send one more time to server >>> let fix it
		Http.Request request = Http.Context.current().request();
		String userName = request.username();
		User user = User.findByEmail(userName);
		List<Post> posts = Post.findByUser(user);
		Form<Post> form = formFactory.form(Post.class).bindFromRequest();
		Post post = new Post();
		if (!form.hasErrors()) {
			post = form.get();
			post.user = user;
			if (post.url.isEmpty()) {
				post.messageError.add("URLを入力してください。");
			} else
				try {
					if (isExistUrl(post.url)) {
						post.messageError.add("URLがありますが、他のURLを入力してください。");
					}
					post.title = URLGetTitle.getTitle(post.url);
					post.imgUrl = URLGetTitle.getImageUrl(post.url, "");
				} catch (IOException e) {
					e.printStackTrace();
					post.messageError.add("正しいURLを入力してください。");
				} catch (Exception e) {
					post.messageError.add("正しいURLを入力してください。");
				}
			if (post.messageError.isEmpty()) {
				post.save();
				form = formFactory.form(Post.class);
				posts = Post.findByUser(user);
			}
		} else {
			return badRequest("Have some error");
		}
		return ok(views.html.Post.createNewPost.render(form, posts, post.messageError));
	}

	public Result viewPostDetail(Long postId) {
		Post post = Post.findById(postId);
		Form<Comment> formComment = formFactory.form(Comment.class);
		return ok(views.html.Post.postDetail.render(post, formComment));
	}

	private boolean isExistUrl(String url) {
		List<Post> posts = Post.findByUrl(url);
		if (posts.isEmpty())
			return false;
		else
			return true;
	}

	public Result findPost() {
		Form<FindForm> form = formFactory.form(FindForm.class).bindFromRequest();
		List<Post> posts = new ArrayList<>();

		if (!form.hasErrors()) {
			String keyword = form.get().keyword;
			if ("".equals(keyword) || keyword == null) {
				posts = Post.findAll();
			} else {
				posts = Post.findTitle(keyword);
			}
		}
		return ok(views.html.Post.findPost.render(posts, form));
	}

	public static class FindForm {
		public String keyword;
	}

}

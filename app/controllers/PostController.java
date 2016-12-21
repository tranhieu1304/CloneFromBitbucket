/**
 * 
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.avaje.ebean.PagedList;
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

	public Result showAllPost(int page) {
		PagedList<Post> pageList = Post.getPageList(page);
		@SuppressWarnings("unused")
		Http.Request request = Http.Context.current().request();
		List<Post> posts = pageList.getList();
		int maxPage = pageList.getTotalPageCount();
		// FOr test
		Post.findByPostIdCommentStatus(1l);

		return ok(views.html.Post.showPostList.render(posts, page, maxPage));
	}

	public Result addPost(int page) {
		Http.Request request = Http.Context.current().request();
		String userName = request.username();
		User user = User.findByEmail(userName);
		Form<Post> form = formFactory.form(Post.class);
		PagedList<Post> pageList = Post.findByUser(user, page);
		int maxPage = pageList.getTotalPageCount();
		List<Post> posts = pageList.getList();
		return ok(views.html.Post.createNewPost.render(form, posts, new ArrayList<String>(), page, maxPage));
	}

	public Result createPost(int page) {
		// This request send one more time to server >>> let fix it
		Http.Request request = Http.Context.current().request();
		String userName = request.username();
		User user = User.findByEmail(userName);
		PagedList<Post> pageList = Post.findByUser(user, 1);
		int maxPage = pageList.getTotalPageCount();

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

			}
		} else {
			return badRequest("Have some error");
		}
		List<Post> posts = pageList.getList();
		return ok(views.html.Post.createNewPost.render(form, posts, post.messageError, page, maxPage));
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

	public Result findPost(int page) {
		Form<FindForm> form = formFactory.form(FindForm.class).bindFromRequest();
		PagedList<Post> pageList;
		int maxPage = 0;
		List<Post> posts = new ArrayList<>();

		if (!form.hasErrors()) {
			String keyword = form.get().keyword;
			if ("".equals(keyword) || keyword == null) {
				pageList = Post.findAll(page);
			} else {
				pageList = Post.findTitle(keyword, page);
			}
			posts = pageList.getList();
			maxPage = pageList.getTotalPageCount();
		}
		return ok(views.html.Post.findPost.render(posts, form, page, maxPage));
	}

	public static class FindForm {
		public String keyword;
	}

}

package controllers.api;

import java.util.ArrayList;
import java.util.List;

import models.Post;
import models.entity.PostResponseAPI;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class PostAPI extends Controller {

	public Result getPost(Long id) {
		System.out.println("get One");
		PostResponseAPI postRes = new PostResponseAPI();
		Post post = Post.findById(id);
		postRes.setPostId(post.id);
		postRes.setTitle(post.title);
		return ok(Json.toJson(postRes));
	}

	public Result getAllPost() {
		System.out.println("get All");
		List<PostResponseAPI> postRes = new ArrayList<>();
		List<Post> post = Post.findAll();
		for (int i = 0; i < post.size(); i++) {
			PostResponseAPI temPost = new PostResponseAPI();
			temPost.setPostId(post.get(i).id);
			temPost.setTitle(post.get(i).title);
			postRes.add(temPost);
		}
		return ok(Json.toJson(postRes));
	}
}

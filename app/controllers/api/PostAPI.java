package controllers.api;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Post;
import models.User;
import models.entity.PostResponseAPI;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.Context;
import play.mvc.Result;

//@Security.Authenticated(Secured.class)
public class PostAPI extends Controller {

	public Result getPost(Long id) {
		System.out.println("get One");
		PostResponseAPI postRes = new PostResponseAPI();
		Post post = Post.findById(id);
		postRes.setPostId(post.id);
		postRes.setTitle(post.title);

		return ok(Json.toJson(postRes));
	}

	// error
	// @BodyParser.Of(play.mvc.BodyParser.Json.class)
	public Result getAllPost(String token) {
		JsonNode json = request().body().asJson();
		ObjectNode result = Json.newObject();
		Http.Request request = Http.Context.current().request();
		// String[]csrfToken = request.headers()
		Context req = Http.Context.current.get();
		// String[] data = request().cookie("PLAY_SESSION");
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

	public Result authentiaton(String username, String password) {
		try {
			User user = User.authenticate(username, password);
			if (user != null) {
				@SuppressWarnings("static-access")
				String token = CreateToken.createJWT(user.id.toString(), user.userName(), user.email, "Kame", 600000l);
				return ok(token);
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// do something luon chay mac ke sau try hoac catch. ko quan tam
		}
		return badRequest("Login fail");
	}

}

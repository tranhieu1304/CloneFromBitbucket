package helpers;

import java.util.concurrent.CompletionStage;

import constants.Constant;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Http.Context;
import play.mvc.Result;

public class SecuredAction extends Action.Simple {

	@Override
	public CompletionStage<Result> call(Context arg0) {
		// String token = getTokenFromHeader(ctx);
		// if (token != null) {
		// User user = User.find.where().eq("authToken", token).findUnique();
		// if (user != null) {
		// ctx.request().setUsername(user.username);
		// return delegate.call(ctx);
		// }
		// }
		// Result unauthorized = Results.unauthorized("unauthorized");
		// return F.Promise.pure(unauthorized);
		return null;
	}

	@SuppressWarnings("unused")
	private String getTokenFromHeader(Context ctx) {
		String[] authTokenHeaderValues = ctx.request().headers().get("X-AUTH-TOKEN");
		if ((authTokenHeaderValues != null) && (authTokenHeaderValues.length == 1)
				&& (authTokenHeaderValues[0] != null)) {
			return authTokenHeaderValues[0];
		}
		return null;
	}

}

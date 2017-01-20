package helpers;

import constants.Constant;
import controllers.routes;
import play.mvc.Http;
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get(Constant.SESSION_USER_EMAIL);
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        String returnUrl = ctx.request().uri();
        ctx.session().put(Constant.SESSION_RETURN_URL, returnUrl);
        return redirect(routes.AuthController.login());
    }
//    @SuppressWarnings("unused")
//	private String getTokenFromHeader(Http.Context ctx) {
//        String[] authTokenHeaderValues = ctx.request().headers().get("X-AUTH-TOKEN");
//        if ((authTokenHeaderValues != null) && (authTokenHeaderValues.length == 1) && (authTokenHeaderValues[0] != null)) {
//            return authTokenHeaderValues[0];
//        }
//        return null;
//    }
}

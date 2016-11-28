package helpers;

import constants.Constant;
import controllers.routes;
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get(Constant.SESSION_USER_NAME);
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        String returnUrl = ctx.request().uri();
        ctx.session().put(Constant.SESSION_RETURN_URL, returnUrl);
        return redirect(routes.AuthController.login());
    }

}

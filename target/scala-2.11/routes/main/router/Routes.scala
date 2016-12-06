
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/feedpicks/conf/routes
// @DATE:Tue Dec 06 14:09:47 JST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  Application_3: controllers.Application,
  // @LINE:5
  UserController_1: controllers.UserController,
  // @LINE:7
  AuthController_0: controllers.AuthController,
  // @LINE:12
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    Application_3: controllers.Application,
    // @LINE:5
    UserController_1: controllers.UserController,
    // @LINE:7
    AuthController_0: controllers.AuthController,
    // @LINE:12
    Assets_2: controllers.Assets
  ) = this(errorHandler, Application_3, UserController_1, AuthController_0, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_3, UserController_1, AuthController_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.UserController.add"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.UserController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.AuthController.auth"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_UserController_add1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_UserController_add1_invoker = createInvoker(
    UserController_1.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "add",
      Nil,
      "GET",
      """""",
      this.prefix + """add"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UserController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_UserController_create2_invoker = createInvoker(
    UserController_1.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """create"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AuthController_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_login3_invoker = createInvoker(
    AuthController_0.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AuthController_auth4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_AuthController_auth4_invoker = createInvoker(
    AuthController_0.auth,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "auth",
      Nil,
      "POST",
      """""",
      this.prefix + """auth"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AuthController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthController_logout5_invoker = createInvoker(
    AuthController_0.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_3.index)
      }
  
    // @LINE:5
    case controllers_UserController_add1_route(params) =>
      call { 
        controllers_UserController_add1_invoker.call(UserController_1.add)
      }
  
    // @LINE:6
    case controllers_UserController_create2_route(params) =>
      call { 
        controllers_UserController_create2_invoker.call(UserController_1.create)
      }
  
    // @LINE:7
    case controllers_AuthController_login3_route(params) =>
      call { 
        controllers_AuthController_login3_invoker.call(AuthController_0.login)
      }
  
    // @LINE:8
    case controllers_AuthController_auth4_route(params) =>
      call { 
        controllers_AuthController_auth4_invoker.call(AuthController_0.auth)
      }
  
    // @LINE:9
    case controllers_AuthController_logout5_route(params) =>
      call { 
        controllers_AuthController_logout5_invoker.call(AuthController_0.logout)
      }
  
    // @LINE:12
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_2.versioned(path, file))
      }
  }
}


// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/feedpicks-identity/conf/routes
// @DATE:Mon Nov 28 10:58:37 JST 2016

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
  Application_5: controllers.Application,
  // @LINE:6
  PostController_3: controllers.PostController,
  // @LINE:12
  CommentController_2: controllers.CommentController,
  // @LINE:16
  UserController_1: controllers.UserController,
  // @LINE:20
  AuthController_0: controllers.AuthController,
  // @LINE:25
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    Application_5: controllers.Application,
    // @LINE:6
    PostController_3: controllers.PostController,
    // @LINE:12
    CommentController_2: controllers.CommentController,
    // @LINE:16
    UserController_1: controllers.UserController,
    // @LINE:20
    AuthController_0: controllers.AuthController,
    // @LINE:25
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_5, PostController_3, CommentController_2, UserController_1, AuthController_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, PostController_3, CommentController_2, UserController_1, AuthController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listPost""", """controllers.PostController.showAllPost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPost""", """controllers.PostController.addPost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createPost""", """controllers.PostController.createPost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createPost/""" + "$" + """postId<[^/]+>""", """controllers.PostController.viewPostDetail(postId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addComment/""" + "$" + """postId<[^/]+>""", """controllers.CommentController.createComment(postId:Long)"""),
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
    Application_5.index,
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

  // @LINE:6
  private[this] lazy val controllers_PostController_showAllPost1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listPost")))
  )
  private[this] lazy val controllers_PostController_showAllPost1_invoker = createInvoker(
    PostController_3.showAllPost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "showAllPost",
      Nil,
      "GET",
      """For Post--------------------------------------------------------------------""",
      this.prefix + """listPost"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PostController_addPost2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPost")))
  )
  private[this] lazy val controllers_PostController_addPost2_invoker = createInvoker(
    PostController_3.addPost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "addPost",
      Nil,
      "GET",
      """""",
      this.prefix + """addPost"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_PostController_createPost3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPost")))
  )
  private[this] lazy val controllers_PostController_createPost3_invoker = createInvoker(
    PostController_3.createPost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "createPost",
      Nil,
      "POST",
      """""",
      this.prefix + """createPost"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PostController_viewPostDetail4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPost/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_viewPostDetail4_invoker = createInvoker(
    PostController_3.viewPostDetail(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "viewPostDetail",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """createPost/""" + "$" + """postId<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CommentController_createComment5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addComment/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_createComment5_invoker = createInvoker(
    CommentController_2.createComment(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "createComment",
      Seq(classOf[Long]),
      "GET",
      """For Comment--------------------------------------------------------------------""",
      this.prefix + """addComment/""" + "$" + """postId<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_add6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_UserController_add6_invoker = createInvoker(
    UserController_1.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "add",
      Nil,
      "GET",
      """For User--------------------------------------------------------------------""",
      this.prefix + """add"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_create7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_UserController_create7_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_AuthController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_login8_invoker = createInvoker(
    AuthController_0.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "login",
      Nil,
      "GET",
      """For Authenticate-------------------------------------------------------------""",
      this.prefix + """login"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_AuthController_auth9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_AuthController_auth9_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_AuthController_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthController_logout10_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_5.index)
      }
  
    // @LINE:6
    case controllers_PostController_showAllPost1_route(params) =>
      call { 
        controllers_PostController_showAllPost1_invoker.call(PostController_3.showAllPost)
      }
  
    // @LINE:7
    case controllers_PostController_addPost2_route(params) =>
      call { 
        controllers_PostController_addPost2_invoker.call(PostController_3.addPost)
      }
  
    // @LINE:8
    case controllers_PostController_createPost3_route(params) =>
      call { 
        controllers_PostController_createPost3_invoker.call(PostController_3.createPost)
      }
  
    // @LINE:9
    case controllers_PostController_viewPostDetail4_route(params) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_PostController_viewPostDetail4_invoker.call(PostController_3.viewPostDetail(postId))
      }
  
    // @LINE:12
    case controllers_CommentController_createComment5_route(params) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommentController_createComment5_invoker.call(CommentController_2.createComment(postId))
      }
  
    // @LINE:16
    case controllers_UserController_add6_route(params) =>
      call { 
        controllers_UserController_add6_invoker.call(UserController_1.add)
      }
  
    // @LINE:17
    case controllers_UserController_create7_route(params) =>
      call { 
        controllers_UserController_create7_invoker.call(UserController_1.create)
      }
  
    // @LINE:20
    case controllers_AuthController_login8_route(params) =>
      call { 
        controllers_AuthController_login8_invoker.call(AuthController_0.login)
      }
  
    // @LINE:21
    case controllers_AuthController_auth9_route(params) =>
      call { 
        controllers_AuthController_auth9_invoker.call(AuthController_0.auth)
      }
  
    // @LINE:22
    case controllers_AuthController_logout10_route(params) =>
      call { 
        controllers_AuthController_logout10_invoker.call(AuthController_0.logout)
      }
  
    // @LINE:25
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_4.versioned(path, file))
      }
  }
}


// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/git/CloneFromBitbucket/conf/routes
// @DATE:Tue Dec 06 14:30:47 JST 2016

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
  Application_6: controllers.Application,
  // @LINE:6
  PostController_4: controllers.PostController,
  // @LINE:8
  FavoriteController_2: controllers.FavoriteController,
  // @LINE:20
  CommentController_3: controllers.CommentController,
  // @LINE:24
  UserController_1: controllers.UserController,
  // @LINE:31
  AuthController_0: controllers.AuthController,
  // @LINE:36
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    Application_6: controllers.Application,
    // @LINE:6
    PostController_4: controllers.PostController,
    // @LINE:8
    FavoriteController_2: controllers.FavoriteController,
    // @LINE:20
    CommentController_3: controllers.CommentController,
    // @LINE:24
    UserController_1: controllers.UserController,
    // @LINE:31
    AuthController_0: controllers.AuthController,
    // @LINE:36
    Assets_5: controllers.Assets
  ) = this(errorHandler, Application_6, PostController_4, FavoriteController_2, CommentController_3, UserController_1, AuthController_0, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, PostController_4, FavoriteController_2, CommentController_3, UserController_1, AuthController_0, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listPost/index""", """controllers.PostController.showAllPost(page:Integer = 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listPost/index/""" + "$" + """page<[^/]+>""", """controllers.PostController.showAllPost(page:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listPost/like""", """controllers.FavoriteController.favoriedPost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPost""", """controllers.PostController.addPost(page:Integer = 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPost/index/""" + "$" + """page<[^/]+>""", """controllers.PostController.addPost(page:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createPost""", """controllers.PostController.createPost(page:Integer = 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """find/""", """controllers.PostController.findPost(page:Integer = 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """find/index/""" + "$" + """page<[^/]+>""", """controllers.PostController.findPost(page:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """detailPost/""" + "$" + """postId<[^/]+>""", """controllers.PostController.viewPostDetail(postId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addComment/""" + "$" + """postId<[^/]+>""", """controllers.CommentController.createComment(postId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.UserController.add"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUser""", """controllers.UserController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editUser/""" + "$" + """userName<[^/]+>""", """controllers.UserController.editUser(userName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/""", """controllers.UserController.update"""),
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
    Application_6.index,
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listPost/index")))
  )
  private[this] lazy val controllers_PostController_showAllPost1_invoker = createInvoker(
    PostController_4.showAllPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "showAllPost",
      Seq(classOf[Integer]),
      "GET",
      """For Post--------------------------------------------------------------------""",
      this.prefix + """listPost/index"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PostController_showAllPost2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listPost/index/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_showAllPost2_invoker = createInvoker(
    PostController_4.showAllPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "showAllPost",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """listPost/index/""" + "$" + """page<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_FavoriteController_favoriedPost3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listPost/like")))
  )
  private[this] lazy val controllers_FavoriteController_favoriedPost3_invoker = createInvoker(
    FavoriteController_2.favoriedPost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavoriteController",
      "favoriedPost",
      Nil,
      "POST",
      """""",
      this.prefix + """listPost/like"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PostController_addPost4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPost")))
  )
  private[this] lazy val controllers_PostController_addPost4_invoker = createInvoker(
    PostController_4.addPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "addPost",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """addPost"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PostController_addPost5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPost/index/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_addPost5_invoker = createInvoker(
    PostController_4.addPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "addPost",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """addPost/index/""" + "$" + """page<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PostController_createPost6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPost")))
  )
  private[this] lazy val controllers_PostController_createPost6_invoker = createInvoker(
    PostController_4.createPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "createPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """createPost"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PostController_findPost7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("find/")))
  )
  private[this] lazy val controllers_PostController_findPost7_invoker = createInvoker(
    PostController_4.findPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "findPost",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """find/"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PostController_findPost8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("find/index/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_findPost8_invoker = createInvoker(
    PostController_4.findPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "findPost",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """find/index/""" + "$" + """page<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PostController_viewPostDetail9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("detailPost/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_viewPostDetail9_invoker = createInvoker(
    PostController_4.viewPostDetail(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "viewPostDetail",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """detailPost/""" + "$" + """postId<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CommentController_createComment10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addComment/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_createComment10_invoker = createInvoker(
    CommentController_3.createComment(fakeValue[Long]),
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

  // @LINE:24
  private[this] lazy val controllers_UserController_add11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_UserController_add11_invoker = createInvoker(
    UserController_1.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "add",
      Nil,
      "GET",
      """For User--------------------------------------------------------------------""",
      this.prefix + """addUser"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_create12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUser")))
  )
  private[this] lazy val controllers_UserController_create12_invoker = createInvoker(
    UserController_1.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """createUser"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UserController_editUser13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editUser/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_editUser13_invoker = createInvoker(
    UserController_1.editUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """editUser/""" + "$" + """userName<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UserController_update14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/")))
  )
  private[this] lazy val controllers_UserController_update14_invoker = createInvoker(
    UserController_1.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """update/"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AuthController_login15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_login15_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_AuthController_auth16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_AuthController_auth16_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_AuthController_logout17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthController_logout17_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_6.index)
      }
  
    // @LINE:6
    case controllers_PostController_showAllPost1_route(params) =>
      call(Param[Integer]("page", Right(1))) { (page) =>
        controllers_PostController_showAllPost1_invoker.call(PostController_4.showAllPost(page))
      }
  
    // @LINE:7
    case controllers_PostController_showAllPost2_route(params) =>
      call(params.fromPath[Integer]("page", None)) { (page) =>
        controllers_PostController_showAllPost2_invoker.call(PostController_4.showAllPost(page))
      }
  
    // @LINE:8
    case controllers_FavoriteController_favoriedPost3_route(params) =>
      call { 
        controllers_FavoriteController_favoriedPost3_invoker.call(FavoriteController_2.favoriedPost)
      }
  
    // @LINE:9
    case controllers_PostController_addPost4_route(params) =>
      call(Param[Integer]("page", Right(1))) { (page) =>
        controllers_PostController_addPost4_invoker.call(PostController_4.addPost(page))
      }
  
    // @LINE:10
    case controllers_PostController_addPost5_route(params) =>
      call(params.fromPath[Integer]("page", None)) { (page) =>
        controllers_PostController_addPost5_invoker.call(PostController_4.addPost(page))
      }
  
    // @LINE:11
    case controllers_PostController_createPost6_route(params) =>
      call(Param[Integer]("page", Right(1))) { (page) =>
        controllers_PostController_createPost6_invoker.call(PostController_4.createPost(page))
      }
  
    // @LINE:12
    case controllers_PostController_findPost7_route(params) =>
      call(Param[Integer]("page", Right(1))) { (page) =>
        controllers_PostController_findPost7_invoker.call(PostController_4.findPost(page))
      }
  
    // @LINE:13
    case controllers_PostController_findPost8_route(params) =>
      call(params.fromPath[Integer]("page", None)) { (page) =>
        controllers_PostController_findPost8_invoker.call(PostController_4.findPost(page))
      }
  
    // @LINE:14
    case controllers_PostController_viewPostDetail9_route(params) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_PostController_viewPostDetail9_invoker.call(PostController_4.viewPostDetail(postId))
      }
  
    // @LINE:20
    case controllers_CommentController_createComment10_route(params) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_CommentController_createComment10_invoker.call(CommentController_3.createComment(postId))
      }
  
    // @LINE:24
    case controllers_UserController_add11_route(params) =>
      call { 
        controllers_UserController_add11_invoker.call(UserController_1.add)
      }
  
    // @LINE:25
    case controllers_UserController_create12_route(params) =>
      call { 
        controllers_UserController_create12_invoker.call(UserController_1.create)
      }
  
    // @LINE:26
    case controllers_UserController_editUser13_route(params) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_UserController_editUser13_invoker.call(UserController_1.editUser(userName))
      }
  
    // @LINE:27
    case controllers_UserController_update14_route(params) =>
      call { 
        controllers_UserController_update14_invoker.call(UserController_1.update)
      }
  
    // @LINE:31
    case controllers_AuthController_login15_route(params) =>
      call { 
        controllers_AuthController_login15_invoker.call(AuthController_0.login)
      }
  
    // @LINE:32
    case controllers_AuthController_auth16_route(params) =>
      call { 
        controllers_AuthController_auth16_invoker.call(AuthController_0.auth)
      }
  
    // @LINE:33
    case controllers_AuthController_logout17_route(params) =>
      call { 
        controllers_AuthController_logout17_invoker.call(AuthController_0.logout)
      }
  
    // @LINE:36
    case controllers_Assets_versioned18_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_5.versioned(path, file))
      }
  }
}

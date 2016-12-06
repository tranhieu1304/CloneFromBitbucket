
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/feedpicks/conf/routes
// @DATE:Mon Dec 05 15:49:53 JST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:3
package controllers {

  // @LINE:36
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:24
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def editUser(userName:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "editUser/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)))
    }
  
    // @LINE:27
    def update(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "update/")
    }
  
    // @LINE:25
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "createUser")
    }
  
    // @LINE:24
    def add(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addUser")
    }
  
  }

  // @LINE:8
  class ReverseFavoriteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def favoriedPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "listPost/like")
    }
  
  }

  // @LINE:3
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:31
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:32
    def auth(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:31
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:6
  class ReversePostController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def findPost(page:Integer): Call = {
    
      (page: @unchecked) match {
      
        // @LINE:12
        case (page) if page == 1 =>
          implicit val _rrc = new ReverseRouteContext(Map(("page", 1)))
          Call("GET", _prefix + { _defaultPrefix } + "find/")
      
        // @LINE:13
        case (page)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "find/index/" + implicitly[PathBindable[Integer]].unbind("page", page))
      
      }
    
    }
  
    // @LINE:14
    def viewPostDetail(postId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "detailPost/" + implicitly[PathBindable[Long]].unbind("postId", postId))
    }
  
    // @LINE:11
    def createPost(): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("page", 1)))
      Call("POST", _prefix + { _defaultPrefix } + "createPost")
    }
  
    // @LINE:9
    def addPost(page:Integer): Call = {
    
      (page: @unchecked) match {
      
        // @LINE:9
        case (page) if page == 1 =>
          implicit val _rrc = new ReverseRouteContext(Map(("page", 1)))
          Call("GET", _prefix + { _defaultPrefix } + "addPost")
      
        // @LINE:10
        case (page)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "addPost/index/" + implicitly[PathBindable[Integer]].unbind("page", page))
      
      }
    
    }
  
    // @LINE:6
    def showAllPost(page:Integer): Call = {
    
      (page: @unchecked) match {
      
        // @LINE:6
        case (page) if page == 1 =>
          implicit val _rrc = new ReverseRouteContext(Map(("page", 1)))
          Call("GET", _prefix + { _defaultPrefix } + "listPost/index")
      
        // @LINE:7
        case (page)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "listPost/index/" + implicitly[PathBindable[Integer]].unbind("page", page))
      
      }
    
    }
  
  }

  // @LINE:20
  class ReverseCommentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def createComment(postId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addComment/" + implicitly[PathBindable[Long]].unbind("postId", postId))
    }
  
  }


}

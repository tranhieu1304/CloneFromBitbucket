
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/feedpicks/conf/routes
// @DATE:Mon Dec 05 15:49:53 JST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

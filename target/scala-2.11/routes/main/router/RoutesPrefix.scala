
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/feedpicks-identity/conf/routes
// @DATE:Mon Nov 28 10:58:37 JST 2016


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

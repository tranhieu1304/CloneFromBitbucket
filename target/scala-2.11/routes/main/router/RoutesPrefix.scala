
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/git/CloneFromBitbucket/conf/routes
// @DATE:Tue Dec 06 14:30:47 JST 2016


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

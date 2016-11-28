
package views.html.common

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<nav class="navbar navbar-default navbar-fixed-top">
	<div class="navbar-header">
	      <a class="navbar-brand " href=""""),_display_(/*3.40*/routes/*3.46*/.PostController.showAllPost),format.raw/*3.73*/("""">FeedPicks</a>
	 </div>
	 <div id="navbar" class="navbar-collapse collapse">
	      <ul class="nav navbar-nav">
	        """),_display_(/*7.11*/if(models.User.isLogin)/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
	          """),format.raw/*8.12*/("""<li><a href="#">"""),_display_(/*8.29*/models/*8.35*/.User.userName),format.raw/*8.49*/("""</a></li>
	          <li><a href=""""),_display_(/*9.26*/routes/*9.32*/.AuthController.logout()),format.raw/*9.56*/("""">ログアウト</a></li>
	        """)))}/*10.11*/else/*10.15*/{_display_(Seq[Any](format.raw/*10.16*/("""
	          """),format.raw/*11.12*/("""<li><a href=""""),_display_(/*11.26*/routes/*11.32*/.AuthController.login()),format.raw/*11.55*/("""">ログイン</a></li>
	        """)))}),format.raw/*12.11*/("""
	      """),format.raw/*13.8*/("""</ul>
	  </div>
</nav>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 10:58:38 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks-identity/app/views/common/header.scala.html
                  HASH: 6ce36e3c12300920abc36edac90e29bfe9aaccad
                  MATRIX: 836->0|983->121|997->127|1044->154|1193->277|1224->300|1263->302|1302->314|1345->331|1359->337|1393->351|1454->386|1468->392|1512->416|1558->443|1571->447|1610->448|1650->460|1691->474|1706->480|1750->503|1807->529|1842->537
                  LINES: 32->1|34->3|34->3|34->3|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|44->13
                  -- GENERATED --
              */
          
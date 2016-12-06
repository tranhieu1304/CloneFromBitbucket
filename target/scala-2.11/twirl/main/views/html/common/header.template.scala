
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
	      <a class="navbar-brand" href="#">FeedPicks</a>
	    </div>
	    <div id="navbar" class="navbar-collapse collapse">
	      <ul class="nav navbar-nav">
	        """),_display_(/*7.11*/if(models.User.isLogin)/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
	          """),format.raw/*8.12*/("""<li><a href=""""),_display_(/*8.26*/routes/*8.32*/.AuthController.logout()),format.raw/*8.56*/("""">ログアウト</a></li>
	        """)))}/*9.11*/else/*9.15*/{_display_(Seq[Any](format.raw/*9.16*/("""
	          """),format.raw/*10.12*/("""<li><a href=""""),_display_(/*10.26*/routes/*10.32*/.AuthController.login()),format.raw/*10.55*/("""">ログイン</a></li>
	        """)))}),format.raw/*11.11*/("""
	      """),format.raw/*12.8*/("""</ul>
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
                  DATE: Tue Dec 06 14:09:48 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks/app/views/common/header.scala.html
                  HASH: 32b8885a503c88cb600a73c481fdece1d591d298
                  MATRIX: 836->0|1115->253|1146->276|1185->278|1224->290|1264->304|1278->310|1322->334|1367->361|1379->365|1417->366|1457->378|1498->392|1513->398|1557->421|1614->447|1649->455
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12
                  -- GENERATED --
              */
          
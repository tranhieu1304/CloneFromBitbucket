
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/main("News FeedPicks")/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
	"""),format.raw/*3.2*/("""<p>"""),_display_(/*3.6*/message),format.raw/*3.13*/("""</p>
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 10:58:38 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks-identity/app/views/index.scala.html
                  HASH: 342e5080523ac6108ad072d8e06dea1e2a50a09d
                  MATRIX: 745->1|857->18|884->20|914->42|953->44|981->46|1010->50|1037->57|1072->63
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          
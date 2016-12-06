
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="ja">
<head>
<title>"""),_display_(/*6.9*/title),format.raw/*6.14*/("""</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" media="screen" href=""""),_display_(/*13.46*/routes/*13.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.93*/("""">
<link rel="shortcut icon" type="image/png"
	href=""""),_display_(/*15.9*/routes/*15.15*/.Assets.versioned("images/favicon.png")),format.raw/*15.54*/("""">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<link rel="stylesheet"  href=""""),_display_(/*18.32*/routes/*18.38*/.Assets.versioned("stylesheets/post.css")),format.raw/*18.79*/("""">
	
	

</head>
<body>
	<div class="header">"""),_display_(/*24.23*/common/*24.29*/.header()),format.raw/*24.38*/("""</div>
	<br><br><br>
	<div class="container">"""),_display_(/*26.26*/content),format.raw/*26.33*/("""</div>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Dec 05 15:49:54 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks/app/views/main.scala.html
                  HASH: 26815a7794f4f7450a1a8331676d946ccd40e502
                  MATRIX: 748->1|873->31|901->33|974->81|999->86|1400->460|1415->466|1477->507|1557->561|1572->567|1632->606|1783->730|1798->736|1860->777|1932->822|1947->828|1977->837|2050->883|2078->890
                  LINES: 27->1|32->1|34->3|37->6|37->6|44->13|44->13|44->13|46->15|46->15|46->15|49->18|49->18|49->18|55->24|55->24|55->24|57->26|57->26
                  -- GENERATED --
              */
          

package views.html.User

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userDetail_Scope0 {
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

class userDetail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/createUser.css")),format.raw/*3.99*/("""">

"""),_display_(/*5.2*/main("User Detail")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
"""),format.raw/*6.1*/("""<div class="container">
    <div class="row">
        <div class="panel panel-primary">
            <div class="form-group">
                <h2>ユーザー詳細</h2>
            </div>
            <!-- Email -->
            """),_display_(/*13.14*/b3/*13.16*/.form(action = routes.UserController.update(), 'method -> "POST")/*13.81*/ {_display_(Seq[Any](format.raw/*13.83*/("""
	            """),format.raw/*14.14*/("""<div class="form-group">
	                <input type="hidden" value='"""),_display_(/*15.47*/form("id")/*15.57*/.value),format.raw/*15.63*/("""' name="id">
	                 	"""),_display_(/*16.21*/b3/*16.23*/.email( form("email"), '_hiddenLabel -> "Email", 'placeholder -> "example@mail.com" )),format.raw/*16.108*/("""
	            """),format.raw/*17.14*/("""</div>
	          <!-- Email -->
	           <div class="form-group">
					"""),_display_(/*20.7*/b3/*20.9*/.text(
						field = form("name"),
						'_label -> "名前",
						'placeholder -> "名前"
					)),format.raw/*24.7*/("""
				"""),format.raw/*25.5*/("""</div> 
			<!--  birthday -->
	            <div class="form-group">
	                """),_display_(/*28.19*/b3/*28.21*/.date(
	                field = form("birthday"),
	                '_label -> "年月日")),format.raw/*30.35*/("""
	            """),format.raw/*31.14*/("""</div>  
            <!-- sex -->
	            <div class="form-group">
	                <div lass="form-group">Sex</div>
	                <div class="form-group">
	                    """),_display_(/*36.23*/defining(form("sex"))/*36.44*/{ sex =>_display_(Seq[Any](format.raw/*36.52*/("""
		                    """),_display_(/*37.24*/if(sex.value == "M")/*37.44*/{_display_(Seq[Any](format.raw/*37.45*/("""
			                    """),format.raw/*38.24*/("""<input type="radio" name=""""),_display_(/*38.51*/sex/*38.54*/.name),format.raw/*38.59*/("""" id="Male" value="0" checked><label for="Male">男性</label>
			                    <input type="radio" name=""""),_display_(/*39.51*/sex/*39.54*/.name),format.raw/*39.59*/("""" id="Female" value="1"><label for="Female">女性</label>
			                    """)))}/*40.25*/else/*40.29*/{_display_(Seq[Any](format.raw/*40.30*/("""
			                    """),format.raw/*41.24*/("""<input type="radio" name=""""),_display_(/*41.51*/sex/*41.54*/.name),format.raw/*41.59*/("""" id="Male" value="0"><label for="Male">男性</label>
			                    <input type="radio" name=""""),_display_(/*42.51*/sex/*42.54*/.name),format.raw/*42.59*/("""" id="Female" value="1" checked><label
			                        for="Female">女性</label>
			                 """)))}),format.raw/*44.22*/("""
	                    """)))}),format.raw/*45.23*/("""
	                """),format.raw/*46.18*/("""</div>
	            </div>
	            <!-- avatar -->
	            """),_display_(/*49.15*/b3/*49.17*/.file( form("imageContent"), '_label -> "Avatar", 'class -> "form-control" )),format.raw/*49.93*/("""
	            """),format.raw/*50.14*/("""<img  id="avatarImg" alt="" src='"""),_display_(/*50.48*/form("imageContent")),format.raw/*50.68*/("""'>
	            
	            <div class="form-group">
	                <input type="submit" class="btn btn-primary btn-m btn-block" value="編集">
	            </div>
            """)))}),format.raw/*55.14*/("""
            """)))}),format.raw/*56.14*/("""
        """),format.raw/*57.9*/("""</div>
    </div>
</div>
<script src=""""),_display_(/*60.15*/routes/*60.21*/.Assets.versioned("javascripts/user.js")),format.raw/*60.61*/("""" type="text/javascript"></script>
"""))
      }
    }
  }

  def render(form:Form[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


}

/**/
object userDetail extends userDetail_Scope0.userDetail
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 14:30:48 JST 2016
                  SOURCE: /Users/mac_thieu/git/CloneFromBitbucket/app/views/User/userDetail.scala.html
                  HASH: 9296ec738823c0df28ecc5d18b6a70ebcee0f2d9
                  MATRIX: 771->1|926->26|953->64|1024->109|1038->115|1105->162|1135->167|1162->186|1201->188|1228->189|1471->405|1482->407|1556->472|1596->474|1638->488|1736->559|1755->569|1782->575|1842->608|1853->610|1960->695|2002->709|2104->785|2114->787|2225->878|2257->883|2370->969|2381->971|2486->1055|2528->1069|2741->1255|2771->1276|2817->1284|2868->1308|2897->1328|2936->1329|2988->1353|3042->1380|3054->1383|3080->1388|3216->1497|3228->1500|3254->1505|3352->1584|3365->1588|3404->1589|3456->1613|3510->1640|3522->1643|3548->1648|3676->1749|3688->1752|3714->1757|3856->1868|3910->1891|3956->1909|4053->1979|4064->1981|4161->2057|4203->2071|4264->2105|4305->2125|4514->2303|4559->2317|4595->2326|4661->2365|4676->2371|4737->2411
                  LINES: 27->1|32->1|33->3|33->3|33->3|33->3|35->5|35->5|35->5|36->6|43->13|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|50->20|50->20|54->24|55->25|58->28|58->28|60->30|61->31|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|71->41|72->42|72->42|72->42|74->44|75->45|76->46|79->49|79->49|79->49|80->50|80->50|80->50|85->55|86->56|87->57|90->60|90->60|90->60
                  -- GENERATED --
              */
          
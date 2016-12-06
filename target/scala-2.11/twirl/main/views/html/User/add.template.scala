
package views.html.User

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object add_Scope0 {
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

class add extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.versioned("stylesheets/createUser.css")),format.raw/*4.99*/("""">
"""),_display_(/*5.2*/main("新規作成")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""
"""),format.raw/*6.1*/("""<div class="container">
    <div class="row">
        <div class="panel panel-primary">
            <div class="form-group">
                <h2>アカウント登録</h2>
                <h4>無料でご利用いただけます</h4>
            </div>
            
	<div class="form-create">
	 	"""),_display_(/*15.5*/b3/*15.7*/.form(action = routes.UserController.create(), 'method -> "POST")/*15.72*/ {_display_(Seq[Any](format.raw/*15.74*/("""
	 	    """),format.raw/*16.8*/("""<div class="form-group">
                """),_display_(/*17.18*/b3/*17.20*/.inputWrapped(
					                "email",
					                form("email"),
					                '_label -> "メールアドレス",
					                'placeholder -> "xxx@xxx" 
				                )/*22.22*/ { input =>_display_(Seq[Any](format.raw/*22.33*/("""
				               			"""),format.raw/*23.23*/("""<div class="input-group">"""),_display_(/*23.49*/input),format.raw/*23.54*/(""" """),format.raw/*23.55*/("""</div>
								  """)))}),format.raw/*24.12*/("""
            """),format.raw/*25.13*/("""</div>
           <div class="form-group">
	           """),_display_(/*27.14*/b3/*27.16*/.password( 
	           				form("password"),
	           			 	'_label -> "パスワード",
	           			  	'placeholder -> "12345678" 
	           			  )),format.raw/*31.19*/("""
            """),format.raw/*32.13*/("""</div>
			<div class="form-group">
	           """),_display_(/*34.14*/b3/*34.16*/.password( 
	           				form("passwordConf"),
	           			 	'_label -> "パスワード（確認）",
	           			  	'placeholder -> "12345678" 
	           			  )),format.raw/*38.19*/("""
            """),format.raw/*39.13*/("""</div>
			<div class="form-group">
				"""),_display_(/*41.6*/b3/*41.8*/.text(
					field = form("name"),
					'_label -> "名前",
					'placeholder -> "名前"
				)),format.raw/*45.6*/("""
			"""),format.raw/*46.4*/("""</div>
			<div class="form-group">
				"""),_display_(/*48.6*/b3/*48.8*/.date(
	                        field = form("birthday"),
	                        '_label -> "誕生日"
	                )),format.raw/*51.19*/("""
			"""),format.raw/*52.4*/("""</div>
			<div class="form-group">
			    """),_display_(/*54.9*/b3/*54.11*/.radio(
		                form("sex"),
		                options = Seq("0" -> "男性",
		                			  "1" -> "女性"),
		                '_label -> "性別" 
	                )),format.raw/*59.19*/("""
			"""),format.raw/*60.4*/("""</div>
			<input class="btn btn-primary btn-m btn-block" type="submit" value="新規登録">
		""")))}),format.raw/*62.4*/("""
	"""),format.raw/*63.2*/("""</div>
""")))}),format.raw/*64.2*/("""

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
object add extends add_Scope0.add
              /*
                  -- GENERATED --
                  DATE: Mon Dec 05 15:49:54 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks/app/views/User/add.scala.html
                  HASH: 9768d041ed1f61e6ab22d9cc3f97adf939e0b049
                  MATRIX: 757->1|912->26|940->65|1011->110|1025->116|1092->163|1121->167|1141->179|1180->181|1207->182|1492->441|1502->443|1576->508|1616->510|1651->518|1720->560|1731->562|1933->755|1982->766|2033->789|2086->815|2112->820|2141->821|2190->839|2231->852|2314->908|2325->910|2493->1057|2534->1070|2609->1118|2620->1120|2796->1275|2837->1288|2903->1328|2913->1330|3020->1417|3051->1421|3117->1461|3127->1463|3266->1581|3297->1585|3366->1628|3377->1630|3572->1804|3603->1808|3721->1896|3750->1898|3788->1906
                  LINES: 27->1|32->1|34->4|34->4|34->4|34->4|35->5|35->5|35->5|36->6|45->15|45->15|45->15|45->15|46->16|47->17|47->17|52->22|52->22|53->23|53->23|53->23|53->23|54->24|55->25|57->27|57->27|61->31|62->32|64->34|64->34|68->38|69->39|71->41|71->41|75->45|76->46|78->48|78->48|81->51|82->52|84->54|84->54|89->59|90->60|92->62|93->63|94->64
                  -- GENERATED --
              */
          
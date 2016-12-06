
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


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("新規作成")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
	"""),format.raw/*4.2*/("""<h3>アカウント登録</h3>
	<h4>無料でご利用いただけます</h4>
	
	<div class="form-create">
		"""),_display_(/*8.4*/helper/*8.10*/.form(action = routes.UserController.create(), 'method -> "POST")/*8.75*/ {_display_(Seq[Any](format.raw/*8.77*/("""
			"""),_display_(/*9.5*/(helper.inputText (
				field = form("email"),
				'_label -> "メールアドレス",
				'placeholder -> "xxx@xxx"
			))),format.raw/*13.6*/("""
			
			"""),_display_(/*15.5*/(helper.inputPassword (
				field = form("password"),
				'_label -> "パスワード",
				'placeholder -> "12345678"
			))),format.raw/*19.6*/("""
			
			"""),_display_(/*21.5*/(helper.inputPassword(
				field = form("passwordConf"),
				'_label -> "パスワード（確認）",
				'placeholder -> "12345678"
			))),format.raw/*25.6*/("""
			
			"""),_display_(/*27.5*/(helper.inputText(
				field = form("name"),
				'_label -> "名前",
				'placeholder -> "名前"
			))),format.raw/*31.6*/("""
			
			"""),_display_(/*33.5*/(helper.inputDate(
				field = form("birthday"),
				'_label -> "誕生日",
				'placeholder -> "年月日"
			))),format.raw/*37.6*/("""
			
			"""),_display_(/*39.5*/(helper.inputRadioGroup (
				field = form("sex"),
				options = Seq("male" -> "男性",
							"female" -> "女性"),
				'_label -> "性別"
			))),format.raw/*44.6*/("""
			
			"""),format.raw/*46.4*/("""<button type="submit">新規登録</button>
		""")))}),format.raw/*47.4*/("""
	"""),format.raw/*48.2*/("""</div>
""")))}),format.raw/*49.2*/("""
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
                  DATE: Tue Dec 06 14:09:48 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks/app/views/User/add.scala.html
                  HASH: 0b002a2c992c5800db4ef8ca4053a0f169be3035
                  MATRIX: 757->1|877->26|905->29|925->41|964->43|992->45|1089->117|1103->123|1176->188|1215->190|1245->195|1373->303|1408->312|1542->426|1577->435|1718->556|1753->565|1869->661|1904->670|2026->772|2061->781|2217->917|2252->925|2321->964|2350->966|2388->974
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|39->8|40->9|44->13|46->15|50->19|52->21|56->25|58->27|62->31|64->33|68->37|70->39|75->44|77->46|78->47|79->48|80->49
                  -- GENERATED --
              */
          
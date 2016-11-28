
package views.html.Author

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.LoginForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.LoginForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("ログイン")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<div class="row">
    <div class="col-md-offset-5 col-md-3">
      <div class="form-login">
      """),_display_(/*7.8*/helper/*7.14*/.form(action = routes.AuthController.auth(), 'method -> "POST")/*7.77*/ {_display_(Seq[Any](format.raw/*7.79*/("""
        """),format.raw/*8.9*/("""<h4>ログイン</h4>
        """),_display_(/*9.10*/helper/*9.16*/.CSRF.formField),format.raw/*9.31*/("""
        """),_display_(/*10.10*/if(form.hasGlobalErrors)/*10.34*/ {_display_(Seq[Any](format.raw/*10.36*/("""
          """),format.raw/*11.11*/("""<p>"""),_display_(/*11.15*/form/*11.19*/.globalError.message),format.raw/*11.39*/("""</p>
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/(helper.inputText (
          field = form("name"),
          'class -> "form-control input-sm chat-input",
          'placeholder -> "username",
          '_label -> "ユーザー名",
          '_showConstraints -> false
        ))),format.raw/*19.11*/("""
        """),_display_(/*20.10*/(helper.inputPassword (
          field = form("password"),
          'class -> "form-control input-sm chat-input",
          'placeholder -> "password",
          '_label -> "パスワード",
          '_showConstraints -> false
        ))),format.raw/*26.11*/("""
        """),format.raw/*27.9*/("""<div class="wrapper">
          <span class="group-btn">
            <button type="submit" class="btn btn-primary btn-md">login <i class="fa fa-sign-in"></i></button>
          </span>
        </div>
      """)))}),format.raw/*32.8*/("""
      """),format.raw/*33.7*/("""</div>
      
      <div class="form-create">
      	"""),_display_(/*36.9*/helper/*36.15*/.form(action = routes.UserController.add(), 'method -> "GET")/*36.76*/ {_display_(Seq[Any](format.raw/*36.78*/("""
      		"""),format.raw/*37.9*/("""<button type="submit">新規登録</button>
      	""")))}),format.raw/*38.9*/("""
      """),format.raw/*39.7*/("""</div>
    </div>
  </div>
""")))}))
      }
    }
  }

  def render(form:Form[models.LoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[models.LoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 10:58:38 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks-identity/app/views/Author/login.scala.html
                  HASH: 3ffb923918a38b11cbdf2ffab67f9680e5ba5a2a
                  MATRIX: 768->1|893->31|921->34|941->46|980->48|1009->51|1133->150|1147->156|1218->219|1257->221|1292->230|1341->253|1355->259|1390->274|1427->284|1460->308|1500->310|1539->321|1570->325|1583->329|1624->349|1669->363|1706->373|1950->596|1987->606|2239->837|2275->846|2512->1053|2546->1060|2626->1114|2641->1120|2711->1181|2751->1183|2787->1192|2861->1236|2895->1243
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|44->13|50->19|51->20|57->26|58->27|63->32|64->33|67->36|67->36|67->36|67->36|68->37|69->38|70->39
                  -- GENERATED --
              */
          
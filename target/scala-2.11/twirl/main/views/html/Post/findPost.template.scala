
package views.html.Post

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object findPost_Scope0 {
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

class findPost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Post],Form[controllers.PostController.FindForm],Int,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[models.Post], form: Form[controllers.PostController.FindForm], currentPage: Int, maxPage: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.lang.String;  var username = "";var favoriteStatus = true;
import java.lang.Long; var favoriteId = -1l; var countFavorite = 0l;

Seq[Any](format.raw/*1.109*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("FeedPicks")/*6.19*/ {_display_(Seq[Any](format.raw/*6.21*/("""
	"""),format.raw/*7.2*/("""<div>
	    <div class="container">
	        <div class="form-inline">
	            <div class="input-group col-sm-6">
	                  <label>
	                      <a class="btn btn-success" href=""""),_display_(/*12.58*/routes/*12.64*/.PostController.addPost(1)),format.raw/*12.90*/("""">投稿</a>
	                  </label>
	                  <div>
	                      <h3>検索</h3>
	                      
	                      """),_display_(/*17.25*/helper/*17.31*/.form(action = routes.PostController.findPost(1), 'method -> "GET")/*17.98*/ {_display_(Seq[Any](format.raw/*17.100*/("""
	                      	"""),_display_(/*18.26*/(helper.inputText(
	                      		field = form("keyword"),
	                      		'_label -> "",
	                      		'placeholder -> "キーワード"
	                      	))),format.raw/*22.27*/("""
	                      	
	                      	"""),format.raw/*24.25*/("""<input type="submit">
	                      """)))}),format.raw/*25.25*/("""
	                 """),format.raw/*26.19*/("""</div>
	            </div>
	        </div>
	        <div></div>
			 """),_display_(/*30.6*/tablePost(posts, "findPost", currentPage, maxPage)),format.raw/*30.56*/("""
	    """),format.raw/*31.6*/("""</div>
	</div>
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(posts:List[models.Post],form:Form[controllers.PostController.FindForm],currentPage:Int,maxPage:Int): play.twirl.api.HtmlFormat.Appendable = apply(posts,form,currentPage,maxPage)

  def f:((List[models.Post],Form[controllers.PostController.FindForm],Int,Int) => play.twirl.api.HtmlFormat.Appendable) = (posts,form,currentPage,maxPage) => apply(posts,form,currentPage,maxPage)

  def ref: this.type = this

}


}

/**/
object findPost extends findPost_Scope0.findPost
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 14:30:48 JST 2016
                  SOURCE: /Users/mac_thieu/git/CloneFromBitbucket/app/views/Post/findPost.scala.html
                  HASH: f6ecb6e259e3499603f207aaa489be24b6c709f8
                  MATRIX: 817->1|1159->108|1187->252|1214->254|1239->271|1278->273|1306->275|1535->477|1550->483|1597->509|1769->654|1784->660|1860->727|1901->729|1954->755|2159->939|2237->989|2314->1035|2361->1054|2456->1123|2527->1173|2560->1179|2606->1195
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|37->7|42->12|42->12|42->12|47->17|47->17|47->17|47->17|48->18|52->22|54->24|55->25|56->26|60->30|60->30|61->31|63->33
                  -- GENERATED --
              */
          
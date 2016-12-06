
package views.html.Post

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object postDetail_Scope0 {
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

class postDetail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Post,Form[models.Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: models.Post, formComment : Form[models.Comment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/main("FeedPicks")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	"""),format.raw/*4.2*/("""<div>
	    <div class="container">
		<div>
			<h2>post.title</h2>
		</div>
	        <table class="table table-bordered table-striped" id="productTable">
	            <thead>
		            <tr>
		                <th>Id</th>
		                <th>投稿日</th>
		                <th>投稿者</th>
		                <th>コメント</th>
		            </tr>
	            </thead>
	            <tbody>
		            """),_display_(/*19.16*/for(comment <- post.comments) yield /*19.45*/{_display_(Seq[Any](format.raw/*19.46*/("""
			            """),format.raw/*20.16*/("""<tr id=""""),_display_(/*20.25*/comment/*20.32*/.id),format.raw/*20.35*/("""">
			                <td>"""),_display_(/*21.25*/comment/*21.32*/.id),format.raw/*21.35*/("""</td>
			                <td>"""),_display_(/*22.25*/comment/*22.32*/.createDate),format.raw/*22.43*/("""</td>
			                <th>"""),_display_(/*23.25*/comment/*23.32*/.user.name),format.raw/*23.42*/("""</th>
			                <td>"""),_display_(/*24.25*/comment/*24.32*/.content),format.raw/*24.40*/("""</td>
			            </tr>　
		            """)))}),format.raw/*26.16*/("""
	            """),format.raw/*27.14*/("""</tbody>
	        </table>
	        		"""),_display_(/*29.13*/helper/*29.19*/.form(action = routes.CommentController.createComment(post.id), 'method -> "POST")/*29.101*/ {_display_(Seq[Any](format.raw/*29.103*/("""
						"""),_display_(/*30.8*/(helper.inputText (
							field = formComment("content"),
							'_label -> "コメント",
							'placeholder -> "コメントを入力"
						))),format.raw/*34.9*/("""
						"""),format.raw/*35.7*/("""<button type="submit">投稿</button>
					""")))}),format.raw/*36.7*/("""
	    """),format.raw/*37.6*/("""</div>
	</div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(post:models.Post,formComment:Form[models.Comment]): play.twirl.api.HtmlFormat.Appendable = apply(post,formComment)

  def f:((models.Post,Form[models.Comment]) => play.twirl.api.HtmlFormat.Appendable) = (post,formComment) => apply(post,formComment)

  def ref: this.type = this

}


}

/**/
object postDetail extends postDetail_Scope0.postDetail
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 14:30:48 JST 2016
                  SOURCE: /Users/mac_thieu/git/CloneFromBitbucket/app/views/Post/postDetail.scala.html
                  HASH: 1329c716c302a960b57f6a00670665fbcff5e0a0
                  MATRIX: 786->1|936->56|964->59|989->76|1028->78|1056->80|1478->475|1523->504|1562->505|1606->521|1642->530|1658->537|1682->540|1736->567|1752->574|1776->577|1833->607|1849->614|1881->625|1938->655|1954->662|1985->672|2042->702|2058->709|2087->717|2161->760|2203->774|2269->813|2284->819|2376->901|2417->903|2451->911|2597->1037|2631->1044|2701->1084|2734->1090|2780->1106
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|50->19|50->19|50->19|51->20|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|57->26|58->27|60->29|60->29|60->29|60->29|61->30|65->34|66->35|67->36|68->37|70->39
                  -- GENERATED --
              */
          
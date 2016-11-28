
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
			<h2>"""),_display_(/*7.9*/post/*7.13*/.title),format.raw/*7.19*/("""</h2>
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
                  DATE: Mon Nov 28 10:58:38 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks-identity/app/views/Post/postDetail.scala.html
                  HASH: 82795ad1e8c4d8fb6dd9f085cb9448393fbce9da
                  MATRIX: 786->1|936->56|964->59|989->76|1028->78|1056->80|1132->131|1144->135|1170->141|1532->476|1577->505|1616->506|1660->522|1696->531|1712->538|1736->541|1790->568|1806->575|1830->578|1887->608|1903->615|1935->626|1992->656|2008->663|2039->673|2096->703|2112->710|2141->718|2215->761|2257->775|2323->814|2338->820|2430->902|2471->904|2505->912|2651->1038|2685->1045|2755->1085|2788->1091|2834->1107
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|50->19|50->19|50->19|51->20|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|57->26|58->27|60->29|60->29|60->29|60->29|61->30|65->34|66->35|67->36|68->37|70->39
                  -- GENERATED --
              */
          
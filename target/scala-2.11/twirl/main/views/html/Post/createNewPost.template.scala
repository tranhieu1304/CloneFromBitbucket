
package views.html.Post

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createNewPost_Scope0 {
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

class createNewPost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[models.Post],List[models.Post],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPost: Form[models.Post], posts: List[models.Post], postTitle : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""

"""),_display_(/*3.2*/main("New Post")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
	"""),format.raw/*4.2*/("""<div>
	    <div class="container">
	        <div class="form-inline">
	            <div class="input-group col-sm-6">
					"""),_display_(/*8.7*/helper/*8.13*/.form(action = routes.PostController.createPost(), 'method -> "POST")/*8.82*/ {_display_(Seq[Any](format.raw/*8.84*/("""
						"""),_display_(/*9.8*/(helper.inputText (
							field = formPost("url"),
							'_label -> "Url",
							'placeholder -> "Enter Url"
						))),format.raw/*13.9*/("""
						"""),format.raw/*14.7*/("""<button type="submit">投稿</button>
					""")))}),format.raw/*15.7*/("""
	            """),format.raw/*16.14*/("""</div>
	        </div>
	        <div></div>
	
	        <table class="table table-bordered table-striped" id="productTable">
	            <thead>
		            <tr>
		                <th>Id</th>
		                <th>投稿日</th>
		                <th>記事一覧</th>
		                <th>Action</th>
		            </tr>
	            </thead>
	            <tbody>
		            """),_display_(/*30.16*/for(post <- posts) yield /*30.34*/{_display_(Seq[Any](format.raw/*30.35*/("""
			            """),format.raw/*31.16*/("""<tr id=""""),_display_(/*31.25*/post/*31.29*/.id),format.raw/*31.32*/("""">
			                <td>"""),_display_(/*32.25*/post/*32.29*/.id),format.raw/*32.32*/("""</td>
			                <td>"""),_display_(/*33.25*/post/*33.29*/.createDate),format.raw/*33.40*/("""</td>
			                <td>
			               	 	<a class="" href=""""),_display_(/*35.41*/routes/*35.47*/.PostController.viewPostDetail(post.id)),format.raw/*35.86*/("""">"""),_display_(/*35.89*/post/*35.93*/.title),format.raw/*35.99*/("""</a>
			                </td>
			                <td>
			                	<a class="btn btn-danger" href="">削除</a>
			                	<a class="btn btn-success" href="">編集</a>
			                </td>
			            </tr>　
		            """)))}),format.raw/*42.16*/("""
	            """),format.raw/*43.14*/("""</tbody>
	        </table>
	    </div>
	</div>
	<a class="#" href=""""),_display_(/*47.22*/routes/*47.28*/.PostController.showAllPost),format.raw/*47.55*/("""">All Post </a>
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(formPost:Form[models.Post],posts:List[models.Post],postTitle:String): play.twirl.api.HtmlFormat.Appendable = apply(formPost,posts,postTitle)

  def f:((Form[models.Post],List[models.Post],String) => play.twirl.api.HtmlFormat.Appendable) = (formPost,posts,postTitle) => apply(formPost,posts,postTitle)

  def ref: this.type = this

}


}

/**/
object createNewPost extends createNewPost_Scope0.createNewPost
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 10:58:38 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks-identity/app/views/Post/createNewPost.scala.html
                  HASH: eac66f9b343752f46c51bf3483c1b28c2b49d0c4
                  MATRIX: 802->1|972->76|1000->79|1024->95|1063->97|1091->99|1240->223|1254->229|1331->298|1370->300|1403->308|1543->428|1577->435|1647->475|1689->489|2085->858|2119->876|2158->877|2202->893|2238->902|2251->906|2275->909|2329->936|2342->940|2366->943|2423->973|2436->977|2468->988|2565->1058|2580->1064|2640->1103|2670->1106|2683->1110|2710->1116|2980->1355|3022->1369|3117->1437|3132->1443|3180->1470|3227->1487
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|39->8|40->9|44->13|45->14|46->15|47->16|61->30|61->30|61->30|62->31|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|66->35|66->35|66->35|66->35|66->35|66->35|73->42|74->43|78->47|78->47|78->47|79->48
                  -- GENERATED --
              */
          
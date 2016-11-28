
package views.html.Post

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showPostList_Scope0 {
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

class showPostList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[models.Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/main("FeedPicks")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	"""),format.raw/*4.2*/("""<div>
	    <div class="container">
	        <div class="form-inline">
	            <div class="input-group col-sm-6">
	                  <label>
	                      <a class="btn btn-success" href=""""),_display_(/*9.58*/routes/*9.64*/.PostController.addPost),format.raw/*9.87*/("""">投稿</a>
	                  </label>
	            </div>
	        </div>
	        <div></div>
	
	        <table class="table table-bordered table-striped" id="productTable">
	            <thead>
		            <tr>
		                <th>Id</th>
		                <th>投稿日</th>
		                <th>投稿者</th>
		                <th>記事一覧</th>
		                <th>遷移</th>
		            </tr>
	            </thead>
	            <tbody>
		            """),_display_(/*26.16*/for(post <- posts) yield /*26.34*/{_display_(Seq[Any](format.raw/*26.35*/("""
			            """),format.raw/*27.16*/("""<tr id=""""),_display_(/*27.25*/post/*27.29*/.id),format.raw/*27.32*/("""">
			                <td>"""),_display_(/*28.25*/post/*28.29*/.id),format.raw/*28.32*/("""</td>
			                <td>"""),_display_(/*29.25*/post/*29.29*/.createDate),format.raw/*29.40*/("""</td>
			                <th>"""),_display_(/*30.25*/post/*30.29*/.user.name),format.raw/*30.39*/("""</th>
			                <td>
			                	<a class="" href=""""),_display_(/*32.40*/routes/*32.46*/.PostController.viewPostDetail(post.id)),format.raw/*32.85*/("""">"""),_display_(/*32.88*/post/*32.92*/.title),format.raw/*32.98*/("""</a>
			                </td>
			                <td><a class="btn btn-success" href="">Vist Website</a></td>
			            </tr>　
		            """)))}),format.raw/*36.16*/("""
	            """),format.raw/*37.14*/("""</tbody>
	        </table>
	    </div>
	</div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(posts:List[models.Post]): play.twirl.api.HtmlFormat.Appendable = apply(posts)

  def f:((List[models.Post]) => play.twirl.api.HtmlFormat.Appendable) = (posts) => apply(posts)

  def ref: this.type = this

}


}

/**/
object showPostList extends showPostList_Scope0.showPostList
              /*
                  -- GENERATED --
                  DATE: Mon Nov 28 10:58:38 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks-identity/app/views/Post/showPostList.scala.html
                  HASH: 9f4edf2e92e04a1fd0cbbf14afca048a1cea557d
                  MATRIX: 775->1|896->27|924->30|949->47|988->49|1016->51|1244->253|1258->259|1301->282|1774->728|1808->746|1847->747|1891->763|1927->772|1940->776|1964->779|2018->806|2031->810|2055->813|2112->843|2125->847|2157->858|2214->888|2227->892|2258->902|2354->971|2369->977|2429->1016|2459->1019|2472->1023|2499->1029|2677->1176|2719->1190|2797->1238
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|40->9|40->9|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|63->32|63->32|63->32|63->32|63->32|63->32|67->36|68->37|72->41
                  -- GENERATED --
              */
          
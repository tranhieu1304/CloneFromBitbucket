
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

class showPostList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Post],Int,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[models.Post], currentPage: Int, maxPage: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""

"""),_display_(/*3.2*/main("FeedPicks")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	"""),format.raw/*4.2*/("""<div>
	    <div class="container">
	        <div class="form-inline">
	            <div class="input-group col-sm-6">
	                  <label>
	                      <a class="btn btn-success" href=""""),_display_(/*9.58*/routes/*9.64*/.PostController.addPost(1)),format.raw/*9.90*/("""">投稿</a>
	                      <a class="btn btn-success" href=""""),_display_(/*10.58*/routes/*10.64*/.PostController.findPost(1)),format.raw/*10.91*/("""">検索</a>
	                  </label>
	            </div>
	        </div>
	        <div></div>
				"""),_display_(/*15.6*/tablePost(posts, "showAllPost", currentPage, maxPage)),format.raw/*15.59*/("""
	    """),format.raw/*16.6*/("""</div>
	</div>
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(posts:List[models.Post],currentPage:Int,maxPage:Int): play.twirl.api.HtmlFormat.Appendable = apply(posts,currentPage,maxPage)

  def f:((List[models.Post],Int,Int) => play.twirl.api.HtmlFormat.Appendable) = (posts,currentPage,maxPage) => apply(posts,currentPage,maxPage)

  def ref: this.type = this

}


}

/**/
object showPostList extends showPostList_Scope0.showPostList
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 14:30:48 JST 2016
                  SOURCE: /Users/mac_thieu/git/CloneFromBitbucket/app/views/Post/showPostList.scala.html
                  HASH: 594a6394bc86cd9dce5c82f4232e8916e24ea633
                  MATRIX: 783->1|936->59|964->62|989->79|1028->81|1056->83|1284->285|1298->291|1344->317|1437->383|1452->389|1500->416|1625->515|1699->568|1732->574|1778->590
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|40->9|40->9|41->10|41->10|41->10|46->15|46->15|47->16|49->18
                  -- GENERATED --
              */
          
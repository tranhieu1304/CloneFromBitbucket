
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

class createNewPost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[models.Post],List[models.Post],List[String],Int,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPost: Form[models.Post], posts: List[models.Post], message : List[String], currentPage: Int, maxPage: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.lang.String;  var username = "";var favoriteStatus = true;
import java.lang.Long; var favoriteId = -1l; var countFavorite = 0l;

Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("New Post")/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""
	"""),format.raw/*7.2*/("""<div>
	    <div class="container">
	        <div class="form-inline">
	            <div class="input-group col-sm-6">
					"""),_display_(/*11.7*/helper/*11.13*/.form(action = routes.PostController.createPost(), 'method -> "POST")/*11.82*/ {_display_(Seq[Any](format.raw/*11.84*/("""
						"""),_display_(/*12.8*/(helper.inputText (
							field = formPost("url"),
							'_label -> "Url",
							'placeholder -> "Enter Url"
						))),format.raw/*16.9*/("""
							"""),_display_(/*17.9*/if(message.size()>0)/*17.29*/{_display_(Seq[Any](format.raw/*17.30*/("""
								"""),_display_(/*18.10*/for( error <- message) yield /*18.32*/{_display_(Seq[Any](format.raw/*18.33*/("""
									"""),format.raw/*19.10*/("""<p style="color:red;"> """),_display_(/*19.34*/error),format.raw/*19.39*/("""</p>
								""")))}),format.raw/*20.10*/("""
							""")))}),format.raw/*21.9*/("""
						"""),format.raw/*22.7*/("""<button type="submit">投稿</button>
					""")))}),format.raw/*23.7*/("""
	            """),format.raw/*24.14*/("""</div>
	        </div>
	        """),_display_(/*26.11*/tablePost(posts, "createNewPost", currentPage, maxPage)),format.raw/*26.66*/("""
	
	    """),format.raw/*28.6*/("""</div>
	</div>
	<a class="#" href=""""),_display_(/*30.22*/routes/*30.28*/.PostController.showAllPost(1)),format.raw/*30.58*/("""">All Post </a>
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(formPost:Form[models.Post],posts:List[models.Post],message:List[String],currentPage:Int,maxPage:Int): play.twirl.api.HtmlFormat.Appendable = apply(formPost,posts,message,currentPage,maxPage)

  def f:((Form[models.Post],List[models.Post],List[String],Int,Int) => play.twirl.api.HtmlFormat.Appendable) = (formPost,posts,message,currentPage,maxPage) => apply(formPost,posts,message,currentPage,maxPage)

  def ref: this.type = this

}


}

/**/
object createNewPost extends createNewPost_Scope0.createNewPost
              /*
                  -- GENERATED --
                  DATE: Mon Dec 05 15:49:54 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks/app/views/Post/createNewPost.scala.html
                  HASH: 40eddf4eb4e96c324fa43e825fdf1da7955dbb9d
                  MATRIX: 816->1|1162->112|1190->256|1217->258|1241->274|1280->276|1308->278|1458->402|1473->408|1551->477|1591->479|1625->487|1765->607|1800->616|1829->636|1868->637|1905->647|1943->669|1982->670|2020->680|2071->704|2097->709|2142->723|2181->732|2215->739|2285->779|2327->793|2387->826|2463->881|2498->889|2561->925|2576->931|2627->961|2674->978
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|37->7|41->11|41->11|41->11|41->11|42->12|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|51->21|52->22|53->23|54->24|56->26|56->26|58->28|60->30|60->30|60->30|61->31
                  -- GENERATED --
              */
          
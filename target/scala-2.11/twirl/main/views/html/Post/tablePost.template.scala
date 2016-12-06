
package views.html.Post

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tablePost_Scope0 {
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

class tablePost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Post],String,Int,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[models.Post], pageName : String, currentPage: Int, maxPage: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.lang.String;  var username = "";var favoriteStatus = true;
import java.lang.Long; var favoriteId = -1l; var countFavorite = 0l;

Seq[Any](format.raw/*1.79*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<table class="table table-filter" id="productTable">
        <thead>
         <tr  class="postList">
             <th>お気に入り</th>
             <th>投稿日</th>
             <th>画像</th>
             <th>投稿者</th>
             <th>記事一覧</th>
             <th>遷移</th>
         </tr>
        </thead>
        
        <tbody>
         """),_display_(/*19.11*/for(post <- posts) yield /*19.29*/{_display_(Seq[Any](format.raw/*19.30*/("""
	         	"""),_display_(/*20.13*/{countFavorite=0}),format.raw/*20.30*/("""
	         	"""),_display_(/*21.13*/{favoriteId = -1}),format.raw/*21.30*/("""
          """),_display_(/*22.12*/for(favorite <-post.favorites) yield /*22.42*/{_display_(Seq[Any](format.raw/*22.43*/("""
	          	"""),_display_(/*23.14*/if(favorite.user !=null)/*23.38*/{_display_(Seq[Any](format.raw/*23.39*/("""
		           	"""),_display_(/*24.16*/if(favorite.user.email == session.get("email"))/*24.63*/{_display_(Seq[Any](format.raw/*24.64*/("""
		           			"""),_display_(/*25.18*/{favoriteId = favorite.id}),format.raw/*25.44*/("""
		           			"""),_display_(/*26.18*/(favoriteStatus = favorite.isDelete)),format.raw/*26.54*/("""
		           	""")))}),format.raw/*27.16*/(""" 
		           	"""),_display_(/*28.16*/if(favorite.isDelete == false)/*28.46*/{_display_(Seq[Any](format.raw/*28.47*/("""
		           		"""),_display_(/*29.17*/{countFavorite += 1}),format.raw/*29.37*/("""
		           	""")))}),format.raw/*30.16*/("""
	           """)))}),format.raw/*31.14*/("""
      		""")))}),format.raw/*32.10*/("""
          """),format.raw/*33.11*/("""<tr id=""""),_display_(/*33.20*/post/*33.24*/.id),format.raw/*33.27*/("""" class="postList">
              <td>
	              	<a href="javascript:;" class="star" id=""""),_display_(/*35.58*/favoriteId),format.raw/*35.68*/("""" value =""""),_display_(/*35.79*/favoriteStatus),format.raw/*35.93*/(""""=>
						<i class="glyphicon glyphicon-star"></i>
					</a>
					<a href="#" data-like="0"> """),_display_(/*38.34*/countFavorite),format.raw/*38.47*/(""" """),format.raw/*38.48*/("""</a>
              </td>
              <td>
              		"""),_display_(/*41.18*/post/*41.22*/.createDate.format("dd/MM/yyyy")),format.raw/*41.54*/("""
              """),format.raw/*42.15*/("""</td>
              <td class="image">
              		<img alt="" src=""""),_display_(/*44.35*/post/*44.39*/.imgUrl),format.raw/*44.46*/("""">
              </td>
              <td>
              		"""),_display_(/*47.18*/post/*47.22*/.user.name),format.raw/*47.32*/("""
              """),format.raw/*48.15*/("""</td>
              <td>
              	<a class="" href=""""),_display_(/*50.35*/routes/*50.41*/.PostController.viewPostDetail(post.id)),format.raw/*50.80*/("""">"""),_display_(/*50.83*/post/*50.87*/.title),format.raw/*50.93*/("""</a>	
              </td>
              <td>
	               """),_display_(/*53.18*/if(pageName == "showAllPost" || pageName == "findPost")/*53.73*/{_display_(Seq[Any](format.raw/*53.74*/("""
	               		"""),format.raw/*54.19*/("""<a class="btn btn-success" href="">Vist Website</a>
	               """)))}),format.raw/*55.18*/("""
					"""),_display_(/*56.7*/if( pageName == "createNewPost")/*56.39*/{_display_(Seq[Any](format.raw/*56.40*/("""
		               	"""),format.raw/*57.19*/("""<a class="btn btn-danger" href="">削除</a>
		               	<a class="btn btn-success" href="">編集</a>
	               """)))}),format.raw/*59.18*/("""
              """),format.raw/*60.15*/("""</td>
          </tr>　
         """)))}),format.raw/*62.11*/("""
        """),format.raw/*63.9*/("""</tbody>
</table>
	<div>
	      """),_display_(/*66.9*/paginationPost( pageName ,currentPage, maxPage)),format.raw/*66.56*/("""
	"""),format.raw/*67.2*/("""</div>
<script src=""""),_display_(/*68.15*/routes/*68.21*/.Assets.versioned("javascripts/post.js")),format.raw/*68.61*/("""" type="text/javascript"></script>

"""))
      }
    }
  }

  def render(posts:List[models.Post],pageName:String,currentPage:Int,maxPage:Int): play.twirl.api.HtmlFormat.Appendable = apply(posts,pageName,currentPage,maxPage)

  def f:((List[models.Post],String,Int,Int) => play.twirl.api.HtmlFormat.Appendable) = (posts,pageName,currentPage,maxPage) => apply(posts,pageName,currentPage,maxPage)

  def ref: this.type = this

}


}

/**/
object tablePost extends tablePost_Scope0.tablePost
              /*
                  -- GENERATED --
                  DATE: Mon Dec 05 15:54:59 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks/app/views/Post/tablePost.scala.html
                  HASH: 59a810afa34c74aa2341eda1e1d4810398e7fc46
                  MATRIX: 784->1|1095->78|1123->222|1150->223|1502->548|1536->566|1575->567|1615->580|1653->597|1693->610|1731->627|1770->639|1816->669|1855->670|1896->684|1929->708|1968->709|2011->725|2067->772|2106->773|2151->791|2198->817|2243->835|2300->871|2347->887|2391->904|2430->934|2469->935|2513->952|2554->972|2601->988|2646->1002|2687->1012|2726->1023|2762->1032|2775->1036|2799->1039|2922->1135|2953->1145|2991->1156|3026->1170|3147->1264|3181->1277|3210->1278|3298->1339|3311->1343|3364->1375|3407->1390|3507->1463|3520->1467|3548->1474|3634->1533|3647->1537|3678->1547|3721->1562|3807->1621|3822->1627|3882->1666|3912->1669|3925->1673|3952->1679|4041->1741|4105->1796|4144->1797|4191->1816|4291->1885|4324->1892|4365->1924|4404->1925|4451->1944|4600->2062|4643->2077|4707->2110|4743->2119|4802->2152|4870->2199|4899->2201|4947->2222|4962->2228|5023->2268
                  LINES: 27->1|33->1|35->5|36->6|49->19|49->19|49->19|50->20|50->20|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|56->26|56->26|57->27|58->28|58->28|58->28|59->29|59->29|60->30|61->31|62->32|63->33|63->33|63->33|63->33|65->35|65->35|65->35|65->35|68->38|68->38|68->38|71->41|71->41|71->41|72->42|74->44|74->44|74->44|77->47|77->47|77->47|78->48|80->50|80->50|80->50|80->50|80->50|80->50|83->53|83->53|83->53|84->54|85->55|86->56|86->56|86->56|87->57|89->59|90->60|92->62|93->63|96->66|96->66|97->67|98->68|98->68|98->68
                  -- GENERATED --
              */
          

package views.html.Post

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object paginationPost_Scope0 {
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

class paginationPost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pageName: String,currentPage: Integer, maxPage: Integer ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet"  href=""""),_display_(/*2.32*/routes/*2.38*/.Assets.versioned("stylesheets/pagination.css")),format.raw/*2.85*/("""">
<div class ="pagination-container text-center">
  <ul class="pagination">
        """),_display_(/*5.10*/if(currentPage == 1)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
            """),format.raw/*6.13*/("""<li class="disabled"><span>&larr;</span></li>
        """)))}/*7.11*/else/*7.16*/{_display_(Seq[Any](format.raw/*7.17*/("""
            """),format.raw/*8.13*/("""<li>
            	 """),_display_(/*9.16*/if(pageName == "showAllPost")/*9.45*/{_display_(Seq[Any](format.raw/*9.46*/("""
	               		"""),format.raw/*10.19*/("""<a href=""""),_display_(/*10.29*/controllers/*10.40*/.routes.PostController.showAllPost(currentPage - 1)),format.raw/*10.91*/(""""> &larr;</a>
	               """)))}),format.raw/*11.18*/("""
				"""),_display_(/*12.6*/if( pageName == "createNewPost")/*12.38*/{_display_(Seq[Any](format.raw/*12.39*/("""
		               	"""),format.raw/*13.19*/("""<a href=""""),_display_(/*13.29*/controllers/*13.40*/.routes.PostController.addPost(currentPage - 1)),format.raw/*13.87*/(""""> &larr;</a>
	               """)))}),format.raw/*14.18*/("""
               """),_display_(/*15.17*/if( pageName == "findPost")/*15.44*/{_display_(Seq[Any](format.raw/*15.45*/("""
	               		"""),format.raw/*16.19*/("""<a href=""""),_display_(/*16.29*/controllers/*16.40*/.routes.PostController.findPost(currentPage - 1)),format.raw/*16.88*/(""""> &larr;</a>
               	  """)))}),format.raw/*17.20*/("""
            	
            """),format.raw/*19.13*/("""</li>
        """)))}),format.raw/*20.10*/("""

        """),_display_(/*22.10*/for(index <- 1 to maxPage) yield /*22.36*/ {_display_(Seq[Any](format.raw/*22.38*/("""
            """),_display_(/*23.14*/if(currentPage == index)/*23.38*/ {_display_(Seq[Any](format.raw/*23.40*/("""
                """),format.raw/*24.17*/("""<li class="disabled"><span>"""),_display_(/*24.45*/index),format.raw/*24.50*/("""</span></li>
            """)))}/*25.15*/else/*25.20*/{_display_(Seq[Any](format.raw/*25.21*/("""
            	"""),format.raw/*26.14*/("""<li>
	             """),_display_(/*27.16*/if(pageName == "showAllPost")/*27.45*/{_display_(Seq[Any](format.raw/*27.46*/("""
		               		"""),format.raw/*28.20*/("""<a href=""""),_display_(/*28.30*/controllers/*28.41*/.routes.PostController.showAllPost(index)),format.raw/*28.82*/(""""> """),_display_(/*28.86*/index),format.raw/*28.91*/("""</a>
		               """)))}),format.raw/*29.19*/("""
				"""),_display_(/*30.6*/if( pageName == "createNewPost")/*30.38*/{_display_(Seq[Any](format.raw/*30.39*/("""
		               	"""),format.raw/*31.19*/("""<a href=""""),_display_(/*31.29*/controllers/*31.40*/.routes.PostController.addPost(index)),format.raw/*31.77*/(""""> """),_display_(/*31.81*/index),format.raw/*31.86*/("""</a>
	               """)))}),format.raw/*32.18*/("""
	              """),_display_(/*33.17*/if( pageName == "findPost")/*33.44*/{_display_(Seq[Any](format.raw/*33.45*/("""
	               		"""),format.raw/*34.19*/("""<a href=""""),_display_(/*34.29*/controllers/*34.40*/.routes.PostController.findPost(index)),format.raw/*34.78*/(""""> """),_display_(/*34.82*/index),format.raw/*34.87*/("""</a>
	              	  """)))}),format.raw/*35.20*/("""
	          """),format.raw/*36.12*/("""</li>
            """)))}),format.raw/*37.14*/("""
        """)))}),format.raw/*38.10*/("""

        """),_display_(/*40.10*/if(currentPage == maxPage)/*40.36*/ {_display_(Seq[Any](format.raw/*40.38*/("""
            """),format.raw/*41.13*/("""<li class="disabled"><span>&rarr;</span></li>
        """)))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
            """),format.raw/*43.13*/("""<li>
             	"""),_display_(/*44.16*/if(pageName == "showAllPost")/*44.45*/{_display_(Seq[Any](format.raw/*44.46*/("""
	               		"""),format.raw/*45.19*/("""<a href=""""),_display_(/*45.29*/controllers/*45.40*/.routes.PostController.showAllPost(currentPage + 1)),format.raw/*45.91*/(""""> &rarr;</a>
	               """)))}),format.raw/*46.18*/("""
				"""),_display_(/*47.6*/if( pageName == "createNewPost")/*47.38*/{_display_(Seq[Any](format.raw/*47.39*/("""
		               	"""),format.raw/*48.19*/("""<a href=""""),_display_(/*48.29*/controllers/*48.40*/.routes.PostController.addPost(currentPage + 1)),format.raw/*48.87*/(""""> &rarr;</a>
	               """)))}),format.raw/*49.18*/("""
               """),_display_(/*50.17*/if( pageName == "findPost")/*50.44*/{_display_(Seq[Any](format.raw/*50.45*/("""
	               		"""),format.raw/*51.19*/("""<a href=""""),_display_(/*51.29*/controllers/*51.40*/.routes.PostController.findPost(currentPage + 1)),format.raw/*51.88*/(""""> &rarr;</a>
               	  """)))}),format.raw/*52.20*/("""
            """),format.raw/*53.13*/("""</li>
        """)))}),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""</ul>
</div>"""))
      }
    }
  }

  def render(pageName:String,currentPage:Integer,maxPage:Integer): play.twirl.api.HtmlFormat.Appendable = apply(pageName,currentPage,maxPage)

  def f:((String,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (pageName,currentPage,maxPage) => apply(pageName,currentPage,maxPage)

  def ref: this.type = this

}


}

/**/
object paginationPost extends paginationPost_Scope0.paginationPost
              /*
                  -- GENERATED --
                  DATE: Mon Dec 05 15:49:54 JST 2016
                  SOURCE: /Users/mac_thieu/feedpicks/app/views/Post/paginationPost.scala.html
                  HASH: f682b36d37495deb75875f306bcb878576211c11
                  MATRIX: 784->1|937->59|964->60|1021->91|1035->97|1102->144|1214->230|1242->250|1281->252|1321->265|1394->321|1406->326|1444->327|1484->340|1530->360|1567->389|1605->390|1652->409|1689->419|1709->430|1781->481|1843->512|1875->518|1916->550|1955->551|2002->570|2039->580|2059->591|2127->638|2189->669|2233->686|2269->713|2308->714|2355->733|2392->743|2412->754|2481->802|2545->835|2600->862|2646->877|2684->888|2726->914|2766->916|2807->930|2840->954|2880->956|2925->973|2980->1001|3006->1006|3051->1033|3064->1038|3103->1039|3145->1053|3192->1073|3230->1102|3269->1103|3317->1123|3354->1133|3374->1144|3436->1185|3467->1189|3493->1194|3547->1217|3579->1223|3620->1255|3659->1256|3706->1275|3743->1285|3763->1296|3821->1333|3852->1337|3878->1342|3931->1364|3975->1381|4011->1408|4050->1409|4097->1428|4134->1438|4154->1449|4213->1487|4244->1491|4270->1496|4325->1520|4365->1532|4415->1551|4456->1561|4494->1572|4529->1598|4569->1600|4610->1613|4684->1669|4697->1674|4736->1675|4777->1688|4824->1708|4862->1737|4901->1738|4948->1757|4985->1767|5005->1778|5077->1829|5139->1860|5171->1866|5212->1898|5251->1899|5298->1918|5335->1928|5355->1939|5423->1986|5485->2017|5529->2034|5565->2061|5604->2062|5651->2081|5688->2091|5708->2102|5777->2150|5841->2183|5882->2196|5928->2211|5960->2216
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|50->19|51->20|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|66->35|67->36|68->37|69->38|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|76->45|77->46|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|84->53|85->54|86->55
                  -- GENERATED --
              */
          
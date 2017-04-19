package code.snippet

import net.liftweb.http.S
import net.liftweb.http.js.JE.JsRaw

import scala.xml.NodeSeq

/**
  * Created by Riccardo Sirigu on 19/04/2017.
  */
class RoundtripInjector extends ArticleRT with SimpleRT{
  def render(): NodeSeq = {
    val functions = (for {
      session <- S.session
    } yield {
      S.appendGlobalJs(JsRaw(s"var myRTFunctions = ${session.buildRoundtrip(getRoundTrips).toJsCmd}").cmd)
      NodeSeq.Empty
    }) openOr NodeSeq.Empty
    functions
  }
}

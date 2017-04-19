package code.snippet

import code.lib.EmptyRoundTrip
import code.model.ArticleFactory
import net.liftweb.http.{RoundTripHandlerFunc, RoundTripInfo}
import net.liftweb.json.JsonDSL._

/**
  * Created by Riccardo Sirigu on 19/04/2017.
  */
trait ArticleRT extends EmptyRoundTrip{

  protected def allArticles(func: RoundTripHandlerFunc): Unit = {
    val jsonArticles = ArticleFactory.build.map(a => ("id" -> a.id) ~ ("name" -> a.name))
    func.send(jsonArticles)
  }

  private val roundTrips: List[RoundTripInfo] = List("articleQuery" -> allArticles _)

  abstract override protected def getRoundTrips: List[RoundTripInfo] = super.getRoundTrips ++ roundTrips
}

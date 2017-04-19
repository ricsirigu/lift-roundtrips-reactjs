package code.snippet

import code.lib.EmptyRoundTrip
import net.liftweb.http.{RoundTripHandlerFunc, RoundTripInfo}
import net.liftweb.json.JsonAST.{JField, JObject, JString, JValue}
/**
  * Created by Riccardo Sirigu on 19/04/2017.
  */
trait SimpleRT extends EmptyRoundTrip{

  protected def doSimpleRT(value: JValue, func: RoundTripHandlerFunc): Unit = {
    func.send(JObject(JField("hello",JString("world"))))
  }

  private val roundTrips: List[RoundTripInfo] = List("doSimpleRT" -> doSimpleRT _)

  abstract override def getRoundTrips: List[RoundTripInfo] = super.getRoundTrips ++ roundTrips
}

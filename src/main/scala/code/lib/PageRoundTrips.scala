package code.lib

import net.liftweb.http.RoundTripInfo

/**
  * Created by Riccardo Sirigu on 19/04/2017.
  */

abstract class PageRoundTrips{
  protected def getRoundTrips: List[RoundTripInfo]
}

class EmptyRoundTrip extends PageRoundTrips{
  override protected def getRoundTrips: List[RoundTripInfo] = Nil
}



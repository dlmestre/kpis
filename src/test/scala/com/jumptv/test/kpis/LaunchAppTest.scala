package com.jumptv.test.kpis

import com.jumptv.test.kpis.coordinator.Coordinator
import org.scalatest.FlatSpecLike

class LaunchAppTest extends FlatSpecLike {

  val mapping = Map(
    "subscriberid" -> "123",
    "producttype" -> "456"
  )

  "Transform users mapping" should "run" in {

    val sid = Coordinator.run(mapping)
    assert(sid == ("123", "456"))

  }

}

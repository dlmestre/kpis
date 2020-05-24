package com.jumptv.test.kpis

import com.jumptv.test.kpis.coordinator.Coordinator
import org.scalatest.FlatSpecLike

class LaunchAppTest extends FlatSpecLike {

  val mapping = Map(
    "subscriberid" -> "123"
  )

  "Transform gsn users" should "run" in {

    val sid = Coordinator.run(mapping)
    assert(sid == "123")

  }

}

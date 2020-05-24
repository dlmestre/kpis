package com.jumptv.test.kpis.coordinator

import com.jumptv.test.suite
import com.jumptv.test.suite.commons.Variables._

object Coordinator {

  def run(map: Map[String, String]): String = {
    println(map.get(subscriberid))
    map.get(subscriberid).getOrElse(NA)
  }

}

package com.github.nabezokodaikon.util

import org.scalatest.FunSuite
import com.github.nabezokodaikon.util.Loan._

class LoanTest extends FunSuite {

  class CloseExample {
    var isClosed = false
    def close(): Unit = {
      isClosed = true
    }
  }

  test("Close test.") {
    val i = new CloseExample()
    var isWorked = false
    using(i) { j =>
      isWorked = true
      true
    }

    assert(isWorked == true)
    assert(i.isClosed == true)
  }
}

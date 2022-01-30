package org.GeeksForGeeks.tutorial.loops.breaks

import scala.util.control.Breaks.{break, breakable}

/** Output:
  *
  * 1
  * 2
  * 3
  * 4
  * 5
  * 6
  * breaking!
  *
  * Process finished with exit code 0
  */
object breakableApp extends App {

  breakable { // Here, breakable is used to prevent exception
    for (i <- 1 to 10) {
      println(i)
      if (i == 6) {
        println("breaking!")
        break
      }
    }
  }
}

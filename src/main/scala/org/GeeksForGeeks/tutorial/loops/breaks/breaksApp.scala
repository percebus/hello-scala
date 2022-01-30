package org.GeeksForGeeks.tutorial.loops.breaks

import scala.util.control._


/** Output
  *
  * 5:, 20, 25; break!
  * 10:, 20, 25; break!
  * 15:, 20, 25; break!
  * Process finished with exit code 0
  */
object breaksApp extends App {

  val xBreaks = new Breaks
  xBreaks.breakable { // breakable is used to prevent from exception
    var x = 0
    for (x <- List(5, 10, 15)) {
      printf("\n%s:", x)

      val yBreaks = new Breaks
      yBreaks.breakable {
        var y = 0
        for (y <- List(20, 25, 30)) {
          print(", "+y)
          if (y >= 25) {
            print("; break!")
            yBreaks.break
          }
        }
      }
    }
  }
}

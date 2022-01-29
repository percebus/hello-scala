package org.GeeksForGeeks.tutorial.files

import scala.io.Source


/** Output:
  *
  * 1
  *
  *
  * 2
  *
  *
  * 3
  *
  *
  * 4
  *
  *
  * 5
  *
  *
  * 6
  *
  *
  * 7
  *
  *
  * 8
  *
  *
  * 9
  *
  *
  * 1
  * 0
  *
  * Process finished with exit code 0
  */
object sourceFileApp extends App {
  val oSource:Source = Source.fromResource("numbers.csv")
  while (oSource.hasNext) {
    println(oSource.next)
  }
  oSource.close()
}

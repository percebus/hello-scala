package org.GeeksForGeeks.tutorial.collections.maps


/** Output
  *
  * 30
  *
  * Process finished with exit code 0
  */
object mapApp extends App {
  val oMap:Map[String, Int] = Map(
    "Ajay"    -> 30,
    "Bhavesh" -> 20,
    "Charlie" -> 50)

  val score = oMap("Ajay")
  println(score) // 30
}

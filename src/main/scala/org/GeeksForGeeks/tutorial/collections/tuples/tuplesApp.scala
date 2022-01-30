package org.GeeksForGeeks.tutorial.collections.tuples


/** Output:
  *
  * 15
  * chandan
  * true
  *
  * Process finished with exit code 0
  */
object tuplesApp extends App {

  val tuple:(Int, String, Boolean) = (15, "chandan", true)
  println(tuple._1) // 15
  println(tuple._2) // "chandan"
  println(tuple._3) // true
}

package org.GeeksForGeeks.tutorial.arrays


/** Output:
  *
  * second element of an array is:
  * geeks
  *
  * Process finished with exit code 0
  */
object namesApp extends App {

  val names:Array[String] = Array(
    "gfg",
    "geeks",
    "GeeksQuize",
    "geeksforgeeks")

  println("second element of an array is: ")
  println( names(1) ) // "geeks"
}

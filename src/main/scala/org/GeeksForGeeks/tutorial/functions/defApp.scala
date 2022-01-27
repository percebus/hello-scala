package org.GeeksForGeeks.tutorial.functions


/** Output:
  *
  * Sum is: 8
  *
  * Process finished with exit code 0
  */
object defApp extends App {

  def add(a:Int, b:Int):Int = { a + b }

  println( "Sum is: "+add(5, 3) )
}

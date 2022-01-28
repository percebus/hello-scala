package org.GeeksForGeeks.tutorial.functions


/** Output:
  *
  * Min is: 3
  * Max is: 5
  * Sum is: 8
  *
  * Process finished with exit code 0
  */
object defFunctionApp extends App {

  def add(a:Int, b:Int):Int = { a + b }

  def getMinAndMaxTuple(a:Int, b:Int):(Int, Int) = {

    def getMin() = { // Nested function
      if (a < b) { a }
      else       { b }
    }

    def getMax() = { // Nested function
      if(a > b) { a }
      else      { b }
    }

    ( getMin(), getMax() )
  }

  val tuple:(Int, Int) = getMinAndMaxTuple(5, 3)
  val min = tuple._1
  val max = tuple._2
  println("Min is: "+min)
  println("Max is: "+max)
  println( "Sum is: "+add(5, 3) ) // 8
}

package org.GeeksForGeeks.tutorial.loops

/** Output:
  *
  * Value of y is: 1
  * Value of y is: 2
  * Value of y is: 3
  * Value of y is: 4
  *
  * Process finished with exit code 0
  */
object forDemoApp extends App {

  var y = 0
  for (y <- 1 to 4) { // for loop execution with range
    println("Value of y is: " + y)
  }
}

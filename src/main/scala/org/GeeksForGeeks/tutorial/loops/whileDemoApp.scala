package org.GeeksForGeeks.tutorial.loops


/** Output
  *
  * Value of x: 1
  * Value of x: 2
  * Value of x: 3
  * Value of x: 4
  *
  * Process finished with exit code 0
  */
object whileDemoApp extends App {

  var x = 1
  while ({ x <= 4 }) {// Exit when x becomes greater than 4
    println("Value of x: " + x)
    x += 1
  }
}

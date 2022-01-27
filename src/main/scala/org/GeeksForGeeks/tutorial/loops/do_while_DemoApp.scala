package org.GeeksForGeeks.tutorial.loops


/** Output:
  *
  * 10 9 8 7 6 5 4 3 2 1
  * Process finished with exit code 0
  */
object do_while_DemoApp extends App {

  var a = 10
  do {
    print(a + " ")
    a -= 1
  } while ( { a > 0 })
}

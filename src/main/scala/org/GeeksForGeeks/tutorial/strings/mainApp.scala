package org.GeeksForGeeks.tutorial.strings


/** Output:
  *
  * String 1:Welcome! GeeksforGeeks
  * String 2: to Portal
  * New String :Welcome! GeeksforGeeks  to Portal
  *
  *     This is the tutorial
  *     of Scala language
  *     on GFG portal
  *
  *
  * Process finished with exit code 0
  */
object mainApp extends App {

  val implicitString        = "Welcome! GeeksforGeeks "
  val explicitString:String = " to Portal"

  println("String 1:" +implicitString)
  println("String 2:" +explicitString)

  val newString:String = implicitString.concat(explicitString)
  println("New String :"+newString)

  println("""
    This is the tutorial
    of Scala language
    on GFG portal
  """)
}

package org.GeeksForGeeks.tutorial.types


/** Output
  *
  * boolean:geeksforgeeks
  * byte: 126
  * float: 2.45673
  * integer: 3
  * short: 45
  * double: 2.93846523
  * char: A
  *
  * Process finished with exit code 0
  */
object typesApp extends App {

  val boolean:Boolean = true
  val byte:Byte       = 126
  val int:Int         = 3
  val short:Short     = 45
  val float:Float     = 2.45673F // look at the 'F'
  val double:Double   = 2.93846523
  val char:Char       = 'A'

  if (boolean) {
    println("boolean:geeksforgeeks")
  }

  println("byte: "+byte)
  println("float: "+float)
  println("integer: "+int)
  println("short: "+short)
  println("double: "+double)
  println("char: "+char)
}

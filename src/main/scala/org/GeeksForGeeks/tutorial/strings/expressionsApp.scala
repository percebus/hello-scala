package org.GeeksForGeeks.tutorial.strings


/** Output:
  *
  * Some(Geeks4Geeks)
  * Some(Geeks4Geeks)
  *
  * Process finished with exit code 0
  */
object expressionsApp extends App {

  val name = "Geeks4Geeks".r // r() method
  val sentence:String = "Geeks4Geeks is a CS portal."

  println( name.findFirstIn(sentence) ) // Some("Geeks4Geeks")
  println( name findFirstIn sentence  ) // Some("Geeks4Geeks")
}

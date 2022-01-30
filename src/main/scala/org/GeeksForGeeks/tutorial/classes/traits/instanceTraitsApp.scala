package org.GeeksForGeeks.tutorial.classes.traits


trait WelcomeTrait {
  println("Welcome to WelcomeTrait")
}

trait SpookyTrait {
  println("Boo!")
}


class Empty {} // look ma! no hands!


/** Output
  *
  * Welcome to WelcomeTrait
  * Boo!
  *
  * Process finished with exit code 0
  */
object instanceTraitsApp extends App {
  val obj = new Empty with WelcomeTrait with SpookyTrait
}

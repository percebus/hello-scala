package org.GeeksForGeeks.tutorial.classes.traits


trait Greeter {
  def greeting():Unit // Abstract method
}

trait Tutorial {
  def tutorial():Unit = { // Non-abstract method
    println("This is a tutorial of Traits in Scala")
  }
}


class GreeterTutorial
  extends Greeter with Tutorial // << multi-traits
{
  def greeting():Unit = { // Implementation of abstract method
    println("Welcome to GeeksfoGeeks")
  }
}


/** Output:
  *
  * Welcome to GeeksfoGeeks
  * This is a tutorial of Traits in Scala
  *
  * Process finished with exit code 0
  */
object multiTraitsApp extends App {
  val oGreeterTutorial = new GreeterTutorial
      oGreeterTutorial greeting()
      oGreeterTutorial tutorial()
}

package org.GeeksForGeeks.tutorial.classes.traits

trait Pet { // kinda like abstract interfaces
  def print_race()
  def print_color()
}

class Dog(name:String, color:String) extends Pet {
  override def print_race():Unit = {
    println("Race: "+this.getClass)
  }

  override def print_color():Unit = {
    println( "Color: '%s'".format(color) )
  }

  def print_name():Unit = {
    println( "Name: '%s'".format(name) )
  }
}


/** Output:
  *
  * Race: class org.GeeksForGeeks.tutorial.classes.traits.Dog
  * Color: 'white'
  * Name: 'Dollar'
  *
  * Process finished with exit code 0
  */
object TraitsApp extends App {
  val dollarDog = new Dog(name="Dollar", color="white")
      dollarDog.print_race()
      dollarDog print_color() // no '.'
      dollarDog print_name    // no ()
}

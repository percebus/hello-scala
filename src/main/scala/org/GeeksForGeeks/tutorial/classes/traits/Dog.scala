package org.GeeksForGeeks.tutorial.classes.traits


trait Animal { // kinda like abstract interfaces
  def print_color():Unit // abstract method

  def print_race():Unit = {
    println("Race: "+this.getClass)
  }
}

trait Pet extends Animal {
  def print_name():Unit // abstract method
}


class Dog(name:String, color:String) extends Pet {

  def print_color():Unit = { // implementation of abstract method
    printf("Color: '%s'\n", this.color)
  }

  def print_name():Unit = {
    printf("Name: '%s'\n", this.name)
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
object traitsApp extends App {

  val dollarDog = new Dog(name="Dollar", color="white")
      dollarDog.print_race()
      dollarDog print_color() // no '.'
      dollarDog print_name    // no ()
}

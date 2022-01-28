package org.GeeksForGeeks.tutorial.classes


class Smartphone {
  val name:String = "Apple"
  val generation:Int = 16

  def print():Unit = {
    println("Name of the company : "+name)
    println("Total number of Smartphone generation: "+generation)
  }
}


/** Output:
  *
  * Name of the company : Apple
  * Total number of Smartphone generation: 16
  *
  * Process finished with exit code 0
  */
object SmartphoneApp extends App {
  val oSmartphone:Smartphone = new Smartphone()
      oSmartphone print
}

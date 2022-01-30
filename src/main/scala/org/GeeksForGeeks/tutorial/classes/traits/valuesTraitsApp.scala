package org.GeeksForGeeks.tutorial.classes.traits


trait ValuesTrait {

  var value:Int // Abstract field

  // Concrete fields
  var Height = 10
  val Width  = 30
}


class OverrideValuesClass extends ValuesTrait {

  // Overriding MyTrait's fields
               Height = 40 // var re-assignment
           var value  = 12 // var re-implementation
  override val Width  = 10 // val override


  def print() { // Method to display the fields
    printf("Value : %d\n" , value)
    printf("Height: %d\n", Height)
    printf("Width : %d\n" , Width)
  }
}


/** Output:
  *
  * Value : 12
  * Height: 40
  * Width : 10
  *
  * Process finished with exit code 0
  */
object valuesTraitsApp extends App {
  val oOverrideValuesClass = new OverrideValuesClass
      oOverrideValuesClass.print()
}

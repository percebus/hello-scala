package org.GeeksForGeeks.tutorial.exceptions


/** Output:
  *
  * IllegalArgument Exception
  * Number must be positive
  *
  * Process finished with exit code 0
  */
object validateApp extends App {

  def validate(number:Int):Boolean = {
    if (number < 0) {
      throw new IllegalArgumentException("Number must be positive")
    }

    true
  }


  try {
    val number = -1
    validate(number)
    println("This is a valid number") // This gets ignored
  } catch {
    case oException:IllegalArgumentException => {
      println("IllegalArgument Exception")
      println(oException getMessage)
    }

    case oException:Exception => {
      println("Generic Exception")
      println(oException getMessage)
    }
  }
}

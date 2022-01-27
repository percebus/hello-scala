package org.GeeksForGeeks.tutorial.operators


/** Output:
  *
  * 10 + 4: 14
  * 10 - 4: 6
  * Equal To Operator is False
  * (true || false): true
  * Bitwise AND: 0
  * Addition Assignment Operator: ()
  * Did x change?: 14
  *
  * Process finished with exit code 0
  */
object geeksApp extends App {
  var x:Int = 10
  val four:Int = 4

  println ("10 + 4: "+ (x + four) ) // 14
  println ("10 - 4: "+ (x - four) ) //  6

  if (x == four) {
    println ("Equal To Operator is True")
  } else { // <<<
    println ("Equal To Operator is False")
  }

  val _true:Boolean = true
  val _false:Boolean = false
  // using Logical Operator 'OR'
  println("(true || false): " + (_true || _false)) // true

  // using Bitwise AND Operator
  var result:Int = x & four
  println ("Bitwise AND: " + result) // 0 // TODO understand WHY?

  // using Assignment Operators
  println ("Addition Assignment Operator: " + (x += four) ) // () // TODO understand WHY?

  println("Did x change?: " + x) // 14 // yes!
}


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
  var x = 10
  val four = 4
  val isTrue = true
  val isFalse = false
  var result = 0

  println ("10 + 4: "+ (x + four) ) // 14
  println ("10 - 4: "+ (x - four) ) //  6

  if (x == four) {
    println ("Equal To Operator is True")
  } else { // <<<
    println ("Equal To Operator is False")
  }

  // using Logical Operator 'OR'
  println("(true || false): " + (isTrue || isFalse)) // true

  // using Bitwise AND Operator
  result = x & four
  println ("Bitwise AND: " + result ) // 0 // TODO understand WHY?

  // using Assignment Operators
  println ("Addition Assignment Operator: " + (x += four) ) // () // TODO understand WHY?

  println("Did x change?: " + x) // 14 // yes!
}


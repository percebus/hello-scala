package org.GeeksForGeeks.tutorial.operators


object Geeks extends App {
  var x = 10
  val four = 4
  val isTrue = true
  val isFalse = false
  var result = 0

  println ("10 + 4: "+ (x + four) )
  println ("10 - 4: "+ (x - four) )

  if (x == four) {
    println ("Equal To Operator is True")
  } else {
    println ("Equal To Operator is False")
  }

  // using Logical Operator 'OR'
  println("(true || false): " + (isTrue || isFalse))

  // using Bitwise AND Operator
  result = x & four
  println ("Bitwise AND: " + result )

  // using Assignment Operators
  println ("Addition Assignment Operator: " + (x += four) )
}

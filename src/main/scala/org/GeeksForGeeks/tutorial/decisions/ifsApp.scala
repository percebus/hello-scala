package org.GeeksForGeeks.tutorial.decisions


/** Output:
  *
  * Even Number
  * Number is divisible by 2 and 5
  * Sudo Placement
  *
  * Process finished with exit code 0
  */
object ifsApp extends App {

  val a:Int = 650

  /* if the remainder of a division /2 is 0
   * it's an even number
   */
  if (  (a % 2)  ==  0  ) {
    println("Even Number")

    if(a % 5 == 0) {// nested
      println("Number is divisible by 2 and 5")
    }
  }

  if (a > 698) {
    /* This statement will not
     * execute as a > 698 is false
     */
    println("GeeksforGeeks")
  } else {
    println("Sudo Placement")
  }
}

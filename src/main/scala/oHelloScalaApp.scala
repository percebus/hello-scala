
/** Output:
  *
  * This is a string.-
  * 6
  * bananas: This is a string.- bananas
  * getResult.toString(): This is a string.- 6
  * ''.getResult: This is a string.- 6
  * ''+1+2+3: This is a string.- 123
  *
  * Process finished with exit code 0
  */
object oHelloScalaApp extends App {
  val string = "This is a string.- "
  println(string)

  def getResult:Int = 1 +2 +3
  println(getResult)

  def concatString(x:String):String = string+x

  println( "bananas: "+concatString("bananas") )
  println( "getResult.toString(): "+concatString(getResult toString)  )
  println( "''.getResult: "+concatString(""+getResult)  )
  println( "''+1+2+3: "+concatString(""+1+2+3)  )
}

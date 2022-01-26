
object HelloScalaApp extends App {
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

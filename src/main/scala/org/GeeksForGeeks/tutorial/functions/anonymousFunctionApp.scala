package org.GeeksForGeeks.tutorial.functions


/** Output:
  *
  * Geeks12Geeks
  * GeeksforGeeks
  *
  * Process finished with exit code 0
  */
object anonymousFunctionApp extends App {

  val concatExplicit = (string1:String, string2:String) => string1+string2

  /* An anonymous function is created using '_' wildcard
   * instead of variable name
   * because str1 and str2 variable appear only once
   */
  var concatImplicit = (_:String)+(_:String)

  println( concatExplicit("Geeks", "12Geeks") )
  println( concatImplicit("Geeks", "forGeeks") )
}

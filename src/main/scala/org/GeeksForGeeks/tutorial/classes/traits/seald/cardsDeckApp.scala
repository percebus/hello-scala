package org.GeeksForGeeks.tutorial.classes.traits.seald


sealed trait Card extends Enumeration
case object ♣ extends Card
case object ♠ extends Card
case object ♦ extends Card
case object ♥ extends Card


/** Output:
  *
  * ♣ club
  * ♥ heart
  * ♠ spade
  * ♦ diamond
  *
  * Process finished with exit code 0
  */
object cardsDeckApp extends App {

  def getCardName(card:Card):String = card match {
    case ♣ => "♣ club"
    case ♥ => "♥ heart"
    case ♠ => "♠ spade"
    case ♦ => "♦ diamond"
  }

  println( getCardName(♣) )
  println( getCardName(♥) )
  println( getCardName(♠) )
  println( getCardName(♦) )
}

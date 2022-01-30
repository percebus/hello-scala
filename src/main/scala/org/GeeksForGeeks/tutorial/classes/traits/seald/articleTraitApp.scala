package org.GeeksForGeeks.tutorial.classes.traits.seald

sealed trait Article {
  val article = "not done"
}

class ScalaArticle extends Article {
  override val article = "scala article"
}

class JavaArticle extends Article {
  override val article = "java article"
}

class CSharpArticle extends Article {
  override val article = "C# article"
}


/** Output:
  *
  * java article
  * scala article
  * C# article
  *
  * Process finished with exit code 0
  */
object articleTraitApp extends App {

  def matchArticle(article:Article):String = article match {
    case oArticle:CSharpArticle => oArticle.article
    case oArticle: ScalaArticle => oArticle.article
    case oArticle:  JavaArticle => oArticle.article
  }

  val cSharpArticle = new CSharpArticle
  val  scalaArticle = new  ScalaArticle
  val   javaArticle = new   JavaArticle

  println( matchArticle(javaArticle)   )
  println( matchArticle(scalaArticle)  )
  println( matchArticle(cSharpArticle) )
}

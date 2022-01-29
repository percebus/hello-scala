package org.GeeksForGeeks.tutorial.collections.lists

import scala.collection.Iterator
import scala.collection.immutable._ // XXX? works w/o it


/** Output:
  *
  * Lists
  * explicit: List(Geeks, GFG, GeeksforGeeks, Geek123)
  * implicit: List(C, C#, Java, Scala, PHP, Ruby)
  *
  * for each
  * C C# Java Scala PHP Ruby
  *
  * iterator
  * C C# Java Scala PHP Ruby
  * Process finished with exit code 0
  */
object listsApp extends App {
  val explicitList:List[String] = List("Geeks", "GFG", "GeeksforGeeks", "Geek123")
  val implicitList              = List("C", "C#", "Java", "Scala", "PHP", "Ruby")

  println("Lists")
  println("explicit: "+explicitList)
  println("implicit: "+implicitList)

  println("\nfor each")
  for (item <- implicitList) {
    print(item+" ")
  }

  println("\n\niterator")
  val oIterator:Iterator[String] = implicitList.iterator
  while (oIterator.hasNext) {
    print(oIterator.next+" ")
  }
}

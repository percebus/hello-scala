package org.GeeksForGeeks.tutorial.collections.sets

import scala.collection.Iterator
import scala.collection.immutable._ // XXX? works w/o it


/** Output:
  *
  * Sets
  * explicit: Set(Geeks, GFG, GeeksforGeeks, Geek123)
  * implicit: Set(Scala, C#, Ruby, PHP, C, Java)
  *
  * iterator
  * Scala C# Ruby PHP C Java
  *
  * for each
  * Scala C# Ruby PHP C Java
  *
  * .foreach( x => do(x) )
  * Scala C# Ruby PHP C Java
  * Process finished with exit code 0
  */
object setsApp extends App {
  val explicitSet:Set[String] = Set(
    "Geeks", "Geeks",
    "GFG", "GFG", "GFG",
    "GeeksforGeeks", "GeeksforGeeks",
    "Geek123"
  )

  val implicitSet = Set(
    "C", "C", "C", "C",
    "C#", "C#", "C#",
    "Java", "Java",
    "Scala",
    "PHP", "PHP",
    "Ruby")

  println("Sets")
  println("explicit: "+explicitSet) // duplicates are removed
  println("implicit: "+implicitSet) // duplicates are removed

  println("\niterator")
  val oIterator:Iterator[String] = implicitSet.iterator
  while (oIterator.hasNext) {
    print(oIterator.next+" ")
  }

  println("\n\nfor each")
  for (item <- implicitSet) {
    print(item+" ")
  }

  println("\n\n.foreach( x => do(x) )")
  implicitSet
    .foreach((item:String) => print(item+" "))
}

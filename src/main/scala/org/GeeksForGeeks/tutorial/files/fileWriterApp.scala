package org.GeeksForGeeks.tutorial.files

import java.io.File
import java.io.PrintWriter


object fileWriterApp extends App {
  val oFile = new File("tmp/fileWriterApp.txt" )
  val oPrintWriter = new PrintWriter(oFile)
      oPrintWriter write this.getClass.toString
      oPrintWriter close()
}

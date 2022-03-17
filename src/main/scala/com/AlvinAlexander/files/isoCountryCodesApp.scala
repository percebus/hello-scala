package com.AlvinAlexander.files

import java.io.{File, PrintWriter}

import org.json4s.DefaultFormats
import org.json4s.native.Json

import scala.io.BufferedSource

// Converts wikipedia-iso-cpuntry-codes.csv to JSON
// SRC: https://alvinalexander.com/scala/csv-file-how-to-process-open-read-parse-in-scala/
object isoCountryCodesApp extends App {
  val countries = collection.mutable.Map[  String,  Map[String, String]  ]()
  val csvBufferedSource:BufferedSource = io.Source.fromResource("wikipedia-iso-country-codes.csv")
      csvBufferedSource
        .getLines
        .drop(1) // header
        .foreach { line =>

//        val Array(shortName, alpha2, alpha3, numericCode, iso3166_2) = line // TODO?
          val cols = line                                                     // XXX?
            .split(",")
            .map(_.trim)

          // DEBUG
//        println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}|${cols(4)}")

          val shortName:String = s"${cols(0)}"    // "English short name lower case"
          val alpha2:String = s"${cols(1)}"       // "Alpha-2 code"
          val alpha3:String = s"${cols(2)}"       // "Alpha-3 code"
          val numericCode:String = s"${cols(3)}"  // "Numeric code"
//        val iso3166_2:String = s"${cols(4)}"    // "ISO 3166-2" // XXX? duplicates alpha-2

          countries(alpha3) = Map(
            "shortName"-> shortName,
            "alpha2" -> alpha2,
            "alpha3" -> alpha3,
            "numericCode" -> numericCode
          )
        }

  csvBufferedSource.close()


  val jsonString:String = Json(DefaultFormats).writePretty(countries)
  println(jsonString)

  val tmpFile = new File("tmp/wikipedia-iso-country-codes.json" )
  val tmpPrintWriter = new PrintWriter(tmpFile)
      tmpPrintWriter write jsonString
      tmpPrintWriter close()
}

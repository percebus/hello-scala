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

  val lines = csvBufferedSource
    .getLines
    .drop(1) // header

  for (line:String <- lines) {
    val cols = line
      .split(",")
      .map(_.trim)

    // DEBUG
//  println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}|${cols(4)}")

    // English short name lower case,Alpha-2 code,Alpha-3 code,Numeric code,ISO 3166-2
    val shortName:String = s"${cols(0)}"
    val alpha2:String = s"${cols(1)}"
    val alpha3:String = s"${cols(2)}"
    val numericCode:String = s"${cols(3)}"
//  val iso3166_2:String = s"${cols(4)}" // XXX? duplicates alpha-2

    val codes:Map[String, String] = Map(
      "shortName"-> shortName,
      "alpha2" -> alpha2,
      "alpha3" -> alpha3,
      "numericCode" -> numericCode
    )

    countries(alpha3) = codes
  }

  val jsonString:String = Json(DefaultFormats).writePretty(countries)
  println(jsonString)

  val tmpFile = new File("tmp/wikipedia-iso-country-codes.json" )
  val tmpPrintWriter = new PrintWriter(tmpFile)
      tmpPrintWriter write jsonString
      tmpPrintWriter close()
}

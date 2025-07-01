package com.codelabuk.scala

object Basics extends App {

  val meaningOfLife: Int = 42

  // meaningOfLife = 43 --> reassing not possible
  val aBoolean = false
  val aString = "This is Scala"
  val aComposeString = "This" + " " + " Scala"
  val aInterpolatedString = s"The meaning life of $aComposeString"

  println(aInterpolatedString)


}

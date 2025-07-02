package com.codelabuk.scala
package basic

object Basics extends App {

  val meaningOfLife: Int = 42

  // meaningOfLife = 43 --> reassing not possible
  val aBoolean = false
  val aString = "This is Scala"
  val aComposeString = "This" + " " + " Scala"
  val aInterpolatedString = s"The meaning life of $aComposeString"

  println(aInterpolatedString)

  val anExpression = 2 + 3
  val ifExpression = if (meaningOfLife > 43) 1 else 53

  val chainedExpression = {
    if (meaningOfLife > 41) 51
    else if(meaningOfLife > 23) 9
    else -1
  }

  val codeBlock = {
    // definition
    val aLocalValue = 6
    aLocalValue + 8
  }

  println(codeBlock)

}

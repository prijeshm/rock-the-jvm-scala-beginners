package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  //x = 2 // Error - Reassignment to val

  // VALS ARE IMMUTABLE

  val y = 2
  // COMPILER can infer types

  //val z: Int = "Hello, Scala"; // Error - related expected type Int

  //val aString: String = "hello"; val anotherString: String = "bye"
  // Semicolon is unnecessary in Scala until we write multiple lines of statements on a single line.

  val aString: String = "hello"
  val anotherString = "bye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4156
  val aLong: Long = 999999999999L
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.0


  // *************************** VARIABLES IN SCALA *****************************//
  var aVariable: Int = 4

  aVariable = 5 // side effects

}

package lectures.part1basics

object ValuesVariablesTypes extends App {

  //VALS ARE IMMUTABLE
  val x: Int = 42
  println(x)

  //COMPILER CAN INFER TYPES
  val y = 42
  println(y)

  val aString: String = "This is a String"

  var atBoolean: Boolean = true
  var afBoolean: Boolean = false

  val aChar: Char = 'a'
  val anInt: Int = x

  val aShort: Short = 4561 //represents 4 bytes
  val aLong: Long = 456454654564456464L //represents 8 bytes
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4;
  aVariable = 5 //side effects


}

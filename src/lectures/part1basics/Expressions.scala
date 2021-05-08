package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 //EXPRESSION
  println(x)

  println(2 + 3 * 4)
  //+ - * / & | ^ << >> >>> (rigth with zero extesion)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  //! && ||

  var aVariable = 2;
  aVariable += 3 //also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  //IF EXPRESSION
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //IF EXPRESSION NOT INSTRUCTION
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    print(i)
    i += 1
  }

  //NEVER WRITE THIS AGAIN
  //EVERyTHING IN SCALA IS AN EXPRESSION!

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "Hello" else "Goodbye"
  }

}

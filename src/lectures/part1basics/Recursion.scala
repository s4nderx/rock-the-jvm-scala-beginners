package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if(n <= 1) 1
    else {
      println(f"#:>> ${n} * ${n - 1}")
      val res = n * factorial(n - 1)
      println(f"##:> ${n}")
      res
    }

  // println(factorial(10))



  def anotherFactorial(n: Int): Int = {
    @tailrec
    def factHelper(x: Int, acc: Int): Int =
      if (x <= 1) acc
      else factHelper(x - 1, x * acc) //TAIL RECURSION

    factHelper(n, 1)
  }

  anotherFactorial(5)


  @tailrec
  def concatenateTailRec(aString: String, n: Int, acc: String = ""): String = {
    if(n <= 0) acc
    else concatenateTailRec(aString, n-1, aString+acc)
  }

  def anotherConcatenateTailRec(aString: String, n: Int): String = {
    @tailrec
    def concatenateHelper(s: String, x: Int, acc: String): String =
      if (x <= 0) acc
      else concatenateHelper(s, x-1, s+acc)

    concatenateHelper(aString, n, "")

  }

  println(concatenateTailRec(" hello", 3, ""))
  println(anotherConcatenateTailRec(" bye", 3))

  def isPrime(n: Int): Boolean = {
    def isPrimeTailrec(t: Int, isStillPrimne: Boolean): Boolean = {
      if (!isStillPrimne) false
      else if(t <= 1) true
      else isPrimeTailrec(t - 1, (n%t != 0) && isStillPrimne)
    }

    isPrimeTailrec(n/2, true)
  }

  //println(isPrime(11))
  println(isPrime(35))

  def fibonacci(n: Int): Int = {

    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)

  }

  println(fibonacci(8))
}

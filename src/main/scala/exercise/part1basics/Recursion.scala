package exercise.part1basics

import scala.annotation.tailrec

object Recursion  extends App {

  /*
    1. Concatenate a string n times using tail recursion
    2. IsPrime function using tail recursion
    3. Fibonacci function using tail recursion
   */

  @tailrec
  def concateString(str: String, n: Int, accumulator: String): String = {
    if(n < 1) accumulator
    else concateString(str, n - 1, str + accumulator)
  }

  println(concateString("PRIJESH", 30000, ""))

  def isPrime(n: Int): Boolean = {

    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if(i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }

    if(n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(4)) // 1 1 2 3 5 8 13 21
}

package lectures.part1basics

object Recursion extends App {
  def factorial(n: Int): Int =
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

  println(factorial(10))
  // println(factorial(5000)) // Stackoverflow error

  def anotherFactorial(n: Int): BigInt = {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if(x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the last expression
    }

    factorialHelper(n, 1)
  }

  /*
    anotherFactorial(10) = factorialHelper(10, 1)
    = factorialHelper(9, 10 * 1)
    = factorialHelper(8, 9 * 10 * 1)
    = factorialHelper(7, 8 * 9 * 10 * 1)
    = factorialHelper(6, 7 * 8 * 9 * 10 * 1)
    = factorialHelper(5, 6 * 7 * 8 * 9 * 10 * 1)
    = factorialHelper(4, 5 * 6 * 7 * 8 * 9 * 10 * 1)
    = factorialHelper(3, 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
    = factorialHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
    = factorialHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
    = 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1
  */

  println(anotherFactorial(5000))
  println(anotherFactorial(20000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

}

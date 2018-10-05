package exercise.part1basics

object Functions extends App {

  /* QUESTIONS
  * 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
  * 2. Factorial function => 1 * 2 * 3 * .... * n (recursive function)
  * 3. Fibonacci function
  *    f(1) = 1
  *    f(2) = 1
  *    f(n) = f(n - 1) + f(n - 2)
  * 4. Tests if a number is prime
  * */

  /* ANSWER 1 */

  def myGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(myGreetingFunction("Prijesh", 31))

  /* ANSWER 2 */
  def factorial(n: Int): Int = {
    if(n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(3))

  /* ANSWER 3 */
  def fibonacci(n: Int): Int = {
    if(n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  def getFibonacciNumber(n: Int): Int = {

    var res: Int = 0
    if(n <= 2) res = 1
    else res = getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2)
    println("inside getFibonacciNumber - returning " + res)
    res
  }

  println(getFibonacciNumber(5))

  /* ANSWER 4 */
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 12))
}

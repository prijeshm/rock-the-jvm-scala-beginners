package lectures.part1basics

object Functions extends App {
  def aFunction1(a: String, b: Int): String =
    a + " " + b
  def aFunction2(a: String, b: Int): String = {
    a + " " + b
  }
  def aFunction3(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction1("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)


  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("prijesh", 1))
  println(aRepeatedFunction("Jijina", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aStringReturningFunction(aString: String, anInt: Int) = aString + " " + anInt

  // A RECURSIVE FUNCTION SHOULD HAVE A RETURN TYPE

  /* This function will return error due to missing return type
  def aRepeatedFunctionWithoutReturnType(aString: String, n: Int) = {
    if(n == 1) aString
    else aString + aRepeatedFunctionWithoutReturnType(aString, n - 1)
  }
  */

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  aFunctionWithSideEffects("my string1") // my string1
  println(aFunctionWithSideEffects("my string2")) // ()

  // As code blocks can contain auxiliary definitions, code blocks also can contain auxiliary function definitions
  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n - 1)
  }

  println(aBigFunction(10))

}

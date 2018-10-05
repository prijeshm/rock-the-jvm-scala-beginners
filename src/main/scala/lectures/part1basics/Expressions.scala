package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // MATH OPERATORS IN SCALA
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  // RELATIONAL OPERATION EXPRESSION
  println(1 == x)

  // RELATIONAL OPERATORS IN SCALA
  // == != < <= > >=

  // BOOLEAN OPERATORS FOR LOGIC
  println(!(1 == x))
  // UNARY OPERATOR
  // !

  // BINARY OPERATOR
  // && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .... SIDE EFFECTS
  println(aVariable)


  //*********************** Instructions (DO) vs Expressions (VALUE) **************************

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION (not an IF Instruction)
  println(aConditionedValue)
  println(if(aCondition) 5 else 3) // Similar as println(1 + 3)

  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN
  // Loops are very specific to Imperative programming ie Java, Python, C etc


  // EVERYTHING IN SCALA IS AN EXPRESSION

  var aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)
  // The only value a Unit type can hold is ()
  // Reassigning a variable is a side effect, Side effects in Scala are actually expressions returning Unit

  // While Loop is also side effects which will also return Units
  i = 3
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }
  println(aWhile)

  // SIDE EFFECTS are: println(), while, reassigning


  // CODE BLOCKS
  // Special kind of Expressions, because they have special kind of properties
  // Value of the block is the value of the last expression

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "bye"
  }

  println(aCodeBlock)

  //val anotherValue = z + 1 // Error - because z is declared inside a code block and not visible outside

  // Expressions vs Instructions
  // 1. Instructions are executed(think Java), Expressions are evaluated(Scala)
  // 2. In Scala we will think in terms of expressions

}

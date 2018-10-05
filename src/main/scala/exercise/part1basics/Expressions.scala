package exercise.part1basics

object Expressions extends App {
  // Questions
  // 1. Difference between "hello world" and println("hello world")?
    // Answer: "hello world" is a value of type String or its a Sting literal.
    // println("hello world") is an expression which is a side effect and it will return a Unit
  // 2. Whats the value of this
    val someValue = {
      2 < 3
    }
    println(someValue)
    // Answer: true
    val someOtherValue = {
      if(someValue) 239 else 986
      42
    }
    println(someOtherValue)
    // Answer: 42
}

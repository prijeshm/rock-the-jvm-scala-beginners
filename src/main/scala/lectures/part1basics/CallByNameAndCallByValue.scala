package lectures.part1basics

object CallByNameAndCallByValue extends App{
  def calledByValue(x: Long): Unit = {
    println("By Value " + x)
    println("By Value " + x)
  }
  def calledByName(x: => Long): Unit = {
    println("By Name " + x)
    println("By Name " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)
  def printSecond(x: Int, y: => Int) = println(y)

  // printFirst(infinite(), 34) // Stackoverflow Error
  printFirst(34, infinite()) // will print 34
  //printSecond(34, infinite()) // Stackoverflow Error

  /*
    CALL BY VALUE
    1. value is computed before call
    2. same value used everywhere


    CALL BY NAME
    1. expression is passed literally
    2. expression is evaluated at every use within
  */

}

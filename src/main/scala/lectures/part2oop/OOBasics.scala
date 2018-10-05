package lectures.part2oop

object OOBasics extends App{
  val person = new Person("Prijesh", 31)
  println(person.age)
  println(person.x)
  person.greeting("Jijina")
  person.greeting()
}

// constructor
class Person(name: String, val age: Int = 0) {
  val x = 2

  println(1 + 3)

  // method
  def greeting(name: String): Unit = println(s"${this.name} says, Hello ${name}")

  // overloading
  def greeting(): Unit = println(s"Hello, I am $name")

  // multiple constructor
  def this(name: String) = this(name, 0)
  def this() = this("Default")

}
package exercise.part2oop

object OOBasics extends App {

  val author = new Writer("Prijesh", "Meppayil", 1987)
  val sameAuthor = new Writer("Prijesh", "Meppayil", 1987)
  val novel = new Novel("Scala the Best Parts", 2020, author)

  println(novel.authorAgeOnRelease())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(sameAuthor))

}

/*
  Novel and Writer class
  Writer: First Name, Sur Name, Birth Year
        : fullName() - which should append First Name & Sur Name
  Novel : Name, Release Year, Author
        : authorAgeOnRelease() -
        : isWrittenBy(author)
        : copy(newYear) = new instance of novel
*/
class Writer(firstName: String, surName: String, val birthYear: Int) {
  def fullName: String = firstName + " " + surName
}

class Novel(name: String, releaseYear: Int, author: Writer) {
  def authorAgeOnRelease(): Int = releaseYear - author.birthYear
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newReleaseYear: Int): Novel = new Novel(name, newReleaseYear, author)
}

/*
  Counter class
    - receives an Int value
    - method return currentCount
    - method to increment / decrement => new Counter
    - overload increment / decrement to receive an amount to change => new Counter
*/
class Counter(val count: Int) {
  //def getCurrentCount = count
  def inc = new Counter(count + 1)
  def dec = new Counter(count - 1)

  //def inc(n: Int) = new Counter(count + n)
  def inc(n: Int): Counter = {
    if(n <= 0) this
    else inc.inc(n - 1)
  }
  //def dec(n: Int) = new Counter(count - n)
  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n - 1)
  }
}
package lectures.part1basics

object DefaultAndNamedArgs extends App{
  def trFact(n: Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10)
  println(fact10)

  def savePicture(format: String = "JPEG", width: Int, height: Int): Unit =
    println("Saved picture in " + format + " format with " + height + "x" + width + " resolution")

  /*
    1. Pass in every leading argument
    2. name the arguments
   */
  savePicture(height = 1000, width = 1084)
  savePicture(width = 1024, format = "PNG", height = 1920)
}

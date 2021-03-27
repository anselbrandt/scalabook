object recurse extends App {
  def printchar(s: String): Unit = {
    if (s.length == 1) println(s)
    else {
      println(s.head)
      printchar(s.tail)
    }
  }
  printchar(args(0))
  println(short)
}

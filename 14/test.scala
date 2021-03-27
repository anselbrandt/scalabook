object test extends App {
  def add(a: Int, b: Int): Int = {
    a + b
  }
  val assertion = assert(add(2, 2) == 4)
}

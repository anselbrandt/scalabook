object functions extends App {
  def max(x: Int, y: Int): Int = if (x > y) x else y
  println(max(1, 3))
  def greet(s: String): Unit = println(s)
  greet("hello")
}

object partial extends App {
  def sum(a: Int, b: Int, c: Int) = a + b + c
  val a = sum _
  val b = a(1, 2, _)
  val c = b(3)
  println(c)
}

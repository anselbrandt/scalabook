object curry extends App {
  def curriedSum(x: Int)(y: Int) = x + y
  println(curriedSum(1)(2))
}

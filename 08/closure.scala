object closure extends App {
  var more = 1
  val addMore = (x: Int) => x + more
  println(addMore(10))
  more = 10;
  println(addMore(10))
}

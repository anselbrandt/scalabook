object sorting extends App {
  val list = List(6, 1, 3, 4, 8, 2, 9, 5)
  val sorted = list.sortWith(_ < _)
  println(sorted)
}

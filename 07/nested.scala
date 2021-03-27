object nested extends App {
  val arr = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
  for (list <- arr; el <- list) println(el)
}

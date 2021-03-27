object yields extends App {
  val arr = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
  def isEven =
    for {
      list <- arr
      el <- list
      if (el % 2 == 0)
      even = s"${el} is even"
    } yield even
  isEven.foreach(println(_))
}

object foldreverse extends App {
  def reverseLeft[T](xs: List[T]) =
    xs.foldLeft(List[T]()) { (ys, y) => y :: ys }
  val xs = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val reversed = reverseLeft(xs)
  println(reversed)
}

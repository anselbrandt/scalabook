import scala.annotation.meta.getter
object sort extends App {
  def msort[T](compare: (T, T) => Boolean)(xs: List[T]): List[T] = {
    def merge(xs: List[T], ys: List[T]): List[T] =
      (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (compare(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
    val n = xs.length / 2

    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(msort(compare)(ys), msort(compare)(zs))
    }
  }
  val xs = List(3, 2, 4, 1)
  println(msort(((a: Int, b: Int) => a < b))(xs))
}

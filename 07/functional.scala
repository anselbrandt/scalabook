object imperative extends App {
  def pad(s: String, l: Int): String = " " * (l - s.length) + s
  def row(i: Int, cols: Int): String =
    (1 to cols)
      .map(x => x * i)
      .map(x => x.toString())
      .map(x => pad(x, 4))
      .mkString(" ")
  def table(rows: Int, cols: Int) = (1 to rows).map(x => row(x, cols))
  table(10, 10).foreach(println)
}

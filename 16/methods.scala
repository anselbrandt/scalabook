object methods extends App {
  val list = List.range(1, 5);
  val list2 = List.range(1, 10, 2)
  val list3 = List.fill(5)('a')
  val list4 = List.tabulate(5)(n => n * n)
  val list5 = List.range(1, 5).map(n => n * n)
  val list6 = (List(10, 20) zip List(3, 4, 5)).map { case (x, y) => x * y }
  val list7 = (List(10, 20) lazyZip List(3, 4, 5)).map(_ * _)
  println(list7)
}

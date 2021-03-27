object zip extends App {
  val arr1 = Array(1, 2, 3)
  val arr2 = Array("a", "b", "c")
  val arr3 = Array("ff", "gg", "hh")
  val joined = for (i <- (0 to 2)) yield (arr1(i), arr2(i), arr3(i))
  joined.foreach(println)
}

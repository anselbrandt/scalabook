object lists extends App {
  val fruit: List[String] = List("apple", "banana", "pear")
  val berries: List[String] = List("blueberry", "strawberry", "raspberry")
  val a :: b :: rest = fruit
  val head = fruit.head
  val tail = fruit.tail
  val init = fruit.init
  val last = fruit.last
  val concat = fruit ::: berries
  val reversed = concat.reverse
  // drop - drops first n
  // take -  takes first n
  // splitAt - split starts at idx n
  val letters = List("a", "b", "c", "d", "e", "f", "g")
  val abc = letters.splitAt(3)
  // apply and indices - list.(2) or list apply 2 - avoid
  // flatten
  // zip and unzip
  // zipWithIndex
  val zipped = List(("a", 0), ("b", 1), ("c", 2), ("d", 3), ("e", 4))
  val (chars, nums) = zipped.unzip
  // mkString
  val sep = " "
  val stringified = fruit.mkString("***", sep, "!!!")
  println(stringified)
}

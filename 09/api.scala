object api extends App {
  val nums = List(1, 2, 3, 4, -5)
  // neg
  println(nums.exists(_ < 0))
  // odd
  println(nums.exists(_ % 2 == 0))
}

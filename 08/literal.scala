object literal extends App {
  val addOne: Int => Int = (x: Int) => x + 1
  var result = addOne(3)
  result = addOne(4)
  println(result)
}

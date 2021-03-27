object classes extends App {
  class Counter {
    var count = 0
    def incr = {
      count += 1
    }
    def decr = {
      count -= 1
    }
  }
  val clock = new Counter
  clock.incr
  clock.incr
  println(clock.count)
}

object fact extends App {
  def fact(x: BigInt): BigInt = {
    if (x == 0) 1 else x * fact(x - 1)
  }
  println(fact(30))
}

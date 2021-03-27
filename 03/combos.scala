object combos extends App {
  def fact(n: BigInt): BigInt = {
    if (n == 1) 1 else n * fact(n - 1)
  }
  def combos(n: BigInt, r: BigInt): BigInt = {
    fact(n) / (fact(r) * fact(n - r))
  }
  println(combos(99, 4))
}

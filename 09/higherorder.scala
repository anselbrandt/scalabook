object higherorder extends App {
  def fizzbuzz(i: Int) = {
    (i % 3, i % 5) match {
      case (0, 0) => true
      case _      => false
    }
  }
  def isPrime(n: Int): Boolean = {
    def test(i: Int, n2: Int): Boolean = {
      if (i * i > n2) true
      else if (n2 % i == 0 || n2 % (i + 2) == 0) false
      else test(i + 6, n2)
    }
    if (n <= 1) false
    else if (n <= 3) true
    else if (n % 2 == 0 || n % 3 == 0) false
    else test(5, n)
  }
  val results = for (num <- (1 to 100); if (isPrime(num))) yield num
  println(results)
}

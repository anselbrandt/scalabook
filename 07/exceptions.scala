object exceptions extends App {
  def half(n: Int) =
    if (n % 2 == 0)
      n / 2
    else
      throw new RuntimeException("n must be even")
  try {
    println(half(5))
  } catch {
    case ex: RuntimeException => println("oops")
  } finally {
    println("did it work?")
  }
}

/*

try/catch/finally

finally clauses ensure a side effect happens

acquire resource
execute try block
close the resource in finally block

see loan pattern

 */

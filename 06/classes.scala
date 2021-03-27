import scala.language.implicitConversions

object classes extends App {
  implicit def intToRational(x: Int) = new Rational(x)
  class Rational(n: Int, d: Int) {
    require(d != 0)
    private val g = gcd(n.abs, d.abs)
    val numer = n / g
    val denom = d / g
    def this(n: Int) = this(n, 1)
    // method overloading
    def +(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )
    def +(i: Int): Rational =
      new Rational(numer + i * denom, denom)
    def -(that: Rational): Rational =
      new Rational(
        numer * that.denom - that.numer * denom,
        denom * that.denom
      )
    def -(i: Int): Rational =
      new Rational(numer - i * denom, denom)
    def *(that: Rational): Rational =
      new Rational(numer * that.numer, denom * that.denom)
    def *(i: Int): Rational =
      new Rational(numer * i, denom)
    def /(that: Rational): Rational =
      new Rational(numer * that.denom, denom * that.numer)
    def /(i: Int): Rational =
      new Rational(numer, denom * i)
    override def toString = s"$numer/$denom"
    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
  }
  val x = new Rational(2, 3)
  // Int implicitly converted to Rational
  val result = 3 * x
  println(result.toString())
}

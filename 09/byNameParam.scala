object byNameParam extends App {
  var assertionsEnabled = true
  def myAssert(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError
  myAssert(() => 5 > 3)

  // to leave out the empty parameter list

  def byNameAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError
  byNameAssert(5 > 3)

  // cons of boolAssert

  def boolAssert(predicate: Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError
  // boolean expression is evaluated before call to boolAssert
  // unlike a function value which will be passed to byNameAssrt
  // if assertions are disabled, boolean expression may have side effects
  // eg. (x / 0 == 0)
  boolAssert(5 > 3)
}

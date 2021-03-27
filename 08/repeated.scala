object repeated extends App {
  // * shorthand for Seq[declared type]
  def echo(args: String*) = for (arg <- args) println(arg)
  echo("one", "two", "three")
  // if a Seq is passed when a repeated param is expected
  // arg must be appended with ": _*"
  val seq = Seq("1", "2", "3")
  echo(seq: _*)

  def echo2(args: Array[String]) = for (arg <- args) println(arg)
  echo2(args)
}

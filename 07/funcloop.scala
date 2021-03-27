object funcloop extends App {
  val arg =
    args
      .filter(arg => arg.endsWith("banana"))
      .mkString(" ")
  // .reduce((a, b) => a.concat(s" ${b}"))
  println(arg)
}

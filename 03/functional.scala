object functional extends App {
  def formatArgs(args: Array[String]) = args.mkString("\n")
  val formatted = formatArgs(args)
  println(formatted)
}

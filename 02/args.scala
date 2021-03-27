object args extends App {
  println(args.mkString(" "))
  println(s"${args.length} arguments")
  val longArgs = args.filter(arg => arg.length > 4).length
  println(s"${longArgs} arguments longer than 4")
  for (arg <- args; if arg.length > 4) println(arg)
}

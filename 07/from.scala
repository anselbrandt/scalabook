object from extends App {
  def inputs(i: Int) = for (arg <- args if arg.length < i) yield arg
  inputs(6).foreach(println(_))
}

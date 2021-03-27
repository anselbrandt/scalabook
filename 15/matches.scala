object matches extends App {
  val matrix = List(
    List(1, 2, 3),
    List(4, 5, 6),
    List(7, 8, 9)
  )
  // yield only if match, else drop
  val collected = matrix.collect { list =>
    list match {
      case list @ List(1, _*) => list
    }
  }
  println(collected)
  val fruits = List("apple", "banana", "pear")
  def getMatches(list: List[String]) = {
    for (el <- list) yield el match {
      case el if el.startsWith("a") => el
      case _                        =>
    }
  }
  println(getMatches(fruits))
}

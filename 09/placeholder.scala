object placeholder extends App {
  val words =
    List("applepie", "appleturnover", "candyapple", "foopsla", "swoopsla")

  def wordsMatching(matcher: String => Boolean) = {
    for (word <- words; if matcher(word)) yield word
  }

  def wordsEnding(query: String) =
    wordsMatching(_.endsWith(query))
  def wordsContaining(query: String) =
    wordsMatching(_.contains(query))
  def wordsRegex(query: String) =
    wordsMatching(_.matches(query))

  println(wordsEnding("apple"))
}

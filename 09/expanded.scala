object test extends App {
  val words =
    List("applepie", "appleturnover", "candyapple", "foopsla", "swoopsla")

  def wordsMatching(matcher: String => Boolean) = {
    for (word <- words; if matcher(word)) yield word
  }

  def wordsEnding(query: String) =
    wordsMatching(str => str.endsWith(query))
  def wordsContaining(query: String) =
    wordsMatching(str => str.contains(query))
  def wordsRegex(query: String) =
    wordsMatching(str => str.matches(query))

  println(wordsEnding("apple"))
}

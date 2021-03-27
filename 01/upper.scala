object upper extends App {
  def isUpper(s: String): Boolean = {
    s.exists(_.isUpper)
  }
  println(isUpper("hellO"))
}

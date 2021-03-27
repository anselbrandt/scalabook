import scala.collection.mutable

object sets extends App {
  var jets = Set("Boeing", "Airbus")
  jets += "Lear"
  jets += "Lear"
  println(jets)
  val movies = mutable.Set("Hitch", "Click")
  movies += "Shrek"
  println(movies)
}

package Main
import ElementFactory.elem
import Spiral.spiral

object Main extends App {
  def example = {
    val column1 = elem("id") above elem("01") above elem("02")
    val column2 = elem("  ") above elem("  ") above elem("  ")
    val column3 = elem("fruit") above elem("apple") above elem("pear")
    val column4 = elem("  ") above elem("  ") above elem("  ")
    val column5 = elem("qty") above elem("19") above elem("21")
    column1 beside column2 beside column3 beside column4 beside column5
  }
  // println("example [\n" + example + "\n]")

  val nSides = args(0).toInt
  println(spiral(nSides, 0))
}

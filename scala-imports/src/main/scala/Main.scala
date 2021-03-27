package Main
import Utils.{printer}

object Main extends App {
  val p = new Person("Alvin Alexander")
  printer(s"Hello ${p.name}")
}

class Person(var name: String)

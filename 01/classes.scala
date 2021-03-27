object classes extends App {
  class Person(val id: Int, val name: String)
  val employee = new Person(0, "bob")
  println(employee.name)
}

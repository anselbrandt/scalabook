object types extends App {
  val greetings: Array[String] = new Array[String](3)
  greetings(0) = "hello"
  greetings(1) = "bonjour"
  greetings(2) = "goodbye"
  greetings.foreach(println(_))
  for (i <- 0 to 2) println(greetings(i))
  println(greetings.getClass())
}

import scala.io.StdIn.readLine

object controls extends App {
  for (i <- 1 to 6 if i % 2 == 0)
    println("To " + i)
  for (i <- 1 until 6 if i % 2 == 0)
    println("Until " + i)
  println("Type something and hit enter")
  var line = ""
  do {
    line = readLine()
    println("Read: " + line)
  } while (line != "")
}

object traits extends App {
  trait Philosophical {
    def philosophize() = {
      println("I consume memory, therefor I am.")
    }
  }
  class Frog extends Philosophical {
    override def toString(): String = "green"
    override def philosophize(): Unit = println("I frog, therefore I am.")
  }
  class CyberFrog extends Frog {
    override def philosophize(): Unit = println(
      s"I ${super.toString()}, therefore I am."
    )
  }
  val roboFrog = new CyberFrog
  roboFrog.philosophize()
}

object flat extends App {
  val unflat = List(
    List(1, 2, 3),
    List(
      List(4, 5, 6),
      List(7, 8, 9)
    )
  )
  val flat = unflat.flatten
  println(flat)
}

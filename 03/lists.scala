object iists extends App {
  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  // concat
  val oneToFour = oneTwo ::: threeFour
  println(oneToFour)
  val twoThree = List(2, 3)
  // prepend
  val oneToThree = 1 :: twoThree
  println(oneToThree)
  // nil is empty list
  val oneToFive = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
  println(oneToFive)
}

/*

prepend is faster than append
prepend then reverse or use ListBuffer

List.drop(2) drops first 2
List.dropRight(2) drops last 2
List.exists(s=> s=="until") returns bool
List.filter(s=> s.length==4) returns list
List.forall(s=> s.endsWith("l")) returns bool
List.foreach(println)
List.head first
List.last last
List.init all but last
List.tail all but first
List.isEmpty
List.length
List.map
List.mkString(",")
List.filterNot()
List.reverse
List.sortWith((s,t)=> s<t)
 */

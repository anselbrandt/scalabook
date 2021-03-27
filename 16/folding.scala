object folding extends App {
    val list = List(
        (1,"a"),
        (2,"b"),
        (3,"c")
    )
    val folded = list.foldLeft(Map[Int,String]())((map,el)=>map+(el._1->el._2))
    println(folded)
}
object loanCurry extends App {
  def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
  val file = new File("date.txt")
  withPrintWriter(file) { writer =>
    writer.println(new java.util.Date)
  }
}

/*

because the function passed to withPrintWriter is the last argument in the list,
you can use currying to pull the first argument, the File, into a separate argument list

 */

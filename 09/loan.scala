object load extends App {
  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
  withPrintWriter(
    new File("date.txt"),
    writer => writer.println(new java.util.Date)
  )

}

/*

loan pattern

The control-abstraction function opens a resource and "loans" it to a function

When the function completes, it signals that it no longer needs the "borrowed" resource

The resource is then closed in a finally block, to ensure it is indeed closed,
regardless of whether the function completes by returning normally or throwing an exception.

 */

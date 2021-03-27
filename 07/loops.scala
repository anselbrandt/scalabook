object loops extends App {
  var i = 0
  var foundIt = true
  while (i < args.length && foundIt) {
    if (args(i).endsWith("banana")) {
      foundIt = true
      println(args(i), foundIt)
    } else foundIt = false
    i = i + 1
  }
}

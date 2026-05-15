
object main extends App {
  for(a <- 1 to 3) {
    println(a);
  }

  for(b <- 1 to 3) {
      println(b);
  }

  var createdList = for(a <- 1 to 10 if a % 2 == 0) yield {
     a
  }

  println(createdList)
}

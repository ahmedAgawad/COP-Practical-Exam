object Main extends App {
  println("Hello world");
  // for pattern matching logic to work with this variables it must given any type
  var x:Any = 10;
  var y:Any = 20;
  println(x.getClass)

  // comparing a variable type against some types for specific logic
  x match {
    case i:Int => println("X is an Int variable");
    case d: Double => println("X is a Double variable");
    case _ => println("it's other type")

  }
}


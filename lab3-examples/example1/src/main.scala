object main extends App {

  var testingFunc = PriceEngine.doublePrice(PriceEngine.processPrice(40, 10, PriceEngine.applyDiscount));
  println(testingFunc);

  val cart = List(100,250,500);
  val taxedCart = cart.map((item) => PriceEngine.addTax(item, 15));
  taxedCart.foreach(item => println(s"Final item taxed price $item"));
}

object PriceEngine {
   var processPrice = (basePrice:Int, adjustValue: Int, operation: (Int, Int) => Int) => {
     operation(basePrice, adjustValue);
   }

  val addTax = (_:Int) + (_:Int);
  val applyDiscount = (_:Int) - (_:Int);

  def doublePrice(x :Int) : Int = x * 2;

}
import scala.io.StdIn

object main extends App {
  var number1 : Int = StdIn.readInt();
  var number2 : Int = StdIn.readInt();

  var result : Boolean = checkObject.checkFun(number1, number2);
  var result2 : Boolean = checkObject.fun(number1, number2);
  println(result);
  println(result2)
}

object checkObject {
    def checkFun(num1:Int, num2:Int):Boolean = {
      if(num1 > 30 || num2 > 30 || num1 + num2 > 30) {
        return true;
      }

      return false;
    }

    var fun = (num1:Int, num2:Int) => {
      if(num1 > 30 || num2 > 30 || num1 + num2 > 30) {
        true
      } else {
         false
      }
    }
}

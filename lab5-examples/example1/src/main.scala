object main extends App {
  abstract class BankAccount(val accountNumber : String) {
    val accountType : String;
    protected var balance : Double = 0.0;
    def showDetails() : Unit;
  }

  class premiumAccount(accountNumber:String, var interestRate: Double) extends BankAccount(accountNumber) {
    override val accountType: String = "Premium";

    override def showDetails(): Unit = {
      println(s"$accountNumber of account type $accountType and has intereset rate $interestRate");
    }
  }

  class Client(val name:String, var age : Int) {
      def this(name: String) = {
        this(name, 18);
      }
  }

  case class Payment(id : Int , amount : Double, status : String);

  val paymentPend = Payment(1, 100000, "Pending");
  val paymentComp = paymentPend.copy(status = "Completed");
  println(paymentComp)


  println(processRequest((paymentPend)))

  def processRequest(request : Any) : String = {
    request match {
      case req : Int => "Numeric code received";
      case req : Payment if req.amount > 10000 => "High-value payment";
      case req : Payment if req.amount <= 10000 => "Standard payment proccessed";
      case _ => "Unknown Request";
    }
  }
}

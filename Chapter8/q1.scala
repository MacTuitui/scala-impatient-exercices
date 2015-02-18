class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount:Double) = { super.deposit(amount-1) }
  override def withdraw(amount:Double) = { super.withdraw(amount+1) }
}
//we might want to check if amount is 0 but...

object q1 extends App {
  val ba = new BankAccount(100)
  println(ba.currentBalance)
  println(ba.deposit(100))
  println(ba.withdraw(100))
  val ca = new CheckingAccount(100)
  println(ca.currentBalance)
  println(ca.deposit(100))
  println(ca.withdraw(100))
}



class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  var freeActionsLeft = 3
  def earnMonthlyInterest(interest: Double) = {
    freeActionsLeft = 4
    //the next line uses 1
    deposit(currentBalance*interest)
  }

  override def withdraw(amount: Double) = {
    super.withdraw(amount)
    if(freeActionsLeft > 0){
      freeActionsLeft -= 1
    } else {
      super.withdraw(1)
    }
    currentBalance
  }
  override def deposit(amount: Double) = {
    super.deposit(amount)
    if(freeActionsLeft > 0){
      freeActionsLeft -= 1
    }  else {
      super.withdraw(1)
    }
    currentBalance
  }
}

object q2 extends App{
  val sa = new SavingsAccount(100)
  println(sa.deposit(100))
  println(sa.deposit(100))
  println(sa.deposit(103))
  println(sa.withdraw(100))
  println(sa.withdraw(100))
  println(sa.withdraw(100))
  sa.earnMonthlyInterest(0.05)
  println(sa.currentBalance)
  println(sa.deposit(100))
  println(sa.deposit(100))
  println(sa.withdraw(100))
  println(sa.withdraw(100))
}



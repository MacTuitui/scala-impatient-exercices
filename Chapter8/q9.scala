class Creature {
  def range: Int = {
    println("Calling range in creature")
    10
  }
  val env: Array[Int] = new Array[Int](range)
  println("in Creature" + env.length)
}

class Ant extends Creature {
  println("Ant constructor")
  //comment the right line to test both
  //override def range = {
  override val range = {
    println("Calling range in ant")
    2
  }
  println(env.length)
}

object creatures extends App {
  //val c = new Creature
  val a = new Ant
}


// with a def, we create a function that is evaluated when called
// it looks like all the functions are defined before executing the 
// super constructor
//
// with a val, it's evaluated only when the constructor of Ant is 
// executed, so it is not defined when the super constructor is executed
//

// from http://examples.javacodegeeks.com/java-basics/java-inheritance-example/

class Animal {
  println("A new animal has been created!")
  def sleep = { println("An animal sleeps...") }
  def eat = { println("An animal eats...") }
}

class Dog extends Animal {
  //Animal's constructor has been called there so we see "A new animal has been created!"
  println("It's a dog!")
  override def sleep = { println("A dog sleeps...") }
  override def eat = { println("A dog eats...") }
}

class Bird extends Animal {
  println("It's a bird!")
  override def sleep = { println("A bird sleeps...") }
  override def eat = { println("A bird eats...") }
}


object Animals extends App {
  val a = new Animal
  val d = new Dog
  val b = new Bird

  a.sleep
  d.sleep
  b.sleep

  a.eat
  d.eat
  b.eat
}

import java.io._
import scala.collection.mutable._

@SerialVersionUID(42L) class Person(val name:String) extends Serializable {
  private val friends = new ArrayBuffer[Person]

  def addFriend(f: Person) = {
    friends+=f 
  }
  

  override def toString() = {
    name + " has " +friends.length+ " friend(s) (" + friends.map(_.name).mkString(", ") + ")"
  }
}

object friends extends App{
  val Alice = new Person("Alice")
  val Bob = new Person("Bob")
  val Charlie = new Person("Charlie")
  val Daniel = new Person("Daniel")
  val Emily = new Person("Emily")

  Alice.addFriend(Emily)
  Emily.addFriend(Alice)
  Bob.addFriend(Emily)
  Emily.addFriend(Bob)
  Charlie.addFriend(Daniel)
  Daniel.addFriend(Charlie)

  val all = Array(Alice, Bob, Charlie, Daniel, Emily)

  println("Before Serial")
  all.map(println(_))

  val out = new ObjectOutputStream(new FileOutputStream("/tmp/test.obj"))
  out.writeObject(all)
  //all.map(out.writeObject(_))
  out.close

  val in = new ObjectInputStream(new FileInputStream("/tmp/test.obj"))
  val all2 = in.readObject().asInstanceOf[Array[Person]]
  in.close
  println("After Serial")

  all2.map(println(_))

}




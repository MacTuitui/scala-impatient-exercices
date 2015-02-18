import scala.collection.mutable._
abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(val price: Double, val description: String) extends Item

class Bundle(var items: ArrayBuffer[Item] = ArrayBuffer[Item]()) {
  def price = {
    var sum:Double = 0
    for( i <- items ) { sum += i.price }
    sum
    //should be with a list
    //items.toList.foldLeft(0.0) ((sum, item) => (sum+item.price))
  }

  def addItem(i: Item) {
    items += i
  }

  def description = {
    var desc = "Bundle of : "
    for( i <- items ) { desc += "\n" + i.description }
    desc
    //similarly
    //items.toList.foldLeft("Bundle of:")( (s, item) => s+"\n"+item.description)
  }
}

object Items extends App {
  val si1 = new SimpleItem(1, "Item 1")
  val si2 = new SimpleItem(2, "Item 2")
  val si3 = new SimpleItem(3, "Item 3")
  val si4 = new SimpleItem(4, "Item 4")
  val si5 = new SimpleItem(5, "Item 5")

  val b1 = new Bundle()
  b1.addItem(si1)
  b1.addItem(si3)
  b1.addItem(si4)

  println(b1.price)
  println(b1.description)
}


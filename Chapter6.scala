//6.1

object Conversions {
  def inchesToCentimeters(x: Double) = { x*2.54 }
  def gallonsToLiters(x: Double) = { x*3.78541 }
  def milesToKilometers(x: Double) = { x*1.60934 }
}

println(Conversions.inchesToCentimeters(2))
println(Conversions.gallonsToLiters(2))
println(Conversions.milesToKilometers(2))

//6.2

class UnitConversion(val factor: Double) {
  def apply(x: Double) = {factor*x}
}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78541)
object MilesToKilometers extends UnitConversion(1.60934)

println(InchesToCentimeters(2))
println(GallonsToLiters(2))
println(MilesToKilometers(2))


//6.3

object Origin extends java.awt.Point(0,0)

//well, you can still do Origin.move(x,y) so it is difficult to keep the origin fixed
Origin.move(2,2)
println("Origin coordinates are "+Origin.x+" " +Origin.y)


//6.4
class Point(var x: Double, var y: Double){
}

object Point {
  def apply(x: Double, y:Double) = {
    new Point(x,y)
  }
}

//should give an instance of Point
println(Point(3,4))

//6.5

object Reverse extends App {
  println(args.reverse.mkString(" "))
}
//scalac and scala Reverse arg0 arg1 arg2 arg5

//6.6
object Suits extends Enumeration {
  val Spades = Value(0,"♠")
  val Hearts = Value(1,"♥")
  val Diamonds = Value(2,"♦")
  val Clubs = Value(3,"♣")
}

for(c <- Suits.values) println(c)

//6.7
def isRed(cardSuit : Suits.Value) = {
  cardSuit.id == 1 || cardSuit.id == 2
}

println(isRed(Suits.Spades))
println(isRed(Suits.Hearts))
//!\\ the type is Suits.Value //!\\

//6.8
object Corners extends Enumeration {
  val Red = Value(0xff0000)
  val Blue = Value(0x0000ff)
  val Green = Value(0x00ff00)
  val Black = Value(0x000000)
  val White = Value(0xffffff)
  val Magenta = Value(0xff00ff)
  val Yellow = Value(0xffff00)
  val Cyan = Value(0x00ffff)
}

for(c <- Corners.values) println( c +" -> 0x"+ c.id.toHexString)

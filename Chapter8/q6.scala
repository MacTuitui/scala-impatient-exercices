abstract class Shape {
  def centerPoint: (Double, Double)
}

class Rectangle(x: Double, y:Double, w: Double, h:Double) extends Shape {
  def centerPoint = (x+w/2, y+h/2)
}

class Circle(x: Double, y:Double, r:Double) extends Shape {
  def centerPoint = (x,y)
}

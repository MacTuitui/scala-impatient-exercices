class Square(x: Int, y:Int, w:Int) extends java.awt.Rectangle(x,y,w,w) {

  def this(w: Int){
    this(0,0,w)
  }
  def this() {
    this(0,0,0)
  }
}

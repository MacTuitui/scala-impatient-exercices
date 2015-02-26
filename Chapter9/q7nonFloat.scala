import scala.io.Source

object noFloat extends App {
  val source = Source.fromFile(args(0))
  //process by line
  for(l <- source.getLines) {
    val tokens = l.split("\\s+")
    //deal with - or + but not 1e3 notation
    val isFloat = "([-+]?[0-9]*\\.?[0-9]+)".r
    for( t:String <- tokens){
      //println("Token: "+t)
        isFloat.findFirstIn(t) match {
          case Some(s) => {}
          case None => println(t) 
        }
    }
  }
  source.close
}


import scala.io.Source

object statsFloat extends App {

  //read in array
  val source = Source.fromFile(args(0))
  val numbers = source.getLines.toArray.map(_.toFloat)
  //need to put in an array otherwise it's only traversable ONCE!
  source.close
  
  println("Sum: " + numbers.sum)
  println("Min: " + numbers.min)
  println("Max: " + numbers.max)
  println("Avg: " + numbers.sum/numbers.length)

}

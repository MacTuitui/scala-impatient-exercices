import scala.io.Source

object powerOf2 extends App {
  //compute
  val powers = (0 to 20).map( Math.pow(2,_).toInt)
  val invpowers = (0 to 20).map( p => Math.pow(2, -p))
  val both = powers.zip(invpowers)
  val maxLength = powers.map(_.toString).maxBy(_.length).length
  for( (n,inv) <- both) { println( " " *(maxLength-n.toString.length) + n +" "+inv)}
}

import scala.io.Source
object MoreThan12 extends App {
  Source.fromFile(args(0)).getLines.mkString(" ").split(' ').filter(_.length>12).map(println(_))
}

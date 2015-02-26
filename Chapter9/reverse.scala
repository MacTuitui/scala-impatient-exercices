import scala.io.Source
import java.io.PrintWriter

object Reverse extends App {
  //read in array
  val source = Source.fromFile(args(0))
  val lines = source.getLines.toArray.reverse
  val out = new PrintWriter(args(0))
  lines.map( out.println(_))
  source.close
  out.close
}

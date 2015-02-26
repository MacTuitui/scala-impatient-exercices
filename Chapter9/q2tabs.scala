import scala.io.Source
import java.io.PrintWriter
import scala.annotation._

object Tab2Space extends App {
  @tailrec
  def prettify(index: Int, previous: String, next: String, n: Int): String = {
    //look for a tab
    val tab = "\t".r
    val parts = tab.split(next)
    //println(parts.mkString("|"))
    parts.length match {
      case 1 => previous+next //no tabs left
      case _ => {
        // add the first part to previous 
        // pad with spaces
        // recurse (but tail-rec)
        val l = parts(0).length
        val count = n - ( l - (l/n) *n)
        prettify(index+l+count, previous+parts.head+" "*count, parts.tail.mkString("\t"),n)
      }
    }
  }

  //read in array
  val source = Source.fromFile(args(0))
  val lines = source.getLines
  //val out = new PrintWriter(args(0)+".new")
  //process the lines with a recursive call to the prettify function

  for(l <- lines) {
    println("Before :" + l)
    println("--------" + "0         "*10)
    println("After  :"+ prettify(0,"",l,20))
  }
  source.close
  //out.close()
}


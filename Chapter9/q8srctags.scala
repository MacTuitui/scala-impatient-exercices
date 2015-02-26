import scala.io.Source

object extractSrc extends App {
  val source = Source.fromFile(args(0))

  //not considering quotes in src
  val imgTag= "<img.+src=\"(.*)\"".r
  for(l <- source.getLines) {
    for(imgTag(src) <- imgTag.findAllIn(l) ){
      println(src)
    }
  }
  source.close

}

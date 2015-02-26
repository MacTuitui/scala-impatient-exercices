import scala.io.Source

object strings extends App {
  val source = Source.fromFile(args(0))
  for( l <- source.getLines ) {
    //find text
    // http://stackoverflow.com/questions/5695240/php-regex-to-ignore-escaped-quotes-within-quotes/5696141#5696141
    // I'm not going to lie here  :)
    val reg = "\"([^\"\\\\]|\\\\.)*\"".r
    reg.findAllIn(l).toArray.map(println(_))
  }
  source.close
}

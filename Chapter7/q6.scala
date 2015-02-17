import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}
import scala.collection.JavaConversions.asScalaSet

object CopyHashMap extends App {
  val jmap = new JavaHashMap[String, String]()
  val smap = new ScalaHashMap[String, String]()
  for(i <- 0 until 10){
    jmap.put("key"+i, "Value"+i)
  }
  println("In the java HashMap")
  for(k <- jmap.keySet()) {
    println(k +" -> "+jmap.get(k)) 
  }

  //copy
  for(k <- jmap.keySet()){
    smap += (k -> jmap.get(k))
  }
  println("In the scala HashMap")
  for((k,v) <- smap) println(k+"->"+v)
}

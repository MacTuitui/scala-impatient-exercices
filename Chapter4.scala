import scala.collection.JavaConversions._

val m = Map("PS4" -> 400, "XBone" -> 500, "WiiU" -> 250)

println("Original : " + m) 
val mdiscount = for( (v,k) <- m) yield (v, k*.9)
println("Discounted : "+ mdiscount)

//####

val in = new java.util.Scanner(new java.io.File("words.txt"))
val wordmap = scala.collection.mutable.Map[String, Int]()
while (in.hasNext ) {
  val word= in.next
  val count = wordmap.getOrElse(word,0)
  wordmap+=(word -> (count+1))
}
println(wordmap)


val in2 = new java.util.Scanner(new java.io.File("words.txt"))
var wordmap2 = scala.collection.immutable.Map[String, Int]()
while (in2.hasNext ) {
  val word= in2.next
  val count = wordmap2.getOrElse(word,0)
  wordmap2+=(word -> (count+1))
}
println(wordmap2)

val in3 = new java.util.Scanner(new java.io.File("words.txt"))
var sortedMap = scala.collection.immutable.SortedMap[String, Int]()
while (in3.hasNext ) {
  val word= in3.next
  val count = sortedMap.getOrElse(word,0)
  sortedMap+=(word -> (count+1))
}
println(sortedMap)

val in4 = new java.util.Scanner(new java.io.File("words.txt"))
val treeMap = new java.util.TreeMap[String,Int]()
while (in4.hasNext ) {
  val word= in4.next
  val count = if(treeMap.containsKey(word)) treeMap.get(word) else 0
  treeMap.put(word,count+1)
}
//for( word <- asScalaSet(treeMap.keySet)) println(word+"->"+treeMap.get(word))
println(treeMap)


val days = scala.collection.mutable.LinkedHashMap(
    "Monday" -> java.util.Calendar.MONDAY,
    "Tuesday" -> java.util.Calendar.TUESDAY,
    "Wednesday" -> java.util.Calendar.WEDNESDAY,
    "Thursday" -> java.util.Calendar.THURSDAY,
    "Friday" -> java.util.Calendar.FRIDAY,
    "Saturday" -> java.util.Calendar.SATURDAY,
    "Sunday" -> java.util.Calendar.SUNDAY)

println(days)

//well it's in insertion order... what else?

val props: scala.collection.Map[String, String] = System.getProperties()
val mlength = props.maxBy(_._1.length)._1.length
for( (prop, value) <- props) {
    val nspaces = mlength-prop.length+1
  println(prop  + " "*nspaces + "| " + value)
}

def minmax(values: Array[Int]) = (values.min,values.max)

println(minmax(Array(1,2,3,4,5)))


def lteqgt(values: Array[Int], v:Int) = (values.count(_<v), values.count(_==v), values.count(_>v))

println(lteqgt(Array(1,2,3,4,5),4))

val zipped = "Hello".zip("World")
println(zipped)

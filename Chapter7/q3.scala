package object random {
  var current: Int = 1

  def nextInt(): Int = {
    val a = 1664525
    val b = 1013904223
    val n = 32
    //maybe use BigInt but...
    current = (current * a + b) % (math.pow(2,32).toInt)
    current
  }
  
  def nextDouble(): Double = {
    Math.abs(nextInt().toDouble/Int.MaxValue)
  }

  def setSeed(seed: Int) = {current = seed}
}

object RandomTest extends App {
  random.setSeed(2) // not needed as the seed is set either way (but to 1)
  for(i <- 0 to 20){
    println(random.nextInt())
    println(random.nextDouble())
  }
}


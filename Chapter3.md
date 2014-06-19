### 3.1

    scala> def randArray(n: Int) = for (i <- 0 until n) yield util.Random.nextInt(n)
    randArray: (n: Int)scala.collection.immutable.IndexedSeq[Int]

    scala> val a = randArray(10)
    a: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 8, 7, 0, 3, 5, 8, 6, 5, 7)
    scala> val a = randArray(10)
    a: scala.collection.immutable.IndexedSeq[Int] = Vector(9, 7, 8, 6, 4, 7, 7, 8, 7, 3)
    scala> val a = randArray(10)
    a: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 5, 6, 1, 8, 4, 4, 3, 1, 7)

### 3.2 

    def swapAdj(a: Array[Int]) = {
	    for (i <- 0 until a.length/2) { 
		    val t= a(2*i)
		    a(2*i)=a(2*i+1)
		    a(2*i+1) = t
	    }
    }

### 3.3

    swap2(a: Array[Int]) = {
	    for(i <- 0 until a.length) yield { 
		    if (i%2==0) { 
			    if (i+1<a.length) a(i+1) else a(i) 
		    } else a(i-1) 
	    }	
    }

### 3.4

    def sortPos(a: Array[Int]) = a.filter(_>0) ++ a.filter(_<=0)

### 3.5

    def avg(a: Array[Double]) = a.sum/a.length

### 3.6

With a new Array:

    def revSort(a: Array[Int]) = a.sorted.reverse

In place

    def revSortInplace(a: Array[Int]) = {
	    util.Sorting.quickSort(a)
	    for(i <- 0 until a.length/2) {
		    val t = a(i)
		    a(i) = a(a.length-1-i)
		    a(a.length-1-i)=t
	    }
    }

With an ArrayBuffer

    import scala.collection.mutable.ArrayBuffer
    def revSort(a: ArrayBuffer[Int]) = a.sorted.reverse

In place ???


### 3.7

    a.distinct

### 3.8

In place:

    def dropFromSecondNeg(a: ArrayBuffer[Int]) = { 
	    val indexes = for(i <- 0 until a.length if a(i)<0) yield i 
	    indexes.reverse.dropRight(1).map( a.remove(_))
    }

### 3.9

    java.util.TimeZone.getAvailableIDs().filter(_.startsWith("America/")).map(_.drop("America/".length)).sorted

### 3.10

    import java.awt.datatransfer._
    import collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable.Buffer
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    val imageFlavor: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)


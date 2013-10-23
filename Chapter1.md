### 1.1 ###

    scala> 3.
    %              &              *              +              -              
    /              >              >=             >>             >>>            
    ^              asInstanceOf   isInstanceOf   toByte         toChar         
    toDouble       toFloat        toInt          toLong         toShort        
    toString       unary_+        unary_-        unary_~        |              

### 1.2 ###

    scala> import scala.math._
    import scala.math._

    scala> sqrt(3)
    res0: Double = 1.7320508075688772

    scala> res0*res0
    res1: Double = 2.9999999999999996

    scala> abs(res1-3)
    res2: Double = 4.440892098500626E-16

### 1.3 ###

The res variables are "val".

    scala> res2=res2+1
    <console>:13: error: reassignment to val
           res2=res2+1
               ^

### 1.4 ###

    scala> "crazy" * 3
    res3: String = crazycrazycrazy

According to the Scaladoc at StringOps:
Return the current string concatenated n times.

### 1.5 ###

10 max 2 means 10.max(2) 

It is then defined in RichInt. 

### 1.6 ###

    scala> BigInt(2).pow(1024)
    res7: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216

### 1.7 ###

    scala> import scala.util._
    import scala.util._

    scala> import BigInt._
    import BigInt._

    scala> probablePrime(100,Random)
    res9: scala.math.BigInt = 774596969914146379970400992849

### 1.8 ###

    scala> probablePrime(100,Random).toString(36)
    res14: String = 2webxjryo4uoals5hfcj

But I would probably do:

    scala> (new Random).nextString(30)

but it does not work (only shows garbage) (UTF?)

but you can still do 

    scala> (new Random).alphanumeric take 20 mkString ""
    res43: String = BXHpWCGeGfAtbrS9cymu

### 1.9 ###

    scala> "hello"(0)
    res44: Char = h

    scala> "hello".last
    res45: Char = o

### 1.10 ###

take(n) selects the first n elements

takeRight(n) selects the last n elements

drop(n) "drops" the first n elements

dropRight(n) drops the last n elements

substring can do the same, but you might need to know the length of the string to use


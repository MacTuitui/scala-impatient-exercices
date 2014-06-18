### 2.1 ###

    scala> def signum (x: Int) = { if (x > 0) 1 else if (x < 0) -1 else 0 }
    signum: (x: Int)Int

    scala> signum(10)
    res0: Int = 1

    scala> signum(0)
    res1: Int = 0

    scala> signum(-20)
    res2: Int = -1

### 2.2 ###
    scala> val x = {}
    x: Unit = ()

So {} is of type Unit and of value ()

### 2.3 ###

    scala> var x: Unit= {}
    x: Unit = ()

    scala> var y:Int =0
    y: Int = 0

    scala> x = y = 1
    x: Unit = ()

When x is of type Unit, x=y=1 is valid as an assignment has type Unit.

### 2.4 ###

    scala> for ( i <- 10 to 0 by -1 ) println(i)

But since we do not know by at this point, I guess the answer is along:

    scala> for ( i <- 0 to 10; j = 10-i ) println(j)

### 2.5 ###

Similarly:

    scala> def countdown(n: Int) = { for (i <- 0 to n; j=n-i) println(j) }

### 2.6 ###

    def product(s: String) = { 
	    var product: Long = 1
	    for ( c <- s ) product *= c
	    product
    }

### 2.7 ### 

    s.map(_.toLong).product

I'm not sure how this works, as using map is maybe too much here?
Also, fold might work but it's the same issue.

### 2.8 ###

    def product(s: String) = s.map(_.toLong).product

### 2.9 ###

    def prodRec(s: String): Long = { 
	    if(s.length ==1) s.head.toLong 
	    else s.head.toLong * prodRec(s.tail) 
    }

Note that all functions do not deal with special strings ("") for example.

### 2.10 ###

    def pow(x: Double, n:Int): Double = { 
	    if ( n == 0 ) 1 
	    else if ( n < 0 ) 1/pow(x,-n) 
	    else if (n % 2 == 0 ) {val y=pow(x, n/2); y*y} 
	    else x * pow(x,n-1) 
    }





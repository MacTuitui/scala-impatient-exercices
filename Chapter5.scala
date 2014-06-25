// 5.1

class Counter {
    private var value = Int.MaxValue - 2
    def increment() { 
        if(value < Int.MaxValue) value += 1 
        else throw new Error("Counter exceeded limit!")
    }
    def current = value
}
val counter = new Counter
counter.increment()
println(counter.current)

// 5.2

class BankAccount {
    private var value = 0
    def deposit(amount: Int) = {
        value += amount
    }
    def withdraw(amount: Int):Boolean = {
        if(amount<=value){
            value-=amount
            true
        } else false
    }

    def balance = value
}

val account = new BankAccount()
account.deposit(100)
println(account.balance)
account.withdraw(200)
println(account.balance)
account.withdraw(20)
println(account.balance)


// 5.3

class Time(val hrs: Int, val min: Int){
    def before(other: Time) = {
        if(hrs == other.hrs) min< other.min
        else hrs<other.hrs
    }
}

val time1 = new Time(12,2)
val time2 = new Time(12,4)
val time3 = new Time(23,2)
val time4 = new Time(11,59)

println(time1.before(time2)) //should be true
println(time1.before(time3)) //should be true
println(time2.before(time3)) //should be true
println(time1.before(time4)) //should be false

// 5.4


class Time2(val min: Int){
    def this(hrs: Int, min: Int) = {
        this(hrs*60+min)
    }

    def before(other: Time2) = {
        min<other.min
    }
}

val time21 = new Time2(12,2)
val time22 = new Time2(12,4)
val time23 = new Time2(23,2)
val time24 = new Time2(11,59)

println(time21.before(time22)) //should be true
println(time21.before(time23)) //should be true
println(time22.before(time23)) //should be true
println(time21.before(time24)) //should be false

// 5.5

import scala.beans.BeanProperty

class Student(@BeanProperty var name: String, @BeanProperty var id: Long) 

//the following are generated:
//public java.lang.String name();
//public void name_$eq(java.lang.String);
//public void setName(java.lang.String);
//public long id();
//public void id_$eq(long);
//public void setId(long);
//public java.lang.String getName();
//public long getId();
//
// you can call the JavaBeans getters and setters of course, but why use Scala then?

// 5.6

class Person(var age:Int) {
    if(age<0) age=0
}

val p= new Person(-2)
println(p.age)

// 5.7

class Person2(fullName: String) {
    //I used val here as they will never change, so no need to use def
    val firstName = fullName.split(' ')(0)
    val lastName = fullName.split(' ')(1)
      //val Array(firstName, lastName) = name.split(' ')
}

val p1 = new Person2("Alexis Andre")
println(p1.firstName)
println(p1.lastName)

//I chose a plain parameter as you do not need (even private) getter/setter

// 5.8

//I would do that but I don't think that's the intent:
//class Car(val manufacturer: String, val model: String, val year: Int = -1, var license: String = "")

//so it's more like:
class Car(val manufacturer: String, val model: String, val year: Int, var license: String) {
    def this(ma: String, mo: String) ={
        this(ma,mo,-1,"")
    }
    def this(ma: String, mo: String, y: Int) = {
        this(ma,mo,y,"")
    }
    def this(ma: String, mo: String, lp: String) = {
        this(ma,mo,-1,lp)
    }
    override def toString = {
        manufacturer + " "+model + " ("+year+"), "+license
    }
}

//I'm choosing the constructor with the four as it defines everything for me once

val car0 = new Car("Toyota", "Prius")
println(car0)
val car1 = new Car("Toyota", "Prius","ASDFxx")
println(car1)
val car2 = new Car("Toyota", "Prius",1982)
println(car2)
val car3 = new Car("Toyota", "Prius",1982,"ASDFxy")
println(car3)

// 5.9

// I don't even

//Java
// class Car {
//     private String manufacturer;
//     private String model;
//     private String licensePlate;
//     private int year;
// 
//     Car(String a, String b) {
//       manufacturer=a;
//       model = b;
//       year = -1;
//       licensePlate = "";
//     }
//     Car(String a, String b, String l) {
//       manufacturer=a;
//       model = b;
//       year = -1;
//       licensePlate = l;
//     }
//     Car(String a, String b, int y) {
//       manufacturer=a;
//       model = b;
//       year = y;
//       licensePlate = "";
//     }
//     Car(String a, String b, int y, String lp) {
//       manufacturer=a;
//       model = b;
//       year = y;
//       licensePlate = lp;
//     }
// 
//     public String getManufacturer() { return manufacturer;}
//     public String getModel() { return model;}
//     public int getYear() { return year;}
//     public String getLicense() { return licensePlate;}
//     public void setLicense (String lp) { licensePlate = lp;}
//  
// }
// 

// 5.10

class Employee(val name: String ="John Q. Public", var salary: Double = 0)
//I do not get the intent
//http://stackoverflow.com/questions/10426146/constructors-in-scala-primary-auxiliary-default-primary/10999828#10999828
//

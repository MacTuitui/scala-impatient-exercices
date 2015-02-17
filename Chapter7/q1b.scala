package com
package horstmann
package impatient

//this opens all the com package
//compiles as sun is "in scope" of the com package
object Test2 extends App{
  val wfr = new sun.media.sound.WaveFileReader()

  println("works")
}
  

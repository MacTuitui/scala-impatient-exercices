package com.horstmann.impatient

// compile with scalac $file
// run with scala com.horstmann.impatient.Test
// does not compile 
// error: object media is not a member of package sun
//   val wfr = new sun.media.sound.WaveFileReader()
//
object Test extends App {
  val wfr = new sun.media.sound.WaveFileReader()
  println("Works")
}

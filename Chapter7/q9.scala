import java.lang.System._

object readP extends App {
  val name  = getProperty("user.name")
  val password = console().readPassword("Password?").mkString

  password match {
    case "secret" => {
      println("Hello, "+name)
    } 
    case _ => {
      err.println("Error")
    }
  }
}

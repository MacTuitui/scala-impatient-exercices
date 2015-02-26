import java.nio.file._
import scala.language.implicitConversions


object findClass extends App {
  implicit def makeFileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path] {
    override def visitFile(p: Path, attrs: attribute.BasicFileAttributes) = {
      f(p)
      FileVisitResult.CONTINUE
    }
  }
  println(Paths.get(args(0)).toAbsolutePath().toString)
  var count=0
  Files.walkFileTree(Paths.get(args(0)), (f:Path) => {
    val n=f.getFileName().toString
    if(n.endsWith(".class")) {
      println(f)
      count+=1
    }
  })
  //to get the count PER sub is more difficult
  println("Total files:" +count)

}

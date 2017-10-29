package Generic

object FullyFunctionalMethod {
  def main(args: Array[String]): Unit = {
    var args = Array("Hello", "World");

    def formatArgs(args: Array[String]): String = args.mkString("\n");
    
    println(formatArgs(args));

    if (formatArgs(args) == "Hello\nWorld") {
      println("it matches");
    } else {
      println("It does not match");
    }
  }
}
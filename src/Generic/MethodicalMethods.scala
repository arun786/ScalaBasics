package Generic

object MethodicalMethods {
  def main(args: Array[String]) {
    printArgs(Array("Hello", "World"));  //Hello
                                         //World
  }

  def printArgs(args: Array[String]) : Unit = {
    var i = 0;
    while (i < args.length) {
      println(args(i));
      i += 1;
    }
  }
}



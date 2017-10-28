package Generic

object FunctionalMethods {
  def main(args: Array[String]): Unit = {
    printArgs(Array("Hello", "World")); //Hello 
                                        //World
  }

  def printArgs(args: Array[String]): Unit = {
    for (arg <- args) println(arg)
  }
}
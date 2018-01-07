package ArraysDefined

object ArraysInScala {
  def main(args: Array[String]): Unit = {

    var greetings = new Array[String](3); // String[] greetings = new String[3];
    greetings(0) = "Hello" //greetings[0] = "Hello"
    greetings(1) = " , " //greetings[1] = " , "
    greetings(2) = "World" //greetings[2] = "world"

    for (i <- greetings) println(i) //In Java it will be greetings.for(i -> System.out.println(i));
  }
}
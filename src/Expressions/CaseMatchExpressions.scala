package Expressions

object CaseMatchExpressions extends App {

  matchThis("one");
  matchThis("abc");
  
  def matchThis(s: String): Unit = {
    s match {
      case "one" => println(1);
      case "two" => println(2);
      case "three" => println(3);
      case _ => println(0);
    }
  }
}
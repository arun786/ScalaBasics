package Expressions

object CaseExpressionReturningValues extends App {

  val friend = firstArg("one");
  println(friend);

  def firstArg(s: String): Int = {
    s match {
      case "one" => 1;
      case "two" => 2;
      case "three" => 3;
      case "any" => 100;
    }
  }
}
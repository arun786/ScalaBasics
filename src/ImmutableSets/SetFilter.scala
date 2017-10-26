package ImmutableSets

object SetFilter {
  def main(args: Array[String]) {
    var num1 = Set(1, 2, 3, 4, 5, 90, 10);
    println(num1); //Set(5, 10, 1, 2, 3, 4, 90)

    println(num1.filter(_ > 3)); //Set(5, 10, 4, 90)
    
    var num2 = num1.take(2);
    println(num2); //Set(5, 10)
    
    println(num1.take(3)); //Set(5, 10, 1)
  }
}
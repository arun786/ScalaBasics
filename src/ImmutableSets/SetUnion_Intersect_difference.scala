package ImmutableSets

object SetUnion {
  def main(args : Array[String]){
    
    var number1 = Set(1,2,3,4,5);
    var number2 = Set(4,5,6,7,8);
    
    println(number1.union(number2)); //Set(5, 1, 6, 2, 7, 3, 8, 4)
    
    println(number1.intersect(number2)); //Set(5, 4)
    
    println(number1.diff(number2)); //Set(1,2,3)
    
    println(number2.diff(number1));// Set(6,7,8)
    
  }
}
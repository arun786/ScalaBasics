package ImmutableSets

object SetContains {
 
  def main(args:Array[String]){
    
    val fruit = Set("Apple","Banana","Orange");
    
    println(fruit contains "Apple"); //true
    
    println(fruit("Apple")); //true
    
    println(fruit contains "Potato"); //false
    
    println(fruit("Potata")); //false
  }
}
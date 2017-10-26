package ImmutableSets

object ScalaMinusOperationsOnSets {
  def main(args : Array[String]){
    var num1 = Set(1,2,3,4);
    
    var num2 = num1 - 1;
    println(num2); //Set(2,3,4)
    println(num1) //Set(1,2,3,4)
    
    var num3 = num2 -- List(2,3)
    println(num3); //Set(4)
    
    var num4 = num3 - 4;
    println(num4); //Set()
    
    var num5 = num4 - 6;
    println(num5); //Set()
    
    var num6 = Set("A","B",1,3, true);
    var num7 = num6 - "A";
    
    println(num7);//Set(1, true, B, 3)
    
    var num8 = num7 - "a";
    println(num8);//Set(1, true, B, 3)
    
  }
}
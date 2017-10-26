package ImmutableSets

object ScalaOperationsonSets {
  def main(args : Array[String]){
    
    var s1 = Set(1,2,3);
    println(s1); //Set(1,2,3)
    
    var s2 = s1 + 4;
    println(s2); //Set(1,2,3,4)
    
    var s3 = s2 ++ List(5,6);
    println(s3); //Set(5, 1, 6, 2, 3, 4)
  }
}
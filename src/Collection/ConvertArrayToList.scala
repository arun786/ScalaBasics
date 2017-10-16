package Collection

object ConvertArrayToList {
  def main(args : Array[String]){
    var arrayAbc = Array(1,2,3)
    var lstAbc = arrayAbc.toList
    
    
    println("list "+lstAbc);
    
    for( i <- 0  to 2)
    println("Array " + arrayAbc(i));
    
    arrayAbc.update(1, 10);
    
    println("List " +  lstAbc);
    println("Array " + lstAbc);
  }
}
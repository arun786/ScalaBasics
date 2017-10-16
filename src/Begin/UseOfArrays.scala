package Begin

object UseOfArrays {
  def main(args : Array[String]){
    val gc = new Array[String](3);
    gc(0) = "Hello"
    gc(1) = ","
    gc(2) = "world"
    
    for(i<- 0  to 2 )
      print(gc(i))
  }
}
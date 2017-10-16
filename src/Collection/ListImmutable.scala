package Collection

object ListImmutable {
  def main(args : Array[String]){
    val _12 = List.apply(1,2)
    val _34 = List.apply(3,4)
    
    val _1234 = _12 ::: _34 //concatenate
    
    println(_1234)
    println(_12)
    println(_34)
    
    val _12345 = _12.:::(_34)
    println(_12345)
  }
}
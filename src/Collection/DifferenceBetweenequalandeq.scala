package Collection

object DifferenceBetweenequalandeq {
  def main(args : Array[String]){
    var _12 = List(1,2)
    var _123 = 1 :: _12 //1, 1, 2
    var _123Another = 1 :: _12 //1, 1, 2
    
    println(_123 == _123Another) //equivalent to equals in java, true
    println(_123.eq(_123Another)) //it will check the memory, false
    
    println(_123.tail == _123Another.tail) //this will be true as the value in both are 1,2
    
    println(_123.tail.eq(_123Another.tail)) //this will be true
  }
}
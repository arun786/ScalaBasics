package Collection

object TupleTypes {
  def main(args : Array[String]){
    var _tup2 : Tuple2[String,Int] = ("Hello",1)
    var _tup1 = Tuple1(1)
    println(_tup1)
    
    var _tup3 = Tuple1("Hello")
    
    var _tup4 : Tuple4[Char,Char,Char,Char] = ('a','b','c','d')
    println(_tup4)
    
  
  }
}
package Collection

object ToCreateList {
  def main(args : Array[String]){
    var abc = List(1,2,3)
    println(abc)
    
    var abcd = List.apply(1,2,3)
    println(abcd)
    
    var abcde = 1 :: 2 :: 3 :: Nil
    println(abcde)
  }
}
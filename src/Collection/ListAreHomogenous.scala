package Collection

object ListAreHomogenous {
  def main(args : Array[String]){
    println(1 :: Nil);  //lst: List[Int] = List(1)
    println(true :: 1 :: Nil) //List[AnyVal] = List(true, 1)
    println("hello" :: true :: 1 :: Nil) //List[Any] = List(Hello, true, 1)
    
    /*Any 
    AnyVal
    Int */
    
    /*which means List are homogenous in type*/
  }
}
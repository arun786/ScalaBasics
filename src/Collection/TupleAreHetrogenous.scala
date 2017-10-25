package Collection

object TupleAreHetrogenous {
  def main(args : Array[String]){
    
   var myTup = ("hello", true, 1)
    println(myTup._1) //Tuple starts with index 1
    if(myTup._2){
      println("Value is true")
    }
   println(myTup) //on REPL it will give the output as myTup: (String, Boolean, Int) = (hello,true,1)
  }
}
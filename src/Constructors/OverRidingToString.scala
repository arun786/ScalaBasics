package Constructors

object OverRidingToString extends App{
  
  println(new Games(10,10)); //10 : 10
}

class Games(a : Int, b : Int){
  override def toString() : String = a + " : " +  b;  
}
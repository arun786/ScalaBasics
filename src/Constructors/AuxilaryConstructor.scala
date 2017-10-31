package Constructors

object AuxilaryConstructor {

  def main(args : Array[String]){
    println(new Div(23));  //o/p will be 23/1
  }
}

class Div(n : Int, d : Int){
  
  require(d != 0, "Denominator cannot be Zero");
  
  override def toString : String = n + "/" + d;
  
  def this(num : Int) = this (num,1);
  
}
package Constructors

import java.util.Scanner

object PreCondition {
  
  def main(args : Array[String]){
    var scan = new Scanner(System.in);
    var a = scan.nextInt();
    var b = scan.nextInt();
    
    var div = new Division(a,b);
    
  }
}

class Division(a : Int, b : Int){
  
  require(b != 0 , "Second number cannot be Zero");
  println(a/b);
}
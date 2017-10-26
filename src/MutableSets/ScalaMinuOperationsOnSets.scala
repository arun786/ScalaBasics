package MutableSets

import scala.collection.mutable.Set
import scala.collection.immutable.Set

object ScalaMinuOperationsOnSets {
  def main(args : Array[String]){
    var num1 = scala.collection.mutable.Set(1,2,3,4);
    println(num1);
    
    num1 -= 1;
    println(num1); //Set(2,3,4);
    
    num1 --= List(2,3);
    println(num1); //Set(4)
    
    var num2 = scala.collection.immutable.Set(1,2,3);
    num2 -= 1;
    println(num2);//Set(2, 3)
  }
}
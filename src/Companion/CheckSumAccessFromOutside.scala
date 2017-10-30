package Companion

object CheckSumAccessFromOutside {
  def main(args : Array[String]){
    
    var num = CheckSumCalculator.calculate("arun");
    println(num);
    
    var num1 = CheckSumCalculator.calculate("arun");
    println(num1);
  }
}
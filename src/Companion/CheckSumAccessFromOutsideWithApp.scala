package Companion

object CheckSumAccessFromOutsideWithApp extends App {

  var csc = CheckSumCalculator.calculate("arun");
  println(csc); //-182
  
  var csc1 = CheckSumCalculator.calculate("arun");
  println(csc1); //Inside Cache -182
}
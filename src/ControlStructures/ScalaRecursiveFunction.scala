package ControlStructures

object ScalaRecursiveFunction extends App {

  var sc = new ScalaRecursive;
  println(sc.factorial(5));
  
}

class ScalaRecursive {
  def factorial(x: Int): Int = {
    if (x == 1)
      x
    else {
      factorial(x - 1) * x;
    }
  }
}
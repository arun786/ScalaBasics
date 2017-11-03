package ControlStructures

object GCDREcursion extends App {

  println(GCD(16,8)); //8
  println(GCD(18,8)); //2
  
  def GCD(x: Int, y: Int): Int = {
    if (y == 0)
      return x;

    GCD(y, x % y);
  }

}
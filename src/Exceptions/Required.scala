package Exceptions

object Required extends App {

  def half(num: Int): Int = {
    require(num % 2 == 0, "Even required");
    num / 2;
  }
  
  half(4);
  half(5);
}
package Constructors

object OverloadedMethods extends App {

  var onethird = new Divi(1, 3);
  var oneninth = new Divi(1, 9);
  println(onethird + oneninth); //12/27

  println(onethird + 5); //16/3
}

class Divi(var num: Int, var den: Int) {

  require(den != 0, "Denominator cannot be zero");

  override def toString: String = num + "/" + den;

  def +(that: Divi): Divi = {
    new Divi(num * that.den + den * that.num, den * that.den);
  }

  def +(number: Int): Divi = {
    new Divi(num + number * den, den);
  }

}
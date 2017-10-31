package Constructors

object DefiningObjects {

  def main(args: Array[String]) {
    var onehalf = new Divides(1, 2);
    var oneNinth = new Divides(1, 9);

    var result = onehalf + oneNinth;
    println(result); //11/18
  }

}

class Divides(var num: Int, var den: Int) {

  require(den != 0, "Denominator cannot be zero");

  override def toString: String = num + "/" + den;

  def +(that: Divides): Divides = {
    new Divides(num * that.den + den * that.num, den * that.den);
  }
}
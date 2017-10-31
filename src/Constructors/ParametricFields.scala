package Constructors

import java.util.Scanner

object ParametricFields extends App {

  println("Enter the first numerator");
  var num = new Scanner(System.in).nextInt();
  println("Enter the first denominator");
  var den = new Scanner(System.in).nextInt();

  var first = new Divisions(num, den);

  println("Enter the Second numerator");
  num = new Scanner(System.in).nextInt();
  println("Enter the Second denominator");
  den = new Scanner(System.in).nextInt();

  var second = new Divisions(num, den);

  var result = first.add(second);
  println(result);

}

class Divisions(val n: Int, val d: Int) {
  require(d != 0, "Denominator cannot be zero");

  override def toString: String = n + "/" + d;

  def add(that: Divisions): Divisions = {
    new Divisions(n * that.d + d * that.n, d * that.d);
  }
}
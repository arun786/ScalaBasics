package Constructors

import java.util.Scanner

object AddingFieldsViaConstructor extends App {

  println("Enter the first numerator");
  var firstnum = new Scanner(System.in);
  var num = firstnum.nextInt();
  println("Enter the first Denominator");
  var firstdenom = new Scanner(System.in);
  var den = firstdenom.nextInt();

  var first = new Divide(num, den);

  println("Enter the Second numerator");
  firstnum = new Scanner(System.in);
  num = firstnum.nextInt();
  println("Enter the Second Denominator");
  firstdenom = new Scanner(System.in);
  den = firstdenom.nextInt();

  var second = new Divide(num, den);
  var result = first.add(second);
  println(result);

}

class Divide(n: Int, d: Int) {
  require(d != 0, "d cannot be zero");

  override def toString: String = n + "/" + d;

  var numer: Int = n;
  var denom: Int = d;

  def add(that: Divide): Divide = {
    new Divide(numer * that.denom + denom * that.numer, denom * that.denom);
  }
}
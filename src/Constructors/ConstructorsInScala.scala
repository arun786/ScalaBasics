package Constructors

object ConstructorsInScala extends App {

  var rat = new Rational(10, 20);
  rat.checktheValues();
}

class Rational(a: Int, b: Int) {

  println(a + " : " + b);  //10 : 20
  
  def checktheValues() {
    println(a + " : " + b); //10 : 20
  }
}
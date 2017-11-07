package Functions

object PassingFunctionsAsParameters extends App {

  var lstNum = List(1, 2, 3, 4, 5, 6);
  lstNum.foreach((x: Int) => println(x));

}
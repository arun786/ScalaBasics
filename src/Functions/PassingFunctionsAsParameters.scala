package Functions

object PassingFunctionsAsParameters extends App {

  var lstNum = List(1, 2, 3, 4, 5, 6);
  lstNum.foreach((x: Int) => print(x + " ")); //1 2 3 4 5 6
  
  println();
  lstNum.foreach(x => print(x + " ")); // 1 2 3 4 5 6
  
  println();
  lstNum.filter(x => x > 1).foreach(u => print(u + " ")); //2 3 4 5 6
  
  println();
  lstNum.filter(_ > 2).foreach(u => print(u + " ")); // 3 4 5 6
  
  println();
  var sum = (x : Int, y : Int) => x + y;
  println(sum(10,20));
  
  var diff = (_ : Int) - (_ :Int);
  println(diff(20,10));
  
}
package Functions

object AnonymousFunction extends App{
  
  
  //Anonymous Function, here we are assigning functions to a variable
  var sum = (x : Int) => {
    x + 10;
  }
  
  println(sum(10));
  
  def diff(x : Int) : Int = {
    x - 10;
  }
  
  println(diff(10));
}
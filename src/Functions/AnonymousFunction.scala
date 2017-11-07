package Functions

object AnonymousFunction extends App{
  
  
  //Anonymous Function
  var sum = (x : Int) => {
    x + 10;
  }
  
  println(sum(10));
  
  def diff(x : Int) : Int = {
    x - 10;
  }
  
  println(diff(10));
}
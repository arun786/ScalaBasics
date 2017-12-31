package Function

object DefiningAFunction {

  def main(args: Array[String]): Unit = {
    max(10,12)
    println(f(10));
  }

  def max(x: Int, y: Int) = {
    if (x > y)
      println(x)
    else
      println(y)
  }
  
  def f(x : Int) : Int = x + 1
}
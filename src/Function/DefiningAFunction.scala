package Function

object DefiningAFunction {

  def main(args: Array[String]): Unit = {
    max(10,12)
  }

  def max(x: Int, y: Int) = {
    if (x > y)
      println(x)
    else
      println(y)
  }
}
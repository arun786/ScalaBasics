package Methods

object PrivateMethods extends App {
  println(AccessPrivateMethods.callPrivateMethod(10, 20));
}

object AccessPrivateMethods {
  def callPrivateMethod(num1: Int, num2: Int): Int = {
    multiplyTwoNumbers(num1, num2);
  }

  private def multiplyTwoNumbers(num1: Int, num2: Int): Int = {
    num1 * num2;
  }
}
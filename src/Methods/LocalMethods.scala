package Methods

object LocalMethods extends App {

  println(LocalMethodsDefined.callPrivateMethod(20, 30));

}

object LocalMethodsDefined {

  def callPrivateMethod(num1: Int, num2: Int): Int = {

    def multiplyTwoNumbers(num1: Int, num2: Int): Int = {
      num1 * num2;
    }
    multiplyTwoNumbers(num1, num2);
  }

}
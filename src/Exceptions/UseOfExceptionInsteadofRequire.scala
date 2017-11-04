package Exceptions

object UseOfExceptionInsteadofRequire extends App {

  def Third(n: Int): Int = {
    if (n % 2 == 0)
      n / 2
    else
      throw new IllegalArgumentException("Even Required");
  }

  println(Third(2));
  println(Third(5));
}
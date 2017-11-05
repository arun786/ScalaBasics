package ControlStructures

object FibonnaciSeries extends App {

  def fn(num: Int): Array[Integer] = {

    var fbs = new Array[Integer](num);

    var fb = for (i <- 0 until num) yield {
      if (i <= 2) {
        fbs(i) = i;
      } else {
        fbs(i) = fbs(i - 1) + fbs(i - 2);
      }

    }
    fbs;
  }

  println(fn(6)(5)); //8
}
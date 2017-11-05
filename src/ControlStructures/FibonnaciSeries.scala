package ControlStructures

import java.math.BigInteger

object FibonnaciSeries extends App {

  def fn(num: Int): Array[BigInteger] = {

    var fbs = new Array[BigInteger](num);

    var fb = for (i <- 0 until num) yield {
      if (i <= 2) {
        fbs(i) = BigInteger.valueOf(i);
      } else {
        fbs(i) = fbs(i - 1).add(fbs(i - 2));
      }

    }
    fbs;
  }

  println(fn(50)(49)); //12586269025
}
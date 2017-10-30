package Companion

import scala.collection.mutable;

class CheckSumCalculator {
  private var sum = 0;
  def sum(a: Byte): Unit = {
    sum += a;
  }

  def checkSum(): Int = {
    ~(sum & 0xFF) + 1;
  }
}

object CheckSumCalculator {

  private val cache = mutable.Map[String, Int]();

  def calculate(s: String): Int = {
    if (cache.contains(s)) {
      println("Inside cache");
      cache(s);
    } else {
      var csc = new CheckSumCalculator;
      for (c <- s) {
        csc.sum(c.toByte);
      }
      var value = csc.checkSum();
      cache.put(s, value);
      value;
    }
  }
}
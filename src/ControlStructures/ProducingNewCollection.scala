package ControlStructures

object ProducingNewCollection extends App {

  val x = for (i <- 1 to 10) yield {
    println("Calculating multiple of i : " + i * i);
    i;
  }

  println(x);

  /*  Calculating multiple of i : 1
Calculating multiple of i : 4
Calculating multiple of i : 9
Calculating multiple of i : 16
Calculating multiple of i : 25
Calculating multiple of i : 36
Calculating multiple of i : 49
Calculating multiple of i : 64
Calculating multiple of i : 81
Calculating multiple of i : 100
Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)*/

}
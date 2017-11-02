package ControlStructures

import java.util.Scanner

object GCD {
  def main(args: Array[String]) {
    var scan = new Scanner(System.in);
    println("Enter the first number");
    var x = scan.nextInt();
    println("Enter the Second number");
    var y = scan.nextInt();

    do {
      var temp = x;
      x = y % x;
      y = temp
    } while (x != 0)

    println("GCD is " + y);
  }
}
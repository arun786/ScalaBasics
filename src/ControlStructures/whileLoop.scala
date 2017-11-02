package ControlStructures

import java.util.Scanner

object whileLoop extends App {

  println("Enter the first number");
  var scan = new Scanner(System.in);
  var x = scan.nextInt();
  println("Enter the Second number");
  scan = new Scanner(System.in);
  var y = scan.nextInt();

  while (x != 0) {
    val temp = x;
    x = y % x;
    y = temp;
  }

  println("GCD for the entered number " + y);
}
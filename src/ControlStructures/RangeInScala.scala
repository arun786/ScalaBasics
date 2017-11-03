package ControlStructures

object RangeInScala extends App {

  for (i <- 1 to 20 by 4) print(i + " "); //1 5 9 13 17 
  println();
  for (i <- 1 to 4) print(i * i + " ");//1 4 9 16 
  println();
  for(i <- 20 to 1 by -2) print(i+ " ");//20 18 16 14 12 10 8 6 4 2
  println();
  for ( i <- 1 until 4) print(i + " "); // 1 2 3
  
}
package ControlStructures

import java.io.File

object ForLoopFilters extends App {

  var number = Array(1, 2, 3, 4, 5, 6);

  for (num <- number if (num > 3)) print(num + " "); //4 5 6

  for (num <- number if (num > 3) if (num < 6)) println(num + ""); //5
  println();
  var files = new File(".").listFiles();

  for (file <- files if (file.getName.endsWith(".iml")))
    println(file);

}
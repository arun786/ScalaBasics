package ControlStructures

import java.io.File
import scala.io.Source

object NestedIteration extends App {

  val filesHere = new File("./src/ControlStructures").listFiles();
  def fileLines(file: File) = Source.fromFile(file).getLines().toList;
  for (
    file <- filesHere if (file.getName.endsWith(".scala"));
    line <- fileLines(file)
  ) println(line);

  /*This program will list all the files from the directory ./src/ControlStructures
  Iterate using for loop
  filter out the files which ends with .scala
  and display the contents line by line*/
}
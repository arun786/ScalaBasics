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
}
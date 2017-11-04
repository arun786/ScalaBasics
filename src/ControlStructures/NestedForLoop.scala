package ControlStructures

import java.io.File
import scala.io.Source

object NestedForLoop extends App {

  /*Requirement :

  List all the files from a particular Package
  filter out files starting with N
  find a pattern such as lines which has number in it*/

  var listFiles = new File("./src/ControlStructures/").listFiles(); //This will list all the files in that directory

  def findFiles(file: File) = Source.fromFile(file).getLines().toList; //Function will take file as an input and get all the lines and convert it into list

  def grep(pattern: String): Array[String] = for (
    file <- listFiles if (file.getName.endsWith(".scala"));
    lines <- findFiles(file) if (lines.trim().matches(pattern))
  ) yield lines

  grep(".*convert.*").foreach(println);

}
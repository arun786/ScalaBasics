package ControlStructures

import java.io.File
import scala.io.Source

object TransformingAnArrayFiletoArrayInt extends App {

  /*Requirement :

  Get list of files from a particalar path
  from each file count the number of words that has been repeated*/

  var listOfFiles = new File("./src/ControlStructures").listFiles();

  def findLine(file: File) = Source.fromFile(file).getLines().toList;

  def grep(pattern: String) = for {
    file <- listOfFiles
    if (file.getName.endsWith(".scala"))
    lines <- findLine(file)
    if (lines.trim().matches(pattern))
  } yield lines

  var line = grep(".*get.*");
  line.foreach(println);
  
  println(line.length);
}
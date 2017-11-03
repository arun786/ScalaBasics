package ControlStructures

import java.io.File

object ForLoopReadingFiles extends App {

  val filesHere = new File("./src/ControlStructures").listFiles();

  for (file <- filesHere) println(file); //Name of all the files along with the path
  
  val fileNames = for(file <- filesHere) yield file.getName;
  println(fileNames); //this will give reference of the object
}
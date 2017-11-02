package ControlStructures

object IfStatement extends App{
  
  val nameOfPerson = if(!args.isEmpty) args(0) else "Please pass an argument";
  println(nameOfPerson);
  
}
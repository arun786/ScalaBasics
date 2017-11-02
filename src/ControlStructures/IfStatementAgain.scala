package ControlStructures

object IfStatementAgain extends App {
  //to understand Git Rebase, the same code commit done.
  val nameOfPerson = if (!args.isEmpty) args(0) else "Please pass an argument";
  println(nameOfPerson);
}
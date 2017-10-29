package ClassesAndObjects

import scala.collection.mutable.ListBuffer

class ClassWithDemoOnList {
  val fruits = new ListBuffer[String];
  
  def getNameOfFruitBasedOnIndex(args: Int): String = {
    try{
    setNameOfFruits()(args);
    }catch{
      case ex : IndexOutOfBoundsException => {
        "please enter a valid Index between 0 and 3"
      }
    }
  }

  def setNameOfFruits(): List[String] = {
    fruits += "Orange";
    fruits += "Apple";
    fruits += "Banana";
    fruits += "Grapes";

    val lstFruits = fruits.toList;
    return lstFruits;
  }
}
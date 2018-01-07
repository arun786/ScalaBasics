package ArraysDefined

import scala.collection.mutable.ArrayBuffer

object MuttableScalaArrays {
  def main(args: Array[String]): Unit = {
    var fruits = ArrayBuffer[String]();
    fruits += "Apple"
    fruits += "Banana"
    fruits += "Oranges"

    for (fruit <- fruits) println(fruit)
    
    var fruitArray = fruits.toArray //To Array method will convert ArrayBuffer to Array
    for(fruit <- fruitArray) println(fruit)
  }
}
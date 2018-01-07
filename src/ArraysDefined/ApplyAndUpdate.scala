package ArraysDefined

object ApplyAndUpdate {
  def main(args: Array[String]) {
    var fruits = new Array[String](3)
    fruits(0) = "Orange"
    fruits(1) = "Apple"
    fruits(2) = "Banana"

    println(fruits.apply(0)) //o/p will be Orange
    println(fruits(0)) //o/p will be Orange
    
    //If you want to update
    
    fruits.update(1, "PineApple")
    println(fruits.apply(1))
    
    fruits(2) = "Avocado"
    println(fruits.apply(2))

  }
}
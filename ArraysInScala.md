# Parameterize Arrays With Types

## First way
	 	var greetings = new Array[String](3); // String[] greetings = new String[3];
	   greetings(0) = "Hello" //greetings[0] = "Hello"
	   greetings(1) = " , " //greetings[1] = " , "
	   greetings(2) = "World" //greetings[2] = "world"

    	for (i <- greetings) println(i) //In Java it will be greetings.for(i -> System.out.println(i));
## Second way

		val fruits = Array("Apple", "Banana", "Orange")
		for(fruit <- fruits) println(fruit)

## Mutable Array - ArrayBuffer

		Mutable Array String are arrays which can grow in size.

		object MuttableScalaArrays {
		  def main(args: Array[String]): Unit = {
		    var fruits = ArrayBuffer[String]();
		    fruits += "Apple"
		    fruits += "Banana"
		    fruits += "Oranges"
		
		    for (fruit <- fruits) println(fruit)
		  }
		}
		
		var fruitArray = fruits.toArray //To Array method will convert ArrayBuffer to Array
    	for(fruit <- fruitArray) println(fruit)
    	
### Adding element to an Array is not possible, for that we require ArrayBuffer

### Apply and Update meaning in Scala

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
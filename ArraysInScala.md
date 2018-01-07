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
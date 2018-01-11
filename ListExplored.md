# List in Scala

List are Immutable in scala, values of List cannot be changed by Assignment, Lists are internally Linked List

## Defining a List in Scala

		val fruits = "Apple" :: ("Orange" :: ("Banana" :: Nil))
		println("Fruits : " + fruits)
		println("In Reverse Order : " + fruits.reverse)
		
		/**
		 * Methods in List
		 */
		
		/**
		 * head returns only the first element in the List
		 */
		println("head : " + fruits.head)
		/**
		 * Tail returns all the elements except the first element
		 */
		println("tail : " + fruits.tail)
		/**
		 * isEmpty returns whether the list is empty or not
		 */
		println("Whether empty or Not : " + fruits.isEmpty)
		
		/**
		 * fill method creates a list containing zero or more copies of the same element
		 */
		val colors = List.fill(3)("Orange")
		println(colors)
		
		/**
		 * tabulate method creates 5 elements based on the given function
		 */
		val squares = List.tabulate(6)(n => n * n)
		/**
		 * It will print out List(0, 1, 4, 9, 16, 25)
		 */
		println(squares)
		
		val cubes = List.tabulate(6)(n => n * n * n)
		println(cubes)

## Concatinate and Cons

	val oneTwo = List(1, 2)
    val threeFour = List(3, 4)

    val oneTwothreeFour = oneTwo ::: threeFour
    println(oneTwothreeFour) //o/p will be List(1,2,3,4)
    println(oneTwo) //o/p will be List(1,2)
    println(threeFour) //o/p will be List(3,4)

    val newthreeFour = 1 :: threeFour //cons 
    println(newthreeFour) //o/p will be List(1,3,4)

    //val oneThreeFour = (1).::threeFour //This wont compile
    val oneThreeFour = threeFour.::(1) 
    println(oneThreeFour) //o/p will be 1,3,4

## Convert Array to List and Vice Versa


	object ConversionOfArrayToListAndViceVersa {
		def main(args: Array[String]): Unit = {
		val lst = List(1, 2, 3)
		println(lst)
		
		/**
		 * we can convert List to an Array
		 */
		val arry = lst.toArray
		for (a <- arry) print(a + " ")
		
		/**
		 * Convert Array to List
		 */
		
		val newLst = arry.toList
		for (a <- newLst) print(a + " ")
		  }
		}
		    
    
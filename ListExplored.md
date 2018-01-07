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
	
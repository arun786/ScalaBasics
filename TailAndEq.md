# Tail and Eq 

	List can have a tail which includes all the elements except the first
	
	== means the values are checked 
	eq means the reference is checked

	val oneTwo = List(1, 2)
	val twoThree = List(3, 4)
	
	val zeroTwoThree = oneTwo.::(0)
	val fourTwoThree = oneTwo.::(4)
	val anotherZeroTwoThree = oneTwo.::(0)
	
	println(zeroTwoThree == fourTwoThree) //o/p will be false
	
	println(zeroTwoThree == anotherZeroTwoThree) //o/p will be true, == means the values are checked
	println(zeroTwoThree.eq(anotherZeroTwoThree)) //o/p will be false, as the objects are different
	println(zeroTwoThree.tail == fourTwoThree.tail) //o/p will be true, as the values are same for the tail
	println(zeroTwoThree.tail eq anotherZeroTwoThree.tail) //o/p will be true, as the objects are same
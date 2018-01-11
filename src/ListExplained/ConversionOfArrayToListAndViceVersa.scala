package ListExplained

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
    println("---------------")
    val newList = List(1, 2, 3, 4, 5, 1, 3)
    for (a <- newList) print(a + " ")

    println()
    /**
     * Converting List to an Array, removes Duplicate
     */
    val newSet = newList.toSet
    for (a <- newSet) print(a + " ")
  }
}
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
  }
}
package ListExplained

object ListsAreImmutable {

  /**
   * ::: is used for Concat and :: cons
   */
  def main(args: Array[String]): Unit = {

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)

    val oneTwothreeFour = oneTwo ::: threeFour
    println(oneTwothreeFour)
    println(oneTwo) //the value does not change
    println(threeFour) //the value does not change

    val newthreeFour = 1 :: threeFour
    println(newthreeFour)

    //val oneThreeFour = (1).::threeFour //This wont compile
    val oneThreeFour = threeFour.::(1)
    println(oneThreeFour)
  }
}

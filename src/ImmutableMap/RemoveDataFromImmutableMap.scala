package ImmutableMap

object RemoveDataFromImmutableMap {
  def main(args: Array[String]) {
    var number = Map.empty[Int, String];
    number += (1 -> "One");
    number += (2 -> "Two");

    println(number); //Map(1 -> One, 2 -> Two)

    number -= (1);
    println(number); //Map(2 -> Two)

    var number1 = Map.empty[Int, Int]
    number1 += (1 -> 1);
    number1 += (2 -> 1);
    println(number1); //Map(1 -> 1, 2 -> 1)
    number1 -= 1;
    println(number1); //Map(2 -> 1)

  }
}
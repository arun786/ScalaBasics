package ImmutableMap

object InitializingImmutableMap {
  def main(args: Array[String]) {
    var states = Map.empty[Int, String];
    states += (1 -> "one");
    states += (2 -> "two");
    states += (3 -> "three");

    println(states); //Map(1 -> one, 2 -> two, 3 -> three)
    println(states.get(1)); //Some(one)
    println(states.get(2)); //Some(two)
    println(states(3)); //three
    println(states.apply(1)); //one

  }
}
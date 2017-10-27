package ImmutableMap

object AddDataToImmutableMap {
  def main(args: Array[String]) {
    var color = Map.empty[Int, String];
    color += (1 -> "Red");
    color += (2 -> "Yellow");
    color += (3 -> "Blue", 4 -> "White")

    println(color); //Map(1 -> Red, 2 -> Yellow, 3 -> Blue, 4 -> White)

    color += (1 -> "Green")

    println(color); //Map(1 -> Green, 2 -> Yellow, 3 -> Blue, 4 -> White)

    //color(1) = "Brown" //reassigning is not allowed

  }
}
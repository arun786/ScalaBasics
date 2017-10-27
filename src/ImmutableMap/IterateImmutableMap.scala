package ImmutableMap

object IterateImmutableMap {
  def main(args: Array[String]) {
    var number = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
    for ((k, v) <- number) {
      println(k + " : " + v);
    }
  }
}

//1 : One
//2 : Two
//3 : Three
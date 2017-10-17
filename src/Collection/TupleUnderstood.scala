package Collection

object TupleUnderstood {

  def main(args: Array[String]) {
    var _tup = ("hello", true, 1)
    println(_tup)
    println(_tup._1)
    println(_tup._2)
    println(_tup._3)

    if (_tup._2)
      println("It's a boolean")

    val abc = _tup
    println(abc)

  }

}
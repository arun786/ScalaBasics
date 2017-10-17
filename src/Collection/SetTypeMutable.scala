package Collection

import scala.collection.mutable.Set

object SetTypeMutable {
  def main(args: Array[String]) {
    val _set = Set(1, 2, 3, "abc")
    println(_set)

    _set.addString(new StringBuilder("def"))
    println(_set)

   /* o / p will be

    Set(1, 2, abc, 3)
    Set(1, 2, abc, 3)*/

  }
}
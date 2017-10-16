package Collection

object ConvertListToArray {
  def main(args: Array[String]) {
    var lstNum = List(1,2,3)
    var arrayNum = lstNum.toArray
    
    println(arrayNum.apply(1))
    arrayNum.update(1, 12)
    println(arrayNum.apply(1))
  }
}
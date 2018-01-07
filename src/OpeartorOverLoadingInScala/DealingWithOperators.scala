package OpeartorOverLoadingInScala

object DealingWithOperators {
  def main(args: Array[String]): Unit = {
    var a = 3.0
    var b = 4.0

    println(a + b)
    println(a.+(b))
    
    println(3.-(2))
    
    println("hello".charAt(0))
    println("hello" charAt 0)
  }
}
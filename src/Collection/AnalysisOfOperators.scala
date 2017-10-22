package Collection

object AnalysisOfOperators {
  def main(args: Array[String]) {
        var sum = 2.0 + 3.0
        println(sum) //5.0
        
        var sameSum = 2.0.+(3.0)
        println(sameSum) //5.0
        
        var strHello = "Hello";
        println(strHello.charAt(1)) //e
        
        println(strHello charAt 1) //e
  }
}
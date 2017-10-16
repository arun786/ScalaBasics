package Collection

object WaysOfDefinignArray {
  def main(args : Array[String]){
    var nM = Array("one","two","three")
    println(nM.apply(0));
    
    var _nam = Array.apply("one","two","three");
    print(_nam.apply(2));
  }
}
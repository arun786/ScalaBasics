package Collection

object CreatingArray {
  def main(args : Array[String]){
    var nM = Array("one","two","three")
    println(nM.apply(0)); //one
    
    var _nam = Array.apply("one","two","three");
    println(_nam.apply(2)); //three
    
    _nam(1) = "Four"
    println(_nam(1)) //Four
    
    println(_nam.apply(1)) //Four
    
    _nam.update(1, "Five");
    
    println(_nam(1)) //Five
    
    println(_nam.apply(1)) //Five
    
    
    
    
  }
}
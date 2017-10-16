package MethodCall

object UseOfArrays {
  
  def main(args : Array[String]){
    var gc = new Array[String](3)
    
    gc.update(0, "Hello") //gc(0) = "Hello"
    gc.update(1, " , ")
    gc.update(2," World")
    
    print(gc.apply((0))) //gc(0)
    
    
    print(1.0.+(3.0)) //result will be same as 1.0 +  3.0
  }
}
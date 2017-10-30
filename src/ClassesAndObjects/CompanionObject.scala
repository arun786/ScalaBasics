package ClassesAndObjects

object CompanionObject {
  def main(args : Array[String]){
    var co = new CompanionObject;
    co.printHelloWorld();
  }
}

class CompanionObject{
  def printHelloWorld(){
    println("Hello World");
  }
}
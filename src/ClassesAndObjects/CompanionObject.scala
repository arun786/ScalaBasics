package ClassesAndObjects

object CompanionObject {

  private var s1 = "abc";
  def main(args: Array[String]) {
    var co = new CompanionObject;
    co.printHelloWorld();
    println(co.s); //accessing the private variable of the class via an Object possible 
  }  
}

class CompanionObject {

  private var s = "srini";

  def printHelloWorld() {
    println(CompanionObject.s1); //accessing the private variable of object, possible
    println("Hello World");
  }
}


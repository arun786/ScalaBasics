package ClassesAndObjects

object FirstClassObject {
  def main(args : Array[String]){
    var fc = new FirstClass();
    var number = fc.incrementNumber10TimesBasedOnInput(12);
    println(number);
  }
}
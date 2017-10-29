package ClassesAndObjects

object ClassWithDemoOnListObject {
  def main(args : Array[String]){
    var classWithDemoOnList = new ClassWithDemoOnList();
    println(classWithDemoOnList.getNameOfFruitBasedOnIndex(5));
    println(classWithDemoOnList.getNameOfFruitBasedOnIndex(1));
  }
}
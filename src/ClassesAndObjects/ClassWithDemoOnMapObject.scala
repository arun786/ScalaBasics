package ClassesAndObjects

object ClassWithDemoOnMapObject {
  def main(args: Array[String]) {
    var colorHex = new ClassWithDemoOnMap();
    var red = colorHex.getColorInHexCode("red");
    println(red);
    println(colorHex.getColorInHexCode("fre"));
  }
}
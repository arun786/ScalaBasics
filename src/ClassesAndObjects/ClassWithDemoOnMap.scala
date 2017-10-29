package ClassesAndObjects

class ClassWithDemoOnMap {
  var color = Map.empty[String, String];

  def getColorInHexCode(arg: String): String = {
      setColorInHexCode();
      try{
      color(arg);
      }catch{
        case ex : NoSuchElementException =>{
          "Enter a valid key";
        }
      }
  }

  def setColorInHexCode() {
    color += ("red" -> "#FF0000");
    color += ("blue" -> "#0000FF");
    color += ("lime" -> "#00FF00");
  }
}
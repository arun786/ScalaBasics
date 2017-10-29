package Generic

import scala.io.Source

object ReadingAFile {
  def main(args: Array[String]): Unit = {

    var path = System.getProperty("user.dir");

    path += "\\src\\Generic\\";
    path += args(0);
    println(path);

    if (args.length > 0) {
      for (line <- Source.fromFile(path).getLines()) {
        println(line);
      }
    }
  }
}
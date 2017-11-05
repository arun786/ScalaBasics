package Expressions

object MultiplicationTable extends App {

  multiplicationTable;

  def multiplicationTable() {
    var i = 1;
    while (i <= 10) {
      var k = 1;
      while (k <= 10) {
        var prod = (i * k).toString();
        var j = prod.length();
        while (j < 4) {
          print(" ");
          j += 1;
        }
        print(prod);
        k += 1;
      }
      i += 1;
      println();
    }

  }
}
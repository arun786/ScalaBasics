package ClassesAndObjects

object CheckSumAccumulator {
  
  def main(args : Array[String]) :Unit = {
    var ca = new CheckSumAccumulator();
    ca.add('A');
    println(ca.checkSum());
  }
}

class CheckSumAccumulator {

  private var sum = 0;

  def add(b: Byte): Unit = {
    sum += b;
  }

  def checkSum(): Int = {
    println(sum);
    println(0xFF);
    ~(sum & 0xFF) + 1;
  }
}
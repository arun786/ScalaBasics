package Expressions

object FunctionalMultiplicationTable {

  def main(args: Array[String]): Unit = {
    println(multiTable());
  }

  def makeRowSequence(row: Int): Seq[String] = {
    for (col <- 1 to 10) yield {
      f"${row * col}%4d";
    }
  }

  def makeRow(row: Int): String = makeRowSequence(row).mkString;

  def multiTable(): String = {
    val tableSeq = for (i <- 1 to 10) yield makeRow(i);
    tableSeq.mkString("\n");
  }
}
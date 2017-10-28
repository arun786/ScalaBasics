package Generic

object MoreFunctionalMethod {
  def main(args : Array[String]){
    
    var args = Array("Hello","World");
    args.foreach(arg => println(arg)); 
    args.foreach(println);
  }
}
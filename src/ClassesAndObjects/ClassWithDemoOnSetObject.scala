package ClassesAndObjects

object ClassWithDemoOnSetObject {
  def main(args : Array[String]){
    var countries = new ClassWithDemoOnSet();
    println(countries.getCountries());
    
    println(countries.checkIfCountryExists("India"));
  }
}
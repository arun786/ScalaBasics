package ClassesAndObjects

import java.util.Collections.EmptySet

class ClassWithDemoOnSet {
  var countries : Set[String] = Set(); //create an empty set
  
  def setCountriesOnName(){
    countries += "India";
    countries += "USA"
    countries += "Pakisthan";
  }
  
  def getCountries() : Set[String] = {
    setCountriesOnName();
    countries;
  }
  
  def checkIfCountryExists(args : String) : Boolean = {
    setCountriesOnName();
    countries(args);
  }
}
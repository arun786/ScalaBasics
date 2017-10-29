package ClassesAndObjects

class FirstClass {
  
  private var number = 0;

  def incrementNumber10TimesBasedOnInput(arg : Int): Int = {
    var a = 0;
    for (a <- 1 to 10) 
      number += arg;
    number;
  }
}
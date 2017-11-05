package Exceptions

import java.net.URL
import java.net.MalformedURLException

object URLException extends App{
  
  println(CheckURL("http://amazon.com"));
  println(CheckURL("abcd"));
  
  def CheckURL(url : String) : URL = {
    try new URL(url)
    catch  {
      case ex : MalformedURLException => new URL("http://Google.com"); 
    }
  }
}
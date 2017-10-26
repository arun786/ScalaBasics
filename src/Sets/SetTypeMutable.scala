package Sets

import scala.collection.mutable.Set

object SetTypeMutable {
  def main(args: Array[String]) {
    val _set = Set(1, 2, 3, "abc")
    println(_set) //Set(1, 2, abc, 3)

   _set += (true)
   println(_set) //Set(1, 2, abc, 3, true
    
    
    var _setImmutable = scala.collection.immutable.Set(1,2,3,"abc")
    println(_setImmutable) //Set(1, 2, 3, abc)
    
   /* Set(1, 2, 3, abc)*/
    
   _setImmutable += (7)
   
   println(_setImmutable) //Set(abc, 1, 2, 7, 3)
   
   //immutable allows updates, inserts and deletes but the original one is not modified but a new set is created.
   

  }
}
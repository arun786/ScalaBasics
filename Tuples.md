# Tuples in Scala

## Before going to Tuples, some Observations related to List.

### Note : List are Homogenous in nature

scala> 1::Nil
res0: List[Int] = List(1)

scala> 1::2::Nil
res7: List[Int] = List(1, 2)

if we add only Integer to List, the type will be int

scala> true::Nil
res1: List[Boolean] = List(true)

scala> true::false::Nil
res8: List[Boolean] = List(true, false)

if we add only Boolean to a list, the type will be Boolean

scala> "arun"::Nil
res2: List[String] = List(arun)

scala> "arun"::"Adwiti"::"Pushpa"::Nil
res10: List[String] = List(arun, Adwiti, Pushpa)

if we add only Strings to a List, the Type will be String.

But if we add type int and Boolean, Type will be AnyVal.

scala> 1::true::Nil
res11: List[AnyVal] = List(1, true)

if we add String and/or Boolean , int, type will be Any

scala> 1::"Arun"::Nil
res12: List[Any] = List(1, Arun)

scala> true::"Arun"::Nil
res13: List[Any] = List(true, Arun)

scala> 1::"Arun"::true::Nil
res18: List[Any] = List(1, Arun, true)


### Tuples are Heterogenous in Nature

scala> (1)
res14: Int = 1

scala> (1,"Arun")
res15: (Int, String) = (1,Arun)

scala> (true,"Arun")
res16: (Boolean, String) = (true,Arun)

scala> (1,true,"Arun")
res17: (Int, Boolean, String) = (1,true,Arun)

### Index of a Tuple starts from 1 instead of 0

scala> myTuple._1
res19: Int = 1

scala> myTuple._2
res20: Boolean = true

scala> myTuple._3
res22: String = Arun

scala> val(a,b,c) = myTuple
a: Int = 1
b: Boolean = true
c: String = Arun

scala> val(a,b,_) = myTuple
a: Int = 1
b: Boolean = true





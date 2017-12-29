# Scala

## Basics of Scala

We use REPL for understanding the basics of Scala

Scala Intrepreter : REPL - Read Evaluate Print and Loop

scala> 1 + 1
res0: Int = 2

scala> 1.0 + 1
res1: Double = 2.0

scala> res0 + 2
res1: Int = 4

scala> println("hello, world")
hello, world

scala> val msg = "hello, world"
msg: String = hello, world

scala> val msg = "hello,world"  //val is final in scala, it cannot be reassigned
msg: String = hello,world

scala> println(msg)
hello,world

scala> msg = "arun"
<console>:12: error: reassignment to val
       msg = "arun"

scala> var msg = "Arun" //var is not final and can be reassigned
msg: String = Arun


to load a file which is written in vim, we can use 
scala> :load <name of the file>

to quit from scala
scala> :q

## if then else condition in scala

scala> val a = 1
a: Int = 1

scala> val b = 2
b: Int = 2

scala> :paste
// Entering paste mode (ctrl-D to finish)

if ( a > b)
println(a)
else
println(b)

// Exiting paste mode, now interpreting.

o/p is 2

## ternary operator in Scala

scala> val m = if ( a > b ) a else b
m: Int = 2




# Scripting in Scala

## first example

vi helloarg.scala

in the Vi editor, we can type the below

println("Hello," + args(0) + " !")

when we come out of vim, and type the below

scala helloarg.scala planet

o/p -> Hello, planet !

## second example

we can also write as below

println(s"Hello, ${args(0)} !)
# Defining Function

	object DefiningAFunction {
	
	  def main(args: Array[String]): Unit = {
	    max(10,12)
	  }
	
	  def max(x: Int, y: Int) = {
	    if (x > y)
	      println(x)
	    else
	      println(y)
	  }
	}

# Stream Line a Function

Functions can be defined in one line as 

def f(x : Int) : Int = x + 1

f(10) will be 11

## -----------------
scala> def f(x : Int) : Int = x + 1
f: (x: Int)Int

scala> f(3)
res0: Int = 4

## -----------------
scala> def greet() = {println("Hello, World")
     | }
greet: ()Unit

scala> greet()
Hello, World

## -----------------
scala> def greet() : Unit = println("Hello world")
greet: ()Unit

scala> greet()
Hello world



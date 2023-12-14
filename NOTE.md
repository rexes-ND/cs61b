To install and configure the Jave JDK
```
$ sudo apt install openjdk-17-jdk
```

To run `HelloWorld.java`
```
$ javac HelloWorld.java # Produces HelloWorld.class
$ java HelloWorld
```
- In Java, all code must be part of class.
- Classes are defined with `public class CLASSNAME`
- Use {} to delineate the beginning and ending of things.
(similar to C)
- End lines with a semicolon. (similar to C)
- The code to be run must be inside
`public static void main (String[] args)` (similar to `int main`)

Variables in Java
- Before Java variables can be used, they must be declared.
- Java variables must have a specific type.
- Java variable types can never change.
- Types are verified before the code even runs.

Functions in Java
- Functions must be declared as part of class in Java.
A function that is part of a class is class a "method."
So in Java, all functions are methods.
- To define a function in Java, we use "public static".
- All parameters of a function must have a declared type,
and the return value of the function must have a declared type.
Functions in Java return only one value.

OOP in Java
Java is object oriented language with strict requirements:
- Every Java file must contain a class declaration. (*)
- All code lives inside a class*.
- To run a Java program, you typically define a main method using
`public static void main(String[] args)`

(*) This is not strictly true. Learn more about `interface`(s).

Static typing in Java
- All variables, parameters, and methods must have a declared
type.
- That type can never change.
- Expressions also have a type.
- The compiler checks that all the types in your program are
compatible before the program ever runs!

In Java, compilation and interpretation are two separate steps.

Hello.java -> javac (compiler) -> Hello.class ->
java (interpreter) -> ...

Reason for creating `class` file:
- .class file has been type checked.
- .class files are 'simpler' for machine to execute.

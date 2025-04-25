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

Classes in Java
- To run a class, we must define a main method. 
    - Not all classes have a main method.
- Classes can contain data.
- Classes can be instantiated as objects.
- Non-static method - Instance method
- Static method - Class method in Python
- Unlike Python, we cannot dynamically add new attribute to objects.

Arrays in Java

To create an array of objects:
- Use `new` keyword to create an array.
- Use `new` again for each object that is added to an array.

Difference between Static vs Non-Static
- Static methods are called using the class name.
- Instance methods are invoked using an instance name.

Some classes are never instantiated. (e.g. Math.sqrt(100))

Some classes may have a mix of static and non-static methods.

Best practice: Avoid static variables whose values change.

A good foundational computer science course should primarily
teach you to properly manage complexity.

Primitive types in Java

8 primitive types: byte, short, int, long,
float, double, boolean, char

Everything else, including arrays, is a `reference type`.

When you declare a variable of a certain type in Java:
- The machine sets aside exactly enough bits to hold a thing of
that type.
- Java creates an internal table that maps each variable name to a
location.
- Java does not write anything into the reserved boxes.

When you declare a variable of any reference type
- Java allocates exactly a box of size 64 bits, no matter what type
of object.
- These bits can be set either to:
    - `null` (all zeros)
    - The 64 bit "address" of a specific instance of that class
(returned by `new`).

`The Golden Rule of Equals`:
Given variables y and x:
- `y = x` copies all the bits from x into y.

Parameter passing obeys the same rule:
Simply copy the bits to the new scope.

Class Instantiations in Java

When the object is instantiated,
- Java first allocates a box of bits for each instance variable of
the class and fills them with a default value. (e.g 0, null)
- The constructor then usually fills every such box with some other
value.

Can think of `new` as returning the address of the newly created
object.

Arrays are also Objects. Objects are usually instantiated using the
`new` keyword.
```
int[] x = new int[]{0, 1, 2, 95, 4};
int[] a;
```

Arrays are a special kind of object which consists of a numbered
sequence of memory boxes.
- To get i-th item of array A, use A[i].
- Unlike class instances which have named memory boxes.

Hide implementation details from users of your class.
- Less for user of class to understand.
- Safe to change implementations of private methods

Nested classes are useful when a class don't stand on its own and
is obviously subordinate to another class.

If the nested class never uses any instance variables or methods of
the outer class, declare it static.

An invariant is a condition that is guarenteed to be true during
code execution.

Invariants make it easier to reason about code:
- Can assume they are true to simplify code.
- Must ensure that methods preserve invariants.



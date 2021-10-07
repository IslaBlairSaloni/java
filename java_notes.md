## Table of content
 - [Sample Program](#sample-program)
 - [A basic structure](#java-program-structure)
 - [Java tokens](#java-tokens)
 - [Statements in java](#statements)
 - [Implementing a java program](#Implementing-a-java-program)
 - [Command line arguments](#Command-Line-Arguments)
 - [Data Types](#Data-types)
 - [Scope of variables](#Scope-of-variables)
 - [Symbolic Constants](#Symbolic-constants)
 - [Type Casting](#Type-casting)
 - [Getting Values of variables](#Getting-values-of-variables)

### Sample-Program
```java
/* square root of a number */
import java.lang.Math;
class SquareRoot
{
 public static void main(String args[])
 {
  double x=5; 
  double y; 
  y=Math.sqrt(x);
  System.out.println("y= "+y);
 }
}
```
<p> in Math.sqrt, MATH is class name and
SQRT is a method of that class. </p>
___

### Java-program-structure

1. Documentation (optional)
   program name/author details in comments
2. Package statement (optional)
   this means that classes defined in the 
   program, belongs to this package.
3. Import statement (optional)
   importing methods from java library.
4. Interface statement (optional)
   Also like a class, will be discussed later.
5. class definition (important)
   java is a purely object oriented language,
   everything is dependent on the classes.
6. main method class 
   the execution of the program starts from here.

>link to example [here](https://github.com/IslaBlairSaloni/java/blob/main/RoomArea.java "link")
 ___

### java-tokens

* keywords: predefined meaning (lower case)
* identifier: programmer designed tokens (can use $ sign too)
* literal: constant values 
 [more](#Literals)
* operator: symbols which take one/more 
  arguments to perform operations
* separator: symbols used to indicate where
  groups of code are divided and arranged.
____

### statements
executable combination of tokens ending with ; 

There are 5 types of statements, and some sub-types under 'expression' statements and 'control' statements.

|  Expression   | labelled | synchronization | guarding |
|  -----------  | -------- | --------------- | -------- |
|  Assignment   |          | used in multithreading |   |
| pre-increment |          |                 |          |
| pre-decrement |          |                 |          |
| post-increment|          |                 |          |    
| post-decrement|          |                 |          |
|  method call  |          |                 |          |
|   allocation  |          |                 |          |

| control |                       | 
| ------- | --------------------- |
|selection|  if, if-else, switch  |
|iteration|     while, do, for    |
|  jump   |break, continue, return|

* empty statement: does nothing, used as a place holder during
 program development. 
___

### Implementing-a-java-program

1. Source file  
 Files with extension (.java) i.e. when the 
 files are saved initially. 
 Eg: RoomArea.java
2. Compiling 
 Compiler --> javac
 After compilation, source file is converted 
 to bytecode file. 
 Extension (.class) 
 Eg: RoomArea.class
3. Interpreting
 Finally the interpreter converts the bytecode 
 into machine code and the program gets 
 executed.

> **Bytecode:**
Bytecodes are machine-independent, therefore
can be run on any machine. This code is 
actually produced for a machine that does not 
exist. This machine is called 
*java virtual machine (JVM)* and only exists 
inside the computer memory. 

___

### Command-Line-Arguments

* We use them when we want our program to act in
a particular way depending upon the input 
provided at the time of execution.
* Supplied to application programs at the time
of making it for execution.

> Eg: java RoomArea 14.5 6.4

RoomArea--> file name </br>
14.5, 6.4--> Arguments

These arguments are stored in the string type 
array args[] we use while calling main method.
```java
public static void main(String args[])
{
 .
 .
 .
}
```
14.5 args[0] </br>
6.4 args[1]

0,1 (index)

**Note:** Indexing in arrays begin from 0 
and NOT 1.

### Literals
 * numeric
     * integer constants
         * binary literals- </br>
           eg: int num1=0b0101110; </br>
           int num2=0B0110100; </br>
           0b--> fixed value to represent </br>
           binary numbers, case sensitive. 
         * numeric literals </br>
           eg: int m=45, n ,a; </br>
           **note:** you can also use underscore (_) 
           to show place value </br>
           eg: int num1=1_000; </br>
               int num2=1_000_000 </br>
    * real constants 
        * floating points </br>
          eg: 0.0083, -0.75, 7.6 etc. </br>
          also valid: -.7, .5 , .24 etc 
        * exponential/scientific </br>
          eg: 215.65 ---> 2.1565e2 </br>
          e2 means multiplying by 10²
 * character constants
     * single character constants </br>
       '5','y',;',' '  </br>
       it can be a number, alphabet, symbol 
       and space too.
     * string constant
       "hello java"  </br>
       "Welcome to my repository"  </br>
       "x"  </br>
       "5+3" </br>
       "Boolean"  </br>

**Backslash character constants** 

* \b  - backspace
* \f  - formfeed
* \n  - new line
* \r  - carriage return
* \t  - horizontal tab
* \\"  - single quote
* \\' - double quote
* \\\  - backslash
   ____
   
### Data-types

**Primitive (intrinsic)**
1. Numeric
    * integer: 
        * byte (1 byte)
        * short (2 bytes)
        * int (4 bytes)
        * long (8 bytes)
    * floating-point:
        * float (4 bytes)
        * double (8 bytes) 
2. Non-numeric:
    * char (2 bytes)
    * boolean (1 bit)  

**Declaration and initialisation:** 

Syntax: type var1, var2....varn; </br>
        type varname= value; </br>

> Variable declaration example [here](https://github.com/IslaBlairSaloni/java/blob/main/Declaration.java)

**Non-primitive (derived)**
1. class
2. interface
3. array

____

### Scope-of-variables

**Scope: **Area of program where a variable is usable/accessible.
Classified into three types:
1. Instance variables :-
    * declred inside a class
    * created when objects are instantiated
    * associated with objects
	* different values for different objects
2. Class variables
    * declared inside a class
	* global to that class
	* only one memory is created for it
3. Local Variables
    * declared and used inside a method
    * cant be used outside the method
	* can also be declared inside code blocks --> {}
	
>Each block can contain its own set of local varialble declarations. We cannot however declare a variable to have the same name as one in outer block (in case of **nesting**).

____


### Symbolic-constants

* user-defined unique constants
* defined values get automatically substituted at the appropriate points
* __syntax: __ final type symbolic_name = value;
* value can never be changed within the program by the use of assign statement.
* recommended to write the constant name in CAPITALS, in ordeer to differentiate from other identifiers.
* CANNOT be declared inside a method, can be used only as class data members in the beginning of class.

Example:
```java
 final int STRENGTH=100;
 final int PASS_MARK=50;
 final int P1=3.14159;
 ```


____


 ### Type-Casting
 * To store value of one type into variable of another type.
 * Used when a method returns a type different from the one we require.
 * Casting into a smaller type can result in a loss of data.
 **syntax: ** type variable1=(type) variable2;
 example:
 ```java
 int m=50;
 byte n=(byte) m;
 long count=(long) m;
 ```
**Automatic-type conversion**
Possible only if destination type has enough precession to store the source value.
Eg: int is large enough to hold a byte value.
```java
byte b=75;
int a=b;
```
* smaller type to larger type --> widening/promotion
* larger type to smaller type --> narrowing

>note: Floating points have a default type of double. So the declaration:
float x=7.56;
produces the error:  __incompatible types: possible lossy conversion from double to float__
so, it should be written as:
float x=7.56F;

____
### Getting-values-of-variables

**Output methods: **
* print() 					//prints and waits
* println()  			   //prints and moves to the next line

```java
System.out.println("hello!"); //prints and moves to the next line
System.out.print("world"); //prints and waits on the same line 
System.out.println("welcome"); //prints and moves to the next line
System.out.println(); //prints nothing but moves to the next line
//now suppose you want to print the value of some variable x
int x=9;
System.out.println(x);
```


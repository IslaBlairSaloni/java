## Table of content
 - [Sample Program](#sample-program)
 - [A basic structure](#java-program-structure)
 - [Java tokens](#java-tokens)
 - [Statements in java](#statements)
 - [Implementing a java program](#Implementing-a-java-program)
 - [Command line arguments](#Command-Line-Arguments)
 - [Data Types](#Data-types)

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

> Variable declaration example [here](https://github.com/IslaBlairSaloni/java/blob/main/Declaration.java)

**Non-primitive (derived)**
1. class
2. interface
3. array


## Table of content
 - [Sample Program](#sample-program)
 - [A basic structure](#java-program-structure)
 - [Java tokens](#java-tokens)
 - [Statements in java](#statements)
 - [Implementing a java program](#Implementing-a-java-program)
 - [Command line arguments](#Command-Line-Arguments)
 ___

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
* identifier: programmer designed tokens
* literal: constant values
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

RoomArea--> file name
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
14.5 args[0]
6.4 args[1]

0,1 (index)

**Note:** Indexing in arrays begin from 0 
and NOT 1.

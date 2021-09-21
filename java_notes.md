## Table of content
 - [Sample Program](#sample-program)
 - [A basic structure](#java-program-structure)
 - [Java tokens](#java-tokens)
 - [Statements in java](#statements)
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

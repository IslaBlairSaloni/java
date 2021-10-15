## Table-of-contents
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
 - [Default Values of variables](#Default-values)
 - [Operators](#Operators)
 - [Decision making and branching](#Decision-making-and-branching)

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

[Table of contents](#Table-of-contents)

____

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


[Table of contents](#Table-of-contents)

____

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

____

[Table of contents](#Table-of-contents)

____

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
   

[Table of contents](#Table-of-contents)

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


[Table of contents](#Table-of-contents)

____

### Symbolic-constants

* user-defined unique constants
* defined values get automatically substituted at the appropriate points
* __syntax:__ final type symbolic_name = value;
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
 **syntax: ** type variable1=(type) variable2; </br>
 example:
 ```java
 int m=50;
 byte n=(byte) m;
 long count=(long) m;
 ```
**Automatic-type conversion**
Possible only if destination type has enough precession to store the source value. </br>
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


[Table of contents](#Table-of-contents)

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
____

### Default-values
|  DataType | Default value  |
| ------------ | ------------ |
| byte  | 0  |
| short  | 0  |
| int  | 0  |
| long  | 0L  |
| float  | 0.0f  |
| double  | 0.0d  |
| char  | null character  |
| boolean  | false  |

____


[Table of contents](#Table-of-contents)

____

### Operators

#### Arithmetic Operators:
| operator  | meaning   |
| ------------ | ------------ |
| +  |  addition |
| -  | subtraction  |
| *  | multiplication   |
| /  | division  |
| %  |modulus/remainder  |

__NOTE:__
* We cannot use these operators on boolean type.
* The unary minus operator multiplies its single operand by (-1). Eg: -b\\c. 
* Integer expression: When all the operands are integers. The output will always be an integer.
* Integer division: a/b will result in the quotient excluding the remainder, i.e. 5/2 will result in 2 and 7/4 will result in 1.
* Mixed-mode: When one operand is real and other is integer. The result will also be real. Eg: 15/10.0 = 1.5
* In modulo division, the sign of the first operrand wil be the sign of the result. 
    * 14%3=2
	* 14%-3=2
	* -14%3=-2
	* -14%-3=-2
* Modulo division is defined as: a % b = a - (a/b) \* b

#### Relational Operators:
|  operator | meaning  |
| ------------ | ------------ |
|  < |  less than |
| <=  | less than equal to  |
| >  |  greater than |
| >=  | greater than equal to  |
| ==  | equal to  |
| !=  | not equal to  |

__NOTE:__ 
* Arithmetic operations have a higher priority over relational operators.
* The values of the expression is either true or false.

Eg:
* a\<b
* a==b
* (x+7)>(y+8)

#### Logical Operators

&& -->  logical AND </br>
|| --> logical OR </br>
! --> logical NOT </br>

Eg:
* a>b && x==10
* a!=5 || a<10



**NOTE:**
* The result of these expressions will also be true or false.
* The result of the logical operations is determined according  to the following table:

| Expression-1 | Expression-2  |   AND  | OR  |
| ------------ | ----------- | ---------- | ----------- |
|  true |true   | true   | true  |
| true  |  false |    false  |  true |
| false   | true    |false  | true  |
|  false  |  false |    false  | false  |

#### Assignment Operator

* Used to assign values to a variable. (=)
* We have, in addition, shorthand assigment operators.

| Simple Statement  | Shorthand operator  |
| --------| ------------|
| a=a+1  | a+=1  |
| a=a-1   | a-=1 |
| a=a\*(n+1)  | a\*=(n+1)   |
| a=a/(n+1)  |  a/=(n+1) |
|  a=a%b | a%=b  |

__Why to use shorthand operators:__

* Easier to write, no need to repeat whats on the left.
* More concise and easy to read.
* More efficient code

#### Increment and decrement operator

++ and \--
* ++ adds 1,  Eg: ++m  or  m++
*  \-- subtracts 1,  Eg:  \--m  or m\--
* Mostly used in for and while loops
* y=++m;  // will first increment the value of m then assign it to  y
* y=m++; //will first assign the original value of m to y, then increment the value of m by 1.

#### Conditional Operator

The pair ? : is a ternary operator. It takes 3 operands. </br>
exp1 ? exp2 : exp3

1. First exp1 is evaluated.
2. if it results true, then exp2 is evaluated and becomes the value of the expression.
3. if exp1 results false, then exp3 is evaluated, and becomes the value of the expression.

Eg:

```java
int a=7;
int b=9;
x=(a<b)?a:b;	 //checks if value of a is smaller, (yes), assigns value of a to x
y=(a>b)?a:b; 	//checka if value of a is greater,(No), assigns value of a to y
```
#### Bitwise Operator

For manipulation of data on bit level, and may not be applied to float or double. </br>
Eg: Bitwise OR --> | </br>
other operators:

| Operator  | Meaning  |
|---------- |----------|
| &  |  bitwise AND |
| ^  |  bitwise exclusive OR (XOR) |
| ~  | one's complement  |
|<<   |  shift left |
| >>  |  shift right |
|  >>> | shift right with zero fill  |

Use of bitwise operators example [here](https://github.com/IslaBlairSaloni/java/blob/main/Bitwise.java)

#### Special Operators

__Instanceof__ : This helps to determine whether the object on the left-hand side is an instance/belongs to the class on right-hand side or not. </br>
Eg:  </br>
person  instanceof  student </br>
will result _true_ if __person__ belongs to the class __student__ </br>

__Dot operator__ : This is  used to access the instance variables and methods of class objects. </br>
person1.age				//reference to variable age  </br>
person1.salary()			//reference to the method salary()

#### Precedence of arithmetic operators

high priority        *  /  &      </br>
low priority        +  -       </br>

>Note: If same precedence occurs , then the expression is evaluated from left to right. 
First, all the high priority operations are evaluated, from left to right, then low priority operators. But when parantheses () are used, it is always evaluated first.

* To use mathematical functions, a class can be imported called as __Math__ which is present in __java.lang__  .
* Can be used as Math.function_name(). </br>
   Eg: y= Math.sqrt(x);

____

### Decision making and branching

* When we may have to change the order of executuion of statements, or repeat one or more statements, based on a certain condition, then this concept comes into play.
* When we have to break the sequential flow of the program, and jump to another part of the code, we call it __Branching__.
* When branching is based on a particular condition, we call it __Conditional Branching__.
*  Java uses the following __control__ or __decision making__ statements-
 1. if
 2. switch
 3. conditional

#### If statement:

* A two-way decision statement.
* used in conjunction with a statement
* Syntax:	 if	(	expression	)	;

__Simple if__
If the condition results true then some set of statements will be executed, if not, then that set of statements will be skipped and the execution will proceed.
<!--
```flow
st=>start: Start
op=>operation: Statements
cond=>condition: If condition
smst=>operation: Some statement block
sms=>operation: Some statement x
e=>end
st->op->cond->sms
cond(yes)->smst->sms->e
cond(no)->sms->e
```
-->
__If-else__

<!---
```flow
st=>start: Entry
cond1=>condition: If condtion
op1=>operation: "if" Block of statements
op2=>operation: "else" Block of statements
fin=>operation: statement x
e=>end
st->cond1->fin->end
cond1(yes)->op1->fin->e
cond1(no)->op2->fin->e
```
-->

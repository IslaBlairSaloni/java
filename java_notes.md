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
 - [Decision making and Looping](#Decision-making-and-Looping)
 - [Classes](#Classes)
 - [Object Creation](#Creating-Objects)
 - [Accessing Class members](#Accessing-Class-Members)
 - [Constructors](#Constructors)
 - [Method Overloading](#Method-Overloading)
 - [Static members](#Static-members)
 - [Nesting of methods](#Nesting-of-methods)
 - [Inheritance](#Inheritance)
 - [Overriding methods](#Overriding-methods)

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

[Table of contents](#Table-of-contents)
____


### Scope-of-variables

**Scope:** Area of program where a variable is usable/accessible.
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

[Table of contents](#Table-of-contents)

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


### Getting-values-of-variables

**Output methods:**
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

[Table of contents](#Table-of-contents)

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

[Table of contents](#Table-of-contents)

____


### Decision-making-and-branching

* When we may have to change the order of executuion of statements, or repeat one or more statements, based on a certain condition, then this concept comes into play.
* When we have to break the sequential flow of the program, and jump to another part of the code, we call it __Branching__.
* When branching is based on a particular condition, we call it __Conditional Branching__.
*  Java uses the following __control__ or __decision making__ statements-
 1. if
 2. switch
 3. conditional

#### 1. If statement:

* A two-way decision statement.
* used in conjunction with a statement
* Syntax:	 if	(	expression	)	;

__Simple if__ </br>
If the condition results true then some set of statements will be executed, if not, then that set of statements will be skipped and the execution will proceed.

![Simple if](https://github.com/IslaBlairSaloni/java/blob/main/simple%20if.PNG)

__If else__ </br>
Here, when condition results true then some set of statements will be executed, if not, then the statements in the _else_ block will be executed. After that the next statements of the program will be executed. </br>

![If Else](https://github.com/IslaBlairSaloni/java/blob/main/ifelse.PNG )

__Nested if else__ </br>
When a series of decisions is involved, we use nested if else. </br>

![Nested if else](https://github.com/IslaBlairSaloni/java/blob/main/nestedifelse.PNG )

__else if ladder__ </br>
This is used when multipath decisions are involved. </br>

![Ladder if else](https://github.com/IslaBlairSaloni/java/blob/main/elseifladder.PNG )
</br>
[Examples](https://github.com/IslaBlairSaloni/java/blob/main/IfStmts.java)

#### 2. Switch Statement

* When one of many alternatives is to be selected, then we use switch case. 
* This tests the value of a given variable/expression against a list of cases, and when a match is found, it executes the associated block of statement.
* These variables/expressions are called _labels_. 
* They  can be integer values, or equivalent to some integer, and should be unique for each case.
* the __break__ statement after every case is used to exit from the switch statement, transferring the control to the statement following the switch statement.
* You can also use empty cases, which contain no statements.

> We can also use if statements to solve this problem,  but that will increase the complexity of the program.

![Switch Case](https://github.com/IslaBlairSaloni/java/blob/main/switchcase.png) 
</br>
[Examples](https://github.com/IslaBlairSaloni/java/blob/main/Swtch.java)

#### 3. Conditional-operator

<mark>? :</mark> </br>
This operator is useful in making two way decisions, it works like simple if. </br>
condition ? operation1 : operation2 </br>
If condition results true, operation1 gets executed, otherwise operation2.

![Conditional Operator](https://github.com/IslaBlairSaloni/java/blob/main/condop.PNG)

```java
int a=5, b=9, c=6, d=4;
(a>b)	?	a=0	:	b=0; 	//here b will become 0 as the condition results in false.
(c>d)	?	c=0	:	d=0; 	//here c will become 0 as the condition results in true.
```
____

### Decision-making-and-Looping
* the process of repeatedly executing a block of statements is called looping.
* the statements in a block can be executed any no. of time i.e. _zero to infinity_.
* an _infinite loop_ is a loop which continues forever.
* a loop has-
	1. body of the loop
	2. control statement : tests conditions on each repeated execution.
* Types of loop based on control statement:
	1. entry controlled: conditions tested before the start of execution of the loop
	2. exit ccontrooled: conditions tested at the end of the body of the loop.

![Exit and entry controlled loop](https://github.com/IslaBlairSaloni/java/blob/main/exit-entry.jpg)

* Looping process:
	1. Setting and initializing of a counter
	2. Execution of the statements in loop.
	3. Condition check
	4. Incrementing the counter
* Three types of constructs to perform looping
	1. while
	2. do
	3. for

__1. While__

Basic format: </br>
*Initialization; </br>
__while__ (test condition) </br>
{ </br>
Body of the loop </br>
}*

>this is an entry controlled loop

Eg:
```java
sum=0;
n=1; 				//setting and initialiation of counter
while(n<=10)				//condition
{
sum=sum+n*n;
n=n+1;				//increment of counter
}
System.out.println("sum="+sum);
```
__2.Do While__

Basic format: </br>
*Initialization; </br>
__do__ </br>
{ </br>
Body of the loop </br>
}*
__while__ (test condition); </br>

>this is an entry controlled loop

eg:
```java
i=1;
sum=0;
do
{
sum=sum+i;
i=i+2;
}
while(sum<40 || i<10);
```
**3. For**
Basic format </br> 
_**for** ( initialisation ; test condition ; increment )_ </br>
{ </br>

} </br>

>this is an entry controlled loop

* initialization is done first (i=1, count=0: i and count are **loop-conrol variables**).
* value of control variable is tested using the test condition (results in true/false).
* when the body of the loop is executed (till the last statement in the loop.)
	1. the control statement is transferred back  to the __for__ statement.
	2. control variable is incremented, (i=i+1), and tested again.
	3. if tested true, executed again, and same process is followed until condition tests false.

**Classic for loop** </br>
eg:
```java
//loop for i = ( 0 to 7 )
for( i=0 ; i<=7 ; i=i+1 )
{
System.out.println( i );
}
```
```java
//loop for j = ( 8 to 0 )
for( j=8 ; j>=0 ; j=j-1 )
{
System.out.println( j );
}
```
**Comparison of loops:**

|for   | while   |   do while|
| --- | --- | --- |
| **for** ( initialization ; test condition ; increment )</br>{ </br>body of the loop </br>} </br> |  initialization; </br>**while** (test condition)</br>{ </br>Body of the loop </br>increment</br>}  | initialization;</br> **do**</br>{</br>Body of the loop</br>increment</br>} **while** (test condition);   |

for loop -
* may have multiple initialisations :  </br> for( p=0, i=1 ; i<9 ; i++ )
* may have multiple values to increment :  </br> for( i=1 ; i<9 ; p=p-1, i++ )
* may have compound test conditions </br> for( i=1 ; i<9 &&  i>3 ; i++ )
* may omit one or more sections. </br>i=0; </br> for( ; i<9 ; ) </br>{ </br> statements </br> i=i\*i; </br>} 
* can be used as time delay loop,</br>for( i=1000 ; i>0 ; i=i-1)</br>; </br>OR</br>for( i=1000 ; i>0 ; i=i-1) ; </br> // this loop will execute 1000 times without producing any output

**Nested For Loop**

one for statement in another </br>
eg:
```java
for(i=1;i<=3;i++)
{
	System.out.println(i);
	for(j=1;j<=10;j++)
	{
		System.out.println(" "+j);
	}
}
```
**Enhanced For Loop**

* also called for each loop
* more efficient way to retrieve array of elements rather than using array indexes.
Eg:
```java
int arr[4]={10,20,30,40};
//Classic for loop
for(int i=0;i<4;i++)
{
System.out.println(" "+arr[i]);		//using index to access array elements
}
//For each loop
for(int k: arr)
{
 System.out.println(" "+k);		//using k means using all the elements of array one by one
}
```

**Jumps in loop**

1. Jumping out of loop
	 * an early exit from the loop **(for/while/loop)** can  be accomplished by  using **break** statement. (As seen in switch case).
	 * immediate exit from the loop, moving to the statement after that loop block.
2. Skipping a part of the loop
	* skips the current iteration and moves to the next iteration
	* all the statements after **continue** will be skipped, the value of the **counter variable** will be incremented and then the next iteration will go on normally.
3. Both of these are generally used with **if** statements.

Eg:
```java
for(j=1;j<=10;j++)
{
	 if(j==5)
	 break;
	 System.out.println(" "+j);
}    //this loop will end when j will be equal to 5

for(k=1;k<=10;k++)
{
	if(i%2==0)
	continue;
	System.out.println(" "+k);
}    //this loop will print only those values of k which are not divisible by 2
```

**Labelled Loops**

* Label : any valid variable name in java
* In java, we can give label to a block of statements.
* if we want to jump outside a nested loop, or continue a loop that is outside the current one, then we can use labelled loops.

Eg;
```java
outer: for(int m=1;m<11;m++)
{
	for(int n=1;n<11;n++)
	{
		System.out.print(" "+m*n);
		if(n==m)
	    {
	        System.out.println();
	        continue outer;
	    }
	}
}
```
![Labelled for loop]( https://github.com/IslaBlairSaloni/java/blob/main/labelled.PNG)

 ___

[Table of contents](#Table-of-contents)

____

### Classes

* anything we wish to represent in java, must be encapsulated in a __class__.
* __class__ defines __state__ and __behaviour__ of the basic program components known as __objects__.
* classes provides a method for packing together a **group of logically related data items and functions that work on them.**
* here, data items are called fields and functions are called methods.
* Class gives a sort of template for the objects.

#### Defining a class

* user-defined
* once class type is defined, we can create variables of that class type known as objects, also known as instance of classes.

 basic form:  </br>
**class** *Class_name*  </br>
{ </br>
	fields declaration; </br>
	methods declaration; </br>
} </br>

> we can also define empty classes, but this class won't be able to do anything. But, we can create its objects.

#### Fields declaration

* fields are also called [Instance variables](#Scope-of-variables) and member variables..
* we can declare them in the same way we declare [Local variables](#Scope-of-variables).

Example: </br>
class Rectangle </br>
{ </br>
int length; </br>
int width; </br>
} </br>

* the class __rectangle__ contains two integer type instance variables- length and width. 
* They can also be declared as : __int length, width;__ 

> these variables are only __declared__ , therefore, no memory will be assigned to them.

#### Method declaration

* The objects created by such classes which have no methods, cannot respond to any messages.
* General form: </br> __type methodName (parameter list)__ </br> { </br> method-body; </br> }
* four basic parts:
 1. name 
 	* any valid identifier
 2. return type 
 	* the type of value the function will return
	* can be int, float, void
 3. parameter-list 
	*  always enclosed in parantheses
	* contains list of names and types of variables we want to provide as input
	* eg1: (int m, float x, float y) 		//three parameters 
	* eg2: () 		//empty list
 4. body - describes the actual operation to be performed by the function
* Example: </br>
class Rectangle </br> 
{ </br>
int length; </br>
int width; </br>
__void__ getData (int x, int y) 	//method declaration </br>
{ </br>
length=x; </br>
width=y; </br>
} </br>
} </br>

___

### Creating-Objects

* Also referred to as instantiating an object
* using __new__ operator 
* The __new__ operator creates an object of the specified class and returns a reefrence to that object.

Eg:</br>
Rectangle rect1= __new__ Rectangle(); </br>
* the method __Rectangle()__ is the default constructor of the class __Rectangle__ . </br>
Eg:</br>
Rectangle rect1= new Rectangle( ) ; </br>
Rectangle rect2= new Rectangle( ) ; </br>

|  action | statement  |  result |
| ------------ | ------------ | ------------ |
|  Declare | Rectangle rect1;  | null  |
| instantiate  | rect1= new Rectangle( );  | reference created |
|   | | rect1 is reference to rectangle objects |

* It is  also possible to create two or more reference to the same object. </br> Rectangle R1= new Rectangle( ); </br> Rectangle R2=R1;
* R1 and R2 are references to the same rectangle object, i.e. any changes made in R1's fields, will be reflected in R2's fields too.

 ___

[Table of contents](#Table-of-contents)

___

### Accessing-Class-Members

* Cannot be accessed directly
* Syntax to access objects: </br>
>*objectname.variablename = value ;* </br>
*objectname.methodname(parameter-list) ;* </br>

Eg:
```java
void getData( int m, int n)  //let this be a function in the class
{
length=m;
breadth=n;
}
//rect1 is an object
rect1.length=11;		//accessing data member
rect1.breadth=12;
rect1.getData(11,12);		//accessing member function
```
* we can use this method while performing operations too: </br>
Eg:  area = rect1.length * rect1.breadth;

___

### Constructors

* used to initialize objects at the time of creation
* a special type of method
* no return type
* returns the instance of the  class

Eg:
```java
classs Rectangle
{
	int length, width;
	Rectangle( int m, int n)		//constructor method
	{
		length=m;
		width=n;
	}
	int rectArea()
	{
		return (length*width);		//normal method
	}
}
```
* to make a constructor automatically assign default values to the object, a non-parameterised constructor can also be made.
Eg: </br>
Rectangle()</br>
{ </br>
	length=0; </br>
	width=0; </br>
}


 ___

[Table of contents](#Table-of-contents)

___

### Method-Overloading

* using methods with same name but different parameter-list and different definitions.
* used when objects have to perform similar tasks but using different input parameters.
* difference can be in no. or type of parameters.
* when a method is called, first the __method name__ is matched up and then the __parameter-list__.
* known as __polymorphism__.
* return type does not play any role here.
Eg:
```java
class Room
{
	float length, breadth;
	Room(float x, float y)			//constructor1
	{
		 length=x;
		 breadth=y;
	}
	Room(float x)			//constructor2
	{
		 length=breadth=x;
	}
	Room()			//constructor3
	{
		 length=0;
		 breadth=0;
	}
	int area()
	{
		return(length*breadth);
	}
}
```
Now, overloading the constructor method Room(). </br>
Room r1=new Room( 3.4  ,8.9 );		//using constructor1 </br>
Room r2=new Room( 12.3 );		//using constructor2 </br>
Room r3=new Room();		//using constructor3 </br>  

___

### Static-members

* a  member that is common to all objects and accessed without using a particular object.
* that member belongs to the class as a whole, rather than the objects created from the class.
* often referred to as _class variables_ and _class methods_.
* java creates only one copy for a static variable.
* can be used even if the class is never actually instantiated.
* also available for use by other classes.
* a static variable can be used to keep a count of how many objects of the class have been created.
* a static method can be used as those methods which dont directly affect the instance of the class.
Eg: </br>
__static__ int count;	</br>
__static__ int max(int x, int y);	</br>

* A very good example of class method is __Math.sqrt( )__, __sqrt__ is a class method of the class __Math__.

___

[Table of contents](#Table-of-contents)

___

### Nesting-of-methods

* some ways of calling methods is by the object of the class or the class itself, using the dot operator.
* but, it can also be called by its own name only, by another method of the same class.
* this is known as _nesting of methods_. [Example](https://github.com/IslaBlairSaloni/java/blob/main/NestingTest.java)

___

### Inheritance

* the mechanism of deriving a new class from an old one is called inheritance.
* the __old__ class is known as the __base class__ or __super class__ or __parent class.__
* the __new__ class is known as the __sub class__ or __derived class__ or __child class.__
* Different forms of inheritance:
	* Single inheritance - ( Only ONE super class)
	* Multiple inheritance - (SEVERAL super classes)
	* Hierarchical iheritance - (ONE super class, MANY subclasses)
	* Multilevel inheritance - (derived from a derived class)
	
> java does not directly implement multiple inheritance, it is done by using a secondary path known as __interfaces.__

 ![Types](https://github.com/IslaBlairSaloni/java/blob/main/inher.PNG)
 
 #### Defining a subclass

```java
class subclassname extends superclassname
{
	//variables declaration
	//methods declaration
}
```
* the keyword __extends__ signifies that the properties of _superclassname_ are extended to the _subclassname._
* subclass will now have its own members as well as those of the superclass too.

__Subclass constructor__

* used to construct variables of both subclass and superclass.
* subclass constructor uses keyword __super__ to invoke the constructor method of supeclass.
	* __super__ may only be used inside a subclass constructor method.
	* the call to super class constructor must appear __first__ within the subclass constructor.
	* the parameters in the call must match the order and type of instance variables declared in the super class.

[Example](https://github.com/IslaBlairSaloni/java/blob/main/Inher.java)



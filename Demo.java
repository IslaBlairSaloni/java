//Inheritance
class Marks
{ 
  int a; 
  public Marks(int a) 
  { 
    this.a=a; 
  } 
  public Marks() 
  { 
    System.out.println("marks default");
  } 
  public void dispM()
  { 
    System.out.println("a= "+a); 
  }
} 
class Student extends Marks
{ 
  int id; String name; 
  public Student(int i, String s, int m) 
  { 
   super(m);  
   id=i; 
   name=s;
  } 
  public Student() 
  { 
   System.out.println("Student defualt");
  } 
  public void dispS() 
  { 
   System.out.println("id= "+id+" name= "+name); 
   dispM();
  } 
} 
class Comment extends Student
{ 
 String com; 
 public Comment(int i, String s, int m, String c)
 {  
   super(i,s,m);
   com=c; 
 } 
 public Comment() 
 { 
  System.out.println("default comment"); 
 } 
 public void dispC() 
 {  
  System.out.println(" comment= "+com); 
  dispS(); 
 } 
} 

public class Demo
{ 
 public static void main(String ar[])
 { 
   Marks M1= new Marks(4); 
   M1.dispM();
   Student S1= new Student(1,"rik",6);
   S1.dispS(); 
   Comment C1= new Comment(); 
   C1.dispC();
 } 
}

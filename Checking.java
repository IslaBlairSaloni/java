//Checking concept of abstract clsses and methods
class Animal        //parent
{
  int x,y,z;
  void func1()      //normal parent function
  {
      System.out.println("This is a method of parent class");
  }
  static void func2()       //static parent function
  {
      System.out.println("This is the static method of parent classs");
  }
  final void func3()        //final parent function
  {
      System.out.println("this method cannot change its body");
  }
}

class Dog extends Animal     //normal child
{
    Dog()
    {
         //initializing parents variables
         super.x=5;
         super.y=6;
         super.z=7;
    }
    void sniff()        //a normal method
    {
        System.out.println("in a normal child class, x.y.z= "+super.x+super.y+super.z);
        super.func1();      //method of parent
        Animal.func2();     //static method of parent
        super.func3();      //final method of parent
    }
}

abstract class Human extends Animal     //abstract class inheriting parent class
{
    abstract void smart();      //abstract method-1
    abstract void selfish();        //abstract method-2
    void func4()        //normal function in abstract class
    {
        System.out.println("Human abstract class");
    }
    final void func5()      //final function in abstract class
    {
      System.out.println("this method cannot change its body");
    }
}

class Girl extends Human        //inheriting abstract class
{
    void smart()        //implementing abstract method-1
    {
        System.out.println("overriden abstract smart");
    }
    void selfish()      //implementing abstract method-2
    {
        System.out.println("overriden abstract selfish");
    }
    void func5()        //trying to override a final method
    {
        System.out.println("final method's body changed successfully");
    }
}

abstract class Boy extends Human      //abstract child of abstract class
{
    void func4()        //overriding func4 of abstract class
    {
        System.out.println("overriden abstract func4");
    }
}

class Men extends Boy       //extending an abstract child
{
    void method()     
    {
        System.out.println("extended an abstract child");
        func4();
    }
    
}

public class Checking
{
    public static void main(String args[])
    {
        //Animal->Dog   Animal->abs_Human->Girl,abs_Boy  abs_Boy->Men
        
        //Animal
        Animal ob1=new Animal();
        ob1.func1(); 
        Animal.func2(); 
        ob1.func3();
        //Dog
        Dog ob2=new Dog();
        ob2.sniff();
        //Girl
        Girl ob3=new Girl();
        ob3.smart();   
        ob3.selfish();  
        ob3.func5();
        //Men
        Men ob4=new Men();
        ob4.method();
        
    }
}

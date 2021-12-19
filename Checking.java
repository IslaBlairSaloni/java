//Checking concept of abstract clsses and methods
class Animal        //parent
{
  int x,y,z;
  void func1()      //normal parent function
  {
      System.out.println("This is a method of animal class");
  }
  static void func2()       //static parent function
  {
      System.out.println("This is the static method of animal class");
  }
  final void func3()        //final parent function
  {
      System.out.println("this method cannot change its body(animal)");
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
        System.out.println("in a normal child class(dog), x.y.z= "+super.x+super.y+super.z);
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
      System.out.println("this method cannot change its body(human)");
    }
}

class Girl extends Human        //inheriting abstract class
{
    void smart()        //implementing abstract method-1
    {
        System.out.println("(girl)overriden abstract smart");
    }
    void selfish()      //implementing abstract method-2
    {
        System.out.println("(girl)overriden abstract selfish");
    }
  /*   void func5()        //trying to override a final method will generate error
    {
        System.out.println("final method's body changed successfully");
    }*/
}

abstract class Boy extends Human      //abstract child of abstract class
{
    void func4()        //overriding func4 of abstract class
    {
        System.out.println("(boy)overriden abstract func4");
    }
}

class Men extends Boy       //extending an abstract child
{
    void method()     
    {
        System.out.println("(men)extended an abstract child");
        func4();
    }
   //not adding implementation of abstract method of abstract grandparent human class will generate error
    void selfish()      //implementing abstract method-2
    {
        System.out.println("(men)overriden abstract selfish");
    }
    void smart()        //implementing abstract method-1
    {
        System.out.println("(men)overriden abstract smart");
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

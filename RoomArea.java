/* note that file name is the class name that
 contains the main method */ //documentation 

class Room //class definition
{
 float length;
 float breadth;
 void getData(float a, float b)
 {
   length=a;
   breadth=b; 
 }
}
class RoomArea //class for main method
{
 public static void main(String args[])
 { 
  float area;
  Room R1=new Room(); //Room type object declaration
  R1.getData(14.1,10.2); 
  area=R1.length*R1.breadth;
  System.out.println("area="+area);
 }
}

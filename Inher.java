//Single inheritance
class Room
{
    float length, width;
    Room(float x, float y)
    {
        length=x;
        width=y;
    }
    float area()
    {
        return length*width;
    }
}
class BedRoom extends Room   //inheriting Room

{
    float height;
    BedRoom(float x, float y, float z)
    {
        super (x,y);    //passing values to superclass
        height=z;
    }
    float volume()
    {
        return length*width*height;
    }
}
public class Inher
{
    public static void main(String args[])    //main method
    {
        BedRoom br1=new BedRoom(1.2f,4.5f,6.5f);
        float a=br1.area();    //super class method
        float v=br1.volume();   //subclass method
        System.out.print("area: "+a+" volume: "+v);
    }
}

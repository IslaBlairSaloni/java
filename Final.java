final class ap extends bp
{ 
   final int a,c=8;
   int b;
   public ap()
   { 
    System.out.println("a initialised");
    a=8/2;
    b=1;
   } 
   public ap(int i, int j)
   { 
     a=i; b=j; 
   }
   public ap(int m) 
   { 
     a=m; 
   }
   public final void disp()
   {
    System.out.println(a+" "+b+" "+c);
    dispbp();
   }
} 
class bp
{ 
  int d; 
  public bp()
  { 
   d=9;
  }
  public void dispbp()
  {
   System.out.println(" "+d); 
  }
}
public class Final
{
  public static void main(String ag[])
  { 
    ap apple=new ap();
    apple.disp();
  }
}

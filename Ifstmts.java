class Ifstmts
{
  public static void main(String args[])
  {
    int a=7,b=9,c;
    //simple if
     if(a>b)
      c=a-b;
     System.out.println("c= "+c);
    
    //if-else
     if(a>b)
       c=a-b;
     else
       c=b-a;
     System.out.println("c= "+c);
    
    //nested if else
    if(a>b)
    {
      if(b!=0)
        c=a-b;
      else 
        c=a;
    }
    else
      c=b-a;
    System.out.println("c= "+c);
    
   //else-if ladder
    if(a>b)
      c=a-b;
    else if (a==b)
      c=0;
    else 
      c=b-a;
  }
}

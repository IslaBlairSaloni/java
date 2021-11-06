class Nesting 
{ 
	int m, n;
  Nesting (int x, int y)          //constructor method
  {
    m=x;
    n=y;
  }

	int largest()
	{
		if(m>=n)
			return m;
		else
			return n;
	}
	void display()
	{
		int large=largest();      //calling the method largest() inside the method display()
		System.out.println("largest value"+large);
	}
}
class NestingTest
{
    public static void main(String args[])
    {
      Nesting nest = new Nesting(50,40);      //creating an object
      nest.display();
    }
}

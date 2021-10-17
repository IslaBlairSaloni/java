class Swtch
{
  public static void main(String args[])
  {
    //printing week day using switch cases
    int i;
    i=6;
    switch(i)
    {
      case 1: 
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3: 
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5: 
        System.out.println("Friday");
        break;
      case 6:                             //this case will be matched
        System.out.println("Saturday");
        break;
      case 7: 
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Wrong entry");
    }
  }
}
    

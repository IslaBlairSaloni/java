public class Bitwise  
{   
public static void main(String[] args)   
{   
  // bitwise OR
     int x = 9, y = 8;   
     // 1001 | 1000 = 1001 = 9  
     System.out.println("x | y = " + (x | y));  
  // bitwise AND
     int x = 9, y = 8;    
     // 1001 & 1000 = 1000 = 8  
     System.out.println("x & y = " + (x & y));   
  // bitwise XOR
     int x = 9, y = 8;   
     // 1001 ^ 1000 = 0001 = 1  
     System.out.println("x ^ y = " + (x ^ y));   
 // bitwise compliment  
    int x = 2; 
    // ~0010= 1101 = -3  
    System.out.println("~x = " + (~x)); 
 // bitwise left shift (signed)
    int x = 12;   
    // 12 in binary is 1100, so it will become 11000 (preserving the sign bit)
    System.out.println("x<<1 = " + (x << 1));   
 // bitwise right shift (signed)
    int x = 50;   
    // 50 in binary is 110010, so it will become 001100 (preserving the sign bit)
    System.out.println("x>>2 = " + (x >>2));
 // bitwise right shift (unsigned)
    int x = 20;   
    // 20 in binary is 10100, so it will become 00101 (shifting to left most position)
    System.out.println("x>>>2 = " + (x >>>2)); 
}  
} 

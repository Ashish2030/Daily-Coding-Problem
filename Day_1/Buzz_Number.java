import java.io.*;
import java.util.*;
class  Buzz_Number
{
    
    public static void BuzzNumber(int a)
    {
       if(a%10==7||a%7==0)
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
   
    }
	public static void main (String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   BuzzNumber(a);
	}
}
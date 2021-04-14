import java.io.*;
import java.util.*;

class Sunny_Number
{
    
    public static void SunnyNumber(int a)
    {
      int sun=a+1;
      double temp=Math.sqrt(sun);
      if(temp-Math.floor(temp)==0)
      {
          System.out.println("Sunny Number");
      }
      else
      {
           System.out.println("Not a Sunny Number");
      }
    }
	public static void main (String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   SunnyNumber(a);
	}
}
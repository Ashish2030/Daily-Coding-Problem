import java.io.*;
import java.util.*;

class Tech_Number
{
    
    public static void TechNumber(int a)
    {
      String l=String.valueOf(a);
      int height=l.length();
      if(height%2==0)
      {
          String temp1=l.substring(0,height/2);
          String temp2=l.substring(height/2);
          int sum=Integer.parseInt(temp1)+Integer.parseInt(temp2);
          if(a==(int)Math.pow(sum,2))
          {
                System.out.println("It is Tech_Number");
          }
          else
          {
             System.out.println("Not a Tech_Number"); 
          }
          
      }
      else
      {
          System.out.println("Not A Tech_Number");
      }
    }
	public static void main (String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   TechNumber(a);
	}
}
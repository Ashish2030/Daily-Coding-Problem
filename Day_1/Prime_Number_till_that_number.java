import java.io.*;
import java.util.*;

class Prime_Number_till_that_number
{
	public static void main (String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  for(int i=2;i<=a;i++)
	  {
	      int flag=0;
	      if(i==2)
	      {
	          System.out.println(i+ " Prime");
	          continue;
	      }
	     for(int j=2;j<i;j++)
	     {
	         if(i%j==0)
	         {
	             flag=1;
	             break;
	         }
	     }
	     if(flag==1)
	     {
	         System.out.println(i+ " Not Prime"); 
	     }
	     else
	     {
	         System.out.println(i+ " Prime"); 
	     }
	  }

	}

}
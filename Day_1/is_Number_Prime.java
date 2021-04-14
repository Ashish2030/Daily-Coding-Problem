import java.io.*;
import java.util.*;

class is_Number_Prime
{
	public static void main (String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  if(a==2)
	  {
	      System.out.println("Prime") ; 
	  }
	  else
	  {
	  for(int i=2;i<a;i++)
	  {
	      if(a%i==0)
	      {
	          flag=1;
	          break;
	      }
	  }
	  if(flag==1)
	  {
	    System.out.println("Not Prime")  ;  
	  }
	  else
	  {
	        System.out.println("Prime") ;
	  }
	  }
	}
}
import java.io.*;
import java.util.*;
class Armstrong_Number 
{
	public static void main (String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int pointer=a;
	   int sum=0;
	   while(a>0)
	   {
	       int temp=a%10;
	       sum=sum+(int)Math.pow(temp,3);
	       a=a/10;
	   }
	   if(sum==pointer)
	   {
	     System.out.println("Its a Armstrong_Number");  
	   }
	   else
	   {
	    System.out.println("Its not a Armstrong_Number");   
	   }
	   
	}
}
import java.io.*;
import java.util.*;

class factorial_Number 
{
	public static void main (String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int fact=1;
	   while(a>1)
	   {
	       fact=fact*a--;
	       
	   }
	   System.out.println(fact);
	}
}
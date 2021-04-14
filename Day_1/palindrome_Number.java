import java.io.*;
import java.util.*;

class palindrome_Number {
	public static void main (String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   StringBuffer st=new StringBuffer(String.valueOf(a));
	   st.reverse();
	   if(a==Integer.parseInt(st.toString()))
	   {
	       System.out.println("Yes");
	   }
	   else
	   {
	        System.out.println("No");
	       
	   }
	}
}
import java.io.*;
import java.util.*;
class  ISBN_Number
{
    public static void  ISBNNumber(int h)
    {
       int sum=0;
       int count=1;
       if(String.valueOf(h).length()==10)
       {
           while(h>0)
           {
               sum=sum+count*(h%10);
               h=h/10;
               count++;
           }
           if(sum%11==0)
           {
             System.out.println("Yes");  
           }
           else
           {
               System.out.println("No");  
           }
       }
        else
        {
               System.out.println("No");  
        }
   
    }
	public static void main (String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int h=sc.nextInt();
	   ISBNNumber(h);
	   
	}
}
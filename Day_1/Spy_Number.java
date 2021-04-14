import java.io.*;
import java.util.*;
class  Spy_Number
{
    
    public static void  Spy(int a)
    {
        int temp=a;
        int sum=0;
        int product=1;
        while(a>0)
        {
            sum=sum+a%10;
            product=product*a%10;
            a=a/10;
        }
        if(sum==product)
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
	   Spy(a);
	}
}
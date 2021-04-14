import java.io.*;
import java.util.*;
class  Neon_Number
{
    
    public static void  NeonNumber(int a)
    {
     
    int temp=(int)Math.pow(a,2);
    int sum=0;
    while(temp>0)
    {
        sum=sum+temp%10;
        temp=temp/10;
    }
    if(sum==a)
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
	   NeonNumber(a);
	}
}
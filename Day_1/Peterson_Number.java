import java.io.*;
import java.util.*;
class Peterson_Number 
{
    public static void Peterson(int a)
    {
        int pointer=a;
        int sum=0;
        while(a>0)
        {
            int fact=1;
            int z=a%10;
            while(z>0)
            {
                fact=fact*z;
                z--;
            }
            sum=sum+fact;
            a=a/10;
        }
        if(sum==pointer)
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
	    Peterson(a);
	}
}
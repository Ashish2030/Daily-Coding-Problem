import java.io.*;
import java.util.*;
class  Evil_Number
{
    
    public static void EvilNumber(int h)
    {
        String h1=Integer.toBinaryString(h);
        int count=0;
        for(int i=0;i<h1.length();i++)
        {
            if(h1.charAt(i)=='1')
            {
                count++;
            }
        }
        if(count%2==0)
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
	   int h=sc.nextInt();
	   EvilNumber(h);
	   
	}
}
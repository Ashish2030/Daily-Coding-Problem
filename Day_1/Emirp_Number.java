import java.io.*;
import java.util.*;
class   Emirp_Number
{
    public static void  EmirpNumber(int h)
    {
       StringBuffer j=new StringBuffer(String.valueOf(h));
       String k=j.reverse().toString();
       int k1=Integer.valueOf(k);
       int count=0;
       int flag=0;
       for(int i=2;i<=h/2;i++)
       {
           if(h%i==0)
           {
               flag=1;
               break;
           }
       }
       if(flag==0)
       {
            for(int i=2;i<=k1/2;i++)
            {
                if(k1%i==0)
                {
                flag=1;
                break;
                }
            }
            if(flag==0)
            {
                 System.out.println("it is  a  Emirp_Number ");
            }
            else
            {
                 System.out.println("Not a   Emirp_Number");
            }
       }
       else
       {
           System.out.println("Not a   Emirp_Number");
           
           
       }
     
   
    }
	public static void main (String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int h=sc.nextInt();
	   EmirpNumber(h);
	   
	}
}
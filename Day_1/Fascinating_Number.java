import java.io.*;
import java.util.*;
class Fascinating_Number
{
    
    public static void FascinatingNumber(int a)
    {
     int temp=a*2;
     int  temp1=a*3;
     String h=String.valueOf(a)+String.valueOf(temp)+String.valueOf(temp1);
     if(h.length()==9)
     {
         Set<Character> set=new HashSet<>();
         for(int i=0;i<h.length();i++)
         {
             set.add(h.charAt(i));
         }
         if(set.contains('0')||set.size()!=9)
         {
            System.out.println("Not a Fascinating Number") ;
         }
         else
         {
             System.out.println("Fascinating Number");
         }
         
     }
     else
     {
         System.out.println("Not a Fascinating Number");
     }
     
    }
	public static void main (String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   FascinatingNumber(a);
	}
}
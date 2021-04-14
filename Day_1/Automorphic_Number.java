import java.io.*;
import java.util.*;
class Automorphic_Number 
{
    public static void Automorphic(int a)
    {
        int num=(int)Math.pow(a,2);
        String h=String.valueOf(num);
        String h1=String.valueOf(a);
        int length=h.length()-h1.length();
        String compare=h.substring(length);
        if(h1.equals(compare))
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
	    Automorphic(a);
	}
}
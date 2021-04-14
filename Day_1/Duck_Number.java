import java.io.*;
import java.util.*;
class  Duck_Number
{
    
    public static void DuckNumber(String h)
    {
        if(h.charAt(0)!='0')
        {
            if(h.contains("0"))
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
	   String h=sc.nextLine();
	   DuckNumber(h);
	   
	}
}
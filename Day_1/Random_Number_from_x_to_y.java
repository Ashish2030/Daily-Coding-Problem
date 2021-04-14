import java.io.*;
import java.util.*;
class Random_Number_from_x_to_y
{
	public static void main (String[] args)
	{
	    int min=100;
	    int max=400;
	  int x=(int)(Math.random()*(max-min+1)+min);  
	  System.out.println(x);
	 
	}
}
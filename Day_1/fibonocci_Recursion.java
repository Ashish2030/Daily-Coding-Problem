import java.util.*;
class fibonocci_Recursion
{
    public static  int recursion(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1||num==2)
        {
            return 1;
        }
        else
        {
            return recursion(num-2)+recursion(num-1);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
         for(int i=0;i<number;i++)
         {
             System.out.print(recursion(i)+" ");
         }
    }
    
}
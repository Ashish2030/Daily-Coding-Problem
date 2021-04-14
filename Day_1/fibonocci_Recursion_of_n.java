import java.util.*;
class fibonocci_Recursion_of_n
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
             System.out.print(recursion(number));
    }
}
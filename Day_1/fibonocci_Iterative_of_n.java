import java.util.*;
class fibonocci_Iterative_of_n
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int first=0;
        int second=1;
        int temp=0;
         for(int i=2;i<number;i++)
         {
             temp=first+second;
             first=second;
             second=temp;
    
         }
         System.out.println(temp);
    }
    
}
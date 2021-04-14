import java.util.*;
class fibonocci_Iterative
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int first_no=0;
        int second_no=1;
        System.out.print(first_no+" "+second_no);
        for(int i=2;i<number;i++)
        {
            int temp=first_no+second_no;
            System.out.print(" "+temp);
            first_no=second_no;
            second_no=temp;
        }
    }
    
}
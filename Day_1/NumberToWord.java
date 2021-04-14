    class NumberToWord 
    {  
   
    static void numberToWords(char num[])  
    {  
    
        int len = num.length; // length of number 
          
        if (len == 0)   
        {  
           
        System.out.println("The string is empty.");  
        return;  
        }  
       
        if (len > 4)   
        {  
          
        System.out.println("\n The given number has more than 4 digits.");  
        return;  
        }  
         
        String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
         
    
        String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
        
        String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
        
        String[] poweroftens = new String[] {"Hundred", "Thousand"};  
        
        System.out.print(String.valueOf(num) + ": ");  
         
        if (len == 1)   
        {  
        System.out.println(onedigit[num[0]-'0']);  
        return;  
        }  
        int x = 0;  
          
            while (x < num.length)   
            {  
            
                if (len >= 3)   
                {  
                    if (num[x] - '0' != 0)   
                    {  
                    System.out.print(onedigit[num[x] - '0'] + " ");  
                
                    System.out.print(poweroftens[len - 3]+ " ");  
                    }  
                    len--;  
                }  
             
                else   
                {  
               
                    if (num[x] - '0' == 1)   
                    {  
                        int sum = num[x] - '0' + num[x + 1] - '0';  
                        System.out.println(twodigits[sum]);  
                        return;  
                    }  
                        //the else-if statement handles the number 20 only  
                        //compares the tens and unit place with 2 and 0 respectively  
                    else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
                    {  
                  
                        System.out.println("Twenty");  
                        return;  
                    }  
                    //the else block handles the numbers from 21 to 100  
                    else   
                    {  
                        int i = (num[x] - '0');  
                        if (i > 0)  
                             System.out.print(multipleoftens[i]+ " ");  
                        else  
                            System.out.print("");  
                        //increments the variable i by 1  
                        ++x;  
                        //checks whether the number is not equal to zero, it means the number has only a digit  
                        if (num[x] - '0' != 0)  
                        //prints the ith index element of the array onedigit[]  
                        System.out.println(onedigit[num[x] - '0']);  
                    }  
                }  
                 
            ++x;  
            }  
    }  
    public static void main(String args[])  
    {  
    numberToWords("1111".toCharArray());  
    numberToWords("".toCharArray());  
    }  
    }  
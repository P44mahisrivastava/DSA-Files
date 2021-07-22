import java.util.*;
public class reverse_a_number
{
   public static void main(String args[])
   {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       n=sc.nextInt();
       int rem,temp;
       temp=n;
       int sum=0;
       while(n>0)
       {
           rem=n%10;
           sum=sum*10+rem;
           n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("palindrome");
        }
        else
        {
        System.out.print("not");
        }
        System.out.println("\nreverse of number is:"+sum);
        
    }
}
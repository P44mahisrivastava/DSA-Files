import java.util.Scanner;
public class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     int size;
     System.out.println("Enter Array Size:");
     size=sc.nextInt();//entering size of array
     int a[]=new int[size];//declaration of array
     System.out.println("Enter the array elements:");
     for(int i=0;i<size;i++)
     {
         a[i]=sc.nextInt();
        }
        System.out.println("display array elements:");
        for(int i=0;i<size;i++)
         {
             System.out.println(a[i]);
            }
        }
    }

     
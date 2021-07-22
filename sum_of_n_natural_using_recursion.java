public class sum_of_n_natural_using_recursion
{
    
    // using recursion
    public static int sum(int n)
    {
        if (n==1)
        return 1;
        else
        return n+sum(n-1);
    }
    //not using recursion
    public static int sum1(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
            
    public static void main(int n)
    {
        System.out.println(sum1(n));
        System.out.println(sum(n));
    }
        
        
}

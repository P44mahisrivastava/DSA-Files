public class two_no_arr_sum
{
   public static boolean sum(int arr[],int target)
   {
       int first=0;
       int last=arr.length-1;
       int sum=0;
       while(first<last)
       {
           sum=arr[first]+arr[last];
           if(sum>target)
           {
               first++;
            }
            else if(sum<target)
            {
                last--;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
       int arr[]={1,2,3,4,5,10};
        int target=11;
        System.out.println(sum(arr,target));
        
    }
}
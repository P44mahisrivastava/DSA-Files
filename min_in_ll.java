import java.util.*;
public class min_in_ll
{
    static class Node
    {
        int data;
        Node next;
    }
    public static Node creation(int n)
    {
        Scanner sc=new Scanner(System.in); //creation of node number 1
        System.out.println("Enter your data:");
        int value=sc.nextInt();
        Node head=new Node();
        Node temp1=head;
        temp1.data=value;
        temp1.next=null;
        while(n>1)
        {
            System.out.println("Enter your data:");
            value=sc.nextInt();
            Node temp2=new Node();
            temp2.data=value;
            temp1.next=temp2;//linking node1 with node 2
            temp1=temp1.next;
            n--;
        }
    
        return head;
   }
   static int smallestElement(Node head)
{
    int min = Integer.MAX_VALUE;
    while (head != null)
    {
        if (min > head.data)
            min = head.data;
 
        head = head.next;
    }
    return min;
}
static int largestElement(Node head)
{
    int max = Integer.MIN_VALUE;
    while (head != null)
    {
        if (max < head.data)
            max = head.data;
        head = head.next;
    }
    return max;
}
    public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        min_in_ll obj=new min_in_ll();
        System.out.println("Enter value of n:");//size of linked list
        int n=sc.nextInt();
        Node head=creation(n);
        Node temp=head;
        int count=0;
        System.out.println("linked list:");
        while(temp!=null)
        {
        
        System.out.print(temp.data+"-->");
          temp=temp.next;
        }
    System.out.print("null");
    int min=obj.smallestElement(head);
    System.out.println("\nminimum element is="+min);
    int max=obj.largestElement(head);
    System.out.println("\nlargest element="+max);
}
}

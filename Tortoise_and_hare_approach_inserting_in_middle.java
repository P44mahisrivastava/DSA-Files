//in this approach we use two pointers first pointer slow(tortoise) and second pointer fast(hare) we increase slow by 1time and fast 2times,both points to head.
import java.util.*;
public class Tortoise_and_hare_approach_inserting_in_middle
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
    static Node tortoise_and_hare(int data,Node head)
    {
        Node temp=new Node();
        temp.data=data;
        temp.next=null;
        Node slow,fast;
        slow=fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp1=slow.next;
        slow.next=temp;
        temp.next=temp1;
        System.out.println("Middle node is:"+slow.data);
        return head;
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");//size of linked list
        int n=sc.nextInt();
        Node head=creation(n);
        System.out.println("enter data to be inserted at middle:");
        int d=sc.nextInt();
        Node t=tortoise_and_hare(d,head);
        System.out.println("Printing new link list:");
        Node temp=head;
        while(temp!=null)
        {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    
}
}

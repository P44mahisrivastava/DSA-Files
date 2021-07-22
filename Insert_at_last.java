import java.util.*;

import java.util.*;
public class Insert_at_last
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
    static Node insert_at_Last(int data,Node head)
    {
        Node temp=new Node();
        temp.data=data;
        temp.next=null;
        Node head2=head;
        while(head2.next!=null)
        {
        head2=head2.next;
        }
        head2.next=temp;
        return head;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");//size of linked list
        int n=sc.nextInt();
        Node head=creation(n);
        System.out.println("enter data to be inserted at last:");
        int d=sc.nextInt();
        Node tempp=insert_at_Last(d,head);
        System.out.println("Printing new link list:");
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
        count++;
        System.out.println(temp.data+" "+temp);
        temp=temp.next;
    }
    System.out.println("Length of linked list:"+count);
}
}   


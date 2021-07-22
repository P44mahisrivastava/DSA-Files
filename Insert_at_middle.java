import java.util.*;
public class Insert_at_middle
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
    static Node insert_At_middle(int data,Node head)
    {
        Node temp=new Node();
        temp.data=data;
        temp.next=null;
        Node temp1=head;
        int l=0;
        while(temp1!=null)
        {
            l++;
            temp1=temp1.next;
        }
        int middle=l/2;
        Node  temp2=head;
        int c=0;
        while(c<middle)
        {
            temp2=temp2.next;
            c++;
        }
        Node temp3=temp2.next;
        temp2.next=temp;
        temp.next=temp3;
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
        Node t=insert_At_middle(d,head);
        System.out.println("Printing new link list:");
        Node temp=head;
        while(temp!=null)
        {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
}

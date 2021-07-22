import java.util.*;
public class creation_of_LL
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
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
}
}

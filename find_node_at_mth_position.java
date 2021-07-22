
import java.util.*;
public class find_node_at_mth_position
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
    static int count(Node head)
    {
        Node temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    static void mthNode(Node head,int m)
    {
        Node temp=head;
        int arr[]=new int[count(temp)];
        int index=0;
        while(temp!=null)
        {
            arr[index]=temp.data;
            index++;
            temp=temp.next;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println("Node at "+(i+1)+"position is:"+ arr[i]);
        }
            int i=(arr.length-1)-m+1;
                System.out.println(m+" node from back is:"+arr[i]);
        }
        
            
            
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");//size of linked list
        int n=sc.nextInt();
        System.out.println("enter m value:");
        int m=sc.nextInt();
        Node head=creation(n);
        Node temp=head;
        while(temp!=null)
        {
        System.out.println(temp.data+" "+temp);
        temp=temp.next;
        }
       int t=count(head);
       mthNode(head,m);
    
    
}
}


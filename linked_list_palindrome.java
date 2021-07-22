import java.util.*;
public class linked_list_palindrome
{
      static class Node
    {
        int data;
        Node next;
    }
    public static Node creation(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data:");
        int value=sc.nextInt();
        Node head=new Node();
        Node temp1=head;
        temp1.data=value;
        temp1.next=null;
        while(n>1)
        {
            System.out.println("enter data:");
            value=sc.nextInt();
            Node temp2=new Node();
            temp2.data=value;
            temp2.next=null;
            temp1.next=temp2;
            temp1=temp1.next;
            n--;
        }
        return head;
    }
       static int length(Node head) 
        {
            Node temp=head;
             int l=0,arr[];
            while(temp!=null)
            {
                l++;
                temp=temp.next;
            }
            return l;
        }
        static void reverse(Node head)
        {
            Node temp=head;
            int arr[]=new int[length(head)];
            int index=0,l=0;
            while(temp!=null)
            {
                arr[index]=temp.data;
                
                index++;
                temp=temp.next;
                
            }
            System.out.println("Linked list in reverse order:");
            for(int i=arr.length-1;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("\nChecking for palindrome:");
            int flag = 0;
        for (int i = 0; i <= arr.length/ 2 && arr.length!= 0; i++) 
        {
            if (arr[i] != arr[arr.length - i - 1])
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of linked list:");
        int n=sc.nextInt();
        Node head=creation(n);
        System.out.println("lisked list:");
        Node temp=head;
        while(temp!=null)
        {
            
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("size="+length(head));
        reverse(head);
    }
}


   
  
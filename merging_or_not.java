//Given head of two linked list ,find whether if 2 LL are merging or not and find node at which they are merging
import java.util.Scanner;
public class merging_or_not
{
    static Node head1=new Node();
    static Node head2=new Node();
    static class Node
    {
        int data;
        Node next;
    }
    static Node creation1(int n1)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data:");
        int value=sc.nextInt();
        Node head=new Node();
        Node temp1=head;
        temp1.data=value;
        temp1.next=null;
        while(n1>1)
        {
            System.out.println("Enter data:");
            value=sc.nextInt();
            Node temp2=new Node();
            temp2.data=value;
            temp2.next=null;
            temp1.next=temp2;
            temp1=temp1.next;
            n1--;
        }
        return head;
    }
    static int ismerging(Node node1, Node node2) {
        int c1=0;
        int c2=0;
        Node temp1=node1, temp2=node2;
        if (temp1 == null || temp2 == null)
            return -1;
 
        // Find the length of both linked list
        while(temp1 != null){
            c1++;
            temp1 = temp1.next;
        }
        while(temp2 !=null){
            c2++;
            temp2 = temp2.next;
        }
 
        int difference = 0;
        Node ptr1=node1;
        Node ptr2=node2;
 
        
        if(c1 > c2){
            difference = c1-c2;
            int i=0;
            while(i<difference){
                ptr1 = ptr1.next;
                i++;
            }
        }else{
            difference = c2-c1;
            int i=0;
            while(i<difference){
                ptr2 = ptr2.next;
                i++;
            }
        }
        while(ptr1 != null && ptr2 != null){
            if(ptr1.data == ptr2.data){
                return ptr1.data;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
 
        return -1;
    }
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of LL1:");
            int n1=sc.nextInt();
            System.out.println("Enter the size of LL2:");
            int n2=sc.nextInt();
            System.out.println("for LL1:");
            head1=creation1(n1);
            System.out.println("For LL2:");
            head2=creation1(n2);
            System.out.println("Printing LL1:");
            Node temp1=head1;
            while(temp1!=null)
            {
                System.out.print(temp1.data+" ");
                temp1=temp1.next;
            }
            System.out.println("\nPrinting LL2:");
            Node temp2=head2;
            while(temp2!=null)
            {
                System.out.print(temp2.data+" ");
                temp2=temp2.next;
            }
            int merging= ismerging(head1,head2);
        if(merging==-1)
        {
            System.out.println("\nTwo linked lists do not merge!!");
        }
        else
        {
            System.out.println("\nNode is merging & merging node is:"+merging);
        }
    
            
         
        }
    }
            
            
   


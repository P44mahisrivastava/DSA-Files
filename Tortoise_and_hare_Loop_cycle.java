
//find wheather the loop is endless or not if it is endless tell the starting point of loop.
import java.util.*;
public class Tortoise_and_hare_Loop_cycle
{
    static class Node
    {
        int data;
        Node next;
    }
    static Node newNode(int data)
    {
    Node temp = new Node();
    temp.data = data;
    temp.next = null;
    return temp;
    }
    static boolean endless_loop(Node head)
    {
        Node slow=head;
        
        Node fast=head;
        fast=head.next;
        if(head==null)
        {
            return false;
        }
        while(slow!=fast)
        {
            if(fast==null || fast.next==null)
            {
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Loop exists");
        System.out.println(fast.data+" "+slow.data);
        Node temp=head;
        while(temp!=slow)
        {
            temp=temp.next;
            slow=slow.next;
        }
        System.out.println("Starting point of loop is:"+temp.data+" "+slow.data);
        return true;
    }
    public static void main(String args[])
    {
        Node head1 = newNode(1);
        head1.data=1;
        head1.next=null;
        
        Node head2=new Node();
        head2.data=2;
        head2.next=null;
        head1.next=head2;
        
        Node head3=new Node();
        head3.data=3;
        head3.next=null;
        head2.next=head3;
        
        Node head4=new Node();
        head4.data=4;
        head4.next=null;
        head3.next=head4;
        
        Node head5=new Node();
        head5.data=5;
        head5.next=null;
        head4.next=head5;
        
        Node head6=new Node();
        head6.data=6;
        head6.next=null;
        head5.next=head6;
        
        head6.next=head3;
        
       boolean t=endless_loop(head1);
       
    }
}
    
    
   


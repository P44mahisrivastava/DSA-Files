import java.util.*;
public class Delete_node
{
    static class Node
    {
        int data;
        Node next;
    }
    static Node delete_from_begin(Node head)
    {
         
         return head.next;
    }
    static Node delete_from_end(Node head)
    {
        Node temp=head;
        temp=temp.next;
        Node temp1=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            temp1=temp1.next;
        }
        temp1.next=null;
        return head;
    }
    static Node delete_from_middle(Node head)
    {
        Node slow,fast;
        slow=fast=head;
        slow=slow.next;
        fast=fast.next.next;
        Node temp=head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            temp=temp.next;
        }
        temp.next=slow.next;
        slow.next=null;
        return head;
    }
            
    
    public static void main(String args[])
    {
        Node head1=new Node();
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
        
        Node head7=new Node();
        head7.data=7;
        head7.next=null;
        head6.next=head7;
        
       /* Node head=delete_from_end(head1);
        System.out.println("\ndeleting last node:");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }*/
        /*Node begin=delete_from_begin(head1);
        System.out.println("\ndelte from begin:");
        Node t=begin;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }*/
        Node middle=delete_from_middle(head1);
        System.out.println("\ndelete from middle:");
        Node m=middle;
        while(m!=null)
        {
            System.out.print(m.data+" ");
            m=m.next;
        }
        
    
}
}


public class LinkedListDeletion {
     Node head;
     class Node
     {
         int data;
         Node next;
         Node(int data)
         {
             this.data=data;
             next=null;
         }
     }

     void InsertFromFirst(int data)
     {
        Node n=new Node(data);
        n.next=head;
        head=n;
     }

     void insertAfterGivenNode(Node previousnode, int data)
     {
         if(previousnode==null)
         {
             System.out.println("The given previous node cannot be null");
             return;
         }
         Node n=new Node(data);
         n.next=previousnode.next;
         previousnode.next=n;
     }

     void insertAtLast(int data)
     {
         if(head==null)
         {
             Node n=new Node(data);
             n=head;
             return;
         }
         Node n=new Node(data);
         Node last=head;
         while (last.next!=null)
             last=last.next;
         last.next=n;
         return;
     }
     void display()
     {
         Node trace=head;
         while (trace!=null) {
             System.out.print(trace.data+" ");
             trace=trace.next;
         }
     }

     void delete(int data)
     {
         Node temp=head,previous=null;
         if (temp!=null && temp.data==data)
         {
             head=temp.next;
             return;
         }

         while (temp!=null && temp.data!=data)
         {
             previous=temp;
             temp=temp.next;
         }
         if (temp.data==data)
             previous.next=temp.next;
         return;
     }

     void deleteFromGivenPosition(int position)
     {
         if(head==null)
             return;
         Node temp=head;

         if (position==0)
         {
             head=temp.next;
             return;
         }

         for (int i=0;temp!=null && i<position-1;i++)
             temp=temp.next;

         if (temp==null || temp.next==null)
             return;

         Node next=temp.next.next;
         temp.next=next;
     }
    public static void main(String... s)
    {
        LinkedListDeletion lld=new LinkedListDeletion();
        lld.InsertFromFirst(10);
        lld.InsertFromFirst(20);
        lld.InsertFromFirst(30);
        lld.InsertFromFirst(40);
        lld.insertAfterGivenNode(lld.head.next.next,15);
        lld.insertAfterGivenNode(lld.head.next,25);
        lld.insertAtLast(5);
        lld.display();
        System.out.println();
        lld.delete(40);
        lld.delete(5);
        lld.display();
        lld.deleteFromGivenPosition(3);
        System.out.println();
        lld.display();
    }

}

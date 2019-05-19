public class LinkList {
     Node1 head;
   static class Node1 {
        int data;
        Node1 next;
        Node1(int data)
        {
           this.data=data;
            next=null;
        }
    }
    public void display()
    {
        Node1 n=head;
        while(n!=null) {
            System.out.print(n.data + "-->");
            n = n.next;
        }
        System.out.println("NULL");
    }
    public static void main(String... s)
    {
        LinkList l =new LinkList();
        Node1 first=new Node1(10);
        Node1 second=new Node1(25);
        Node1 third=new Node1(37);
        Node1 fourth=new Node1(60);
        l.head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        l.display();
    }

}

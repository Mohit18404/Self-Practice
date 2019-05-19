import javax.swing.plaf.synth.SynthEditorPaneUI;

public class AddLinkList {
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    void insertFromBeg(int data)
    {
        Node newNode=new Node(data);
                newNode.next=head;
                head=newNode;
    }
    void insertFromGivenNode(Node previous,int data)
    {
        if (previous==null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode= new Node(data);
        newNode.next=previous.next;
        previous.next=newNode;
    }
    void insertFromLast(int data)
    {
        if (head==null)
        {
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        newNode.next=null;
        Node last=head;
        while (last.next!=null)
            last=last.next;
        last.next=newNode;
        return;
    }
    void display()
    {
        Node n=head;
        while (n!=null)
        {
          System.out.print(" "+n.data);
          n=n.next;
        }
    }
    public static void main(String... s)
    {
        AddLinkList all=new AddLinkList();
                all.insertFromBeg(10);
                all.insertFromBeg(20);
                all.insertFromBeg(40);
                all.insertFromGivenNode(all.head,30);
                all.insertFromGivenNode(all.head.next,35);
                all.insertFromLast(5);
                all.display();
    }
}

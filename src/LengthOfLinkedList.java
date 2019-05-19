public class LengthOfLinkedList {
    Node head;
    public void push(int data)
    {
        Node node=new Node(data);

    }
    int linkedListLength()
    {
        int length=0;
        return length;
    }
    public static void main(String[] args) {
        LengthOfLinkedList lengthOfLinkedList=new LengthOfLinkedList();
        lengthOfLinkedList.push(10);
        lengthOfLinkedList.linkedListLength();
    }
}
class Node
{
    Node next;
    int data;
    Node(int data)
    {
        data=this.data;
        next=null;
    }
}

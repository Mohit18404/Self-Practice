package LinkedListPractice;

import java.util.HashSet;

public class LoopDetection {
    Node head;
    void push(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
    }
    void display(Node head){
        Node temp=head;
        if (temp==null)
            return;
        while (temp!=null)
            System.out.print(head.data);
        temp=temp.next;
    }
    boolean loopDetect(Node head){
        Node temp=head;
        HashSet<Node> hashSet=new HashSet<Node>();
        while(temp!=null) {
            if(hashSet.contains(temp))
                return true;
            hashSet.add(temp);
            temp=temp.next;
        }
        return false;
    }
    boolean loopDetectFloyd(Node head){
        Node slowPointer=head,fastPointer=head;
        while (slowPointer!=null && fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
            if(slowPointer==fastPointer)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        LoopDetection loopDetection=new LoopDetection();
        loopDetection.push(1);
        loopDetection.push(2);
        loopDetection.push(3);
        loopDetection.push(4);
        loopDetection.push(5);
        loopDetection.push(6);
        loopDetection.head.next.next.next.next.next=loopDetection.head.next;
        //loopDetection.display(loopDetection.head);
        if(loopDetection.loopDetect(loopDetection.head))
            System.out.print("given linkedlist has a loop");
        else
            System.out.print("Given linked list does not have a loop");
        System.out.println();
        if(loopDetection.loopDetectFloyd(loopDetection.head))
            System.out.print("given linkedlist has a loop");
        else
            System.out.print("Given linked list does not have a loop");

    }
}

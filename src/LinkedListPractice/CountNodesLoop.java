package LinkedListPractice;

public class CountNodesLoop {
    Node head;
    void push(int data){
        Node node= new Node(data);
        node.next=head;
        head=node;
    }
    int countNodes(Node nodes){
        int count=1;
        Node temp=nodes;
        while(temp.next!=nodes){
            count=count+1;
            temp=temp.next;
        }
        return count;
    }
    int loopDetect(Node head){
        Node slowPointer=head;
        Node fastPointer=head;
        while(slowPointer!=null && fastPointer!=null && fastPointer.next!=null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer)
                return countNodes(slowPointer);
        }
        return 0;
    }
    public static void main(String[] args) {
        CountNodesLoop countNodesLoop=new CountNodesLoop();
        countNodesLoop.push(1);
        countNodesLoop.push(2);
        countNodesLoop.push(3);
        countNodesLoop.push(4);
        countNodesLoop.push(5);
        countNodesLoop.push(6);
        countNodesLoop.head.next.next.next.next.next.next=countNodesLoop.head.next;
        System.out.println(countNodesLoop.loopDetect(countNodesLoop.head));
    }
}

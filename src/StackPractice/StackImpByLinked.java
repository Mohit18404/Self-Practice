package StackPractice;

public class StackImpByLinked {
    Node head;
    void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        System.out.println(data);
    }

    int pop(Node root){
        if(root==null) {
            System.out.println("stack underflow");
            return 0;
        }
        int popped=root.data;
        System.out.println(popped+" has been popped");
        head=head.next;
        return popped;
    }
    boolean isEmpty(Node n){
        if(n==null)
            return true;
        return false;
    }
    int peak(Node node){
        if(node==null)
            return -1;
        return node.data;
    }
    public static void main(String[] args) {
        StackImpByLinked stackImpByLinked=new StackImpByLinked();
        stackImpByLinked.push(10);
        stackImpByLinked.push(15);
        stackImpByLinked.push(30);
        stackImpByLinked.push(40);
        stackImpByLinked.push(55);
        stackImpByLinked.pop(stackImpByLinked.head);
        System.out.println(stackImpByLinked.peak(stackImpByLinked.head));
    }
}

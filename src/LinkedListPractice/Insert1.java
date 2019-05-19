package LinkedListPractice;

/*
 * @author: mohit5.kumar
 * @created: 19/03/19
 */
public class Insert1 {
    Node head;

    void push(int data) {
        Node node1 = new Node(data);
        node1.next = head;
        head = node1;
    }

    void pushAfter(Node previous, int newData) {
        if (previous == null) {
            return;
        }
        Node node = new Node(newData);
        node.next = previous.next;
        previous.next = node;
    }

    void append(int data) {
        Node last = head;
        if (head == null) {
            head = new Node(data);
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        Node node = new Node(data);
        last.next = node;
        node.next = null;
    }

    void deleteFromStart(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    void deleteFromGivenNode(Node previous){
        if(previous==null){
            return;
        }
        previous.next=previous.next.next;
    }
    void deleteFromLast(){
        Node last=head;
        while (last.next.next!=null){
            last=last.next;
        }
        last.next=null;
    }

    void deleteViaKey(int data){
        Node pointer=head;
        Node previous=null;
        if(pointer!=null && pointer.data==data){
            head=pointer.next;
            return;
        }
        while (pointer!=null && pointer.data!=data){
            previous=pointer;
            pointer=pointer.next;
        }
        if (pointer==null){
            return;
        }
        previous.next=pointer.next;
    }

    void display() {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Insert1 insert1 = new Insert1();
        insert1.push(10);
        insert1.push(15);
        insert1.push(20);
        insert1.push(30);
        insert1.push(40);
        insert1.push(50);

        insert1.display();
        insert1.pushAfter(insert1.head.next.next, 25);
        System.out.println();
        insert1.display();
        insert1.append(5);
        System.out.println();
        insert1.display();
        insert1.deleteFromStart();
        System.out.println();
        insert1.display();
        insert1.deleteFromGivenNode(insert1.head.next);
        System.out.println();
        insert1.display();
        insert1.deleteFromLast();
        System.out.println();
        insert1.display();
        insert1.deleteViaKey(15);
        System.out.println();
        insert1.display();
    }
}

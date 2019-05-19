package LinkedListPractice;

public class Insertion {
    Node head;
    void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    void afterNode(Node previousNode,int data){
        if(previousNode==null){
            System.out.println("the prevoius node can not be null");
            return;
        }
        Node node=new Node(data);
        node.next=previousNode.next;
        previousNode.next=node;
    }
    void addLast(int data){
        Node last=head;
        Node node = new Node(data);
        if(head==null){
            head=node;
            return;
        }
        while (last.next!=null)
            last=last.next;
        last.next=node;
    }
    void printlist(){
        Node printlist=head;
        while (printlist!=null){
            System.out.print(printlist.data+" ");
            printlist=printlist.next;
        }
        System.out.println();
    }
    void deleteFromStart(){
        head=head.next;
    }
    void deleteFromEnd(){
        Node last=head;
        if(head==null)
            return;
        while (last.next.next!=null)
            last=last.next;
        last.next=null;
    }
    void deleteFromMiddle(int data){
        Node temp=head,previous=null;
        if(temp==null)
            return;
        if(temp!=null && temp.data==data){
            head=temp.next;
        }
        while (temp!=null && temp.data!=data){
            previous=temp;
            temp=temp.next;
        }
        previous.next=temp.next;
    }
    void deleteFromPosition(int position){
        Node temp=head;
        if(head==null)
            return;
        if(position==0){
            head=temp.next;
            return;
        }
        for (int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null)
            return;
        temp.next=temp.next.next;
    }
    void deleteLinkedList(){
        head=null;
    }
    void lengthOfLinkedList(){
        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
    int countNodeRec(Node node){
        if(node==null)
            return 0;
        return 1+countNodeRec(node.next);
    }
    int countNode(){
        return countNodeRec(head);
    }
    boolean elementSearchByIterative(int data){
        Node temp=head;
        while (temp!=null) {
            if (temp.data == data) {
                System.out.println("true");
                return true;
            }
            temp=temp.next;
        }
        System.out.println("false");
        return false;
    }
    boolean elementSearchByRecursion(Node head,int data){
        if(head==null) {
            System.out.println("false");
            return false;
        }
        if(head.data==data) {
            System.out.println(true);
            return true;
        }
        return elementSearchByRecursion(head.next,data);
    }
    int dataOnNthLocation(int location){
        Node temp=head;
        int count=0;
        while (temp!=null){
            if(count==location)
                return temp.data;
            temp=temp.next;
            count++;
        }
        return 0;
    }
    int dataOnNthLocationRec(Node head,int location){
        int count=0;
        Node temp=head;
            if(count==location)
                return temp.data;
            return dataOnNthLocationRec(temp.next,location-1);
    }
    void NthNodefromEnd(Node head,int n){
        int length=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            length++;
        }
        if(n>length)
            return ;
        temp=head;
        for(int i=1;i<length-n+1;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    void NthNodefromEndRec(Node head,int n){
        int i=0;
        Node temp=head;
        if(head==null)
            return;
        NthNodefromEnd(temp.next,n);
        if(++i==n)
            System.out.println(temp.data);

    }
    void NthNodeFromLastTwoPointer(Node head,int n){
        Node main=head,reference=head;
        for (int i=0;i<n;i++){
            if(reference==null)
                return;
            reference=reference.next;
        }
        while (reference!=null){
            reference=reference.next;
            main=main.next;
        }
        System.out.println(main.data);
    }
    void middileElement(Node head){
        Node reference=head,main=head;
        if(head==null)
            return;
        while (reference!=null && reference.next!=null){
            reference=reference.next.next;
            main=main.next;
        }
        System.out.println(main.data);
    }
    void middleElement2ndMethod(Node head){
        Node temp=head;
        int counter=0;
        while (temp!=null) {
            counter++;
            temp=temp.next;
        }
        temp=head;
        for (int i=0;i<counter/2;i++)
            temp=temp.next;
        System.out.println(temp.data);
    }
    int frequency=0;
    int countOccuranceRec(Node head,int data){
        Node temp=head;
        if (temp ==null)
            return frequency;
        if(temp.data==data)
            frequency++;
        return countOccuranceRec(temp.next,data);
    }
    int countOccuranceRec2nd(Node head,int data){
        Node temp=head;
        if(temp==null)
            return 0;
        int frequency=countOccuranceRec2nd(temp.next,data);
        if(temp.data==data)
            frequency=frequency+1;
        return frequency;
    }
    public static void main(String[] args) {
        Insertion insertion=new Insertion();
        insertion.push(10);
        insertion.push(15);
        insertion.push(40);
        insertion.push(20);
        insertion.push(30);
        insertion.push(35);
        insertion.push(40);
        insertion.push(59);
        insertion.push(79);
        insertion.push(40);
        insertion.push(40);
        insertion.printlist();
        insertion.lengthOfLinkedList();
        insertion.afterNode(insertion.head,25);
        insertion.printlist();
        insertion.addLast(5);
        insertion.printlist();
        insertion.deleteFromStart();
        insertion.printlist();
        insertion.deleteFromEnd();
        insertion.printlist();
        insertion.deleteFromMiddle(15);
        insertion.printlist();
        insertion.deleteFromPosition(3);
        insertion.printlist();
        insertion.lengthOfLinkedList();
        int count=insertion.countNode();
        System.out.println(count);
        insertion.elementSearchByIterative(40);
        insertion.elementSearchByRecursion(insertion.head,40);
        System.out.println(insertion.dataOnNthLocation(2));
        System.out.println(insertion.dataOnNthLocationRec(insertion.head,3));
        insertion.NthNodefromEnd(insertion.head,2);
        insertion.NthNodefromEndRec(insertion.head,3);
        insertion.NthNodeFromLastTwoPointer(insertion.head,3);
        insertion.middileElement(insertion.head);
        insertion.middleElement2ndMethod(insertion.head);
        System.out.println(insertion.countOccuranceRec(insertion.head,40));
        System.out.println(insertion.countOccuranceRec2nd(insertion.head,40));
        insertion.deleteLinkedList();
        insertion.printlist();
    }
}

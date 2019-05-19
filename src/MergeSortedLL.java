// Merge two sorted Linked list through recursive method

class MergeSortedLL{

    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;

        }
    }

    public static void push(Node head,int new_data){
        while(head.next!=null)
            head=head.next;

        head.next=new Node(new_data);

    }

    public static void printList(Node node){
        while(node!=null){
            System.out.print(node.data+"-->");
            node=node.next;
        }
        System.out.println("NULL");
    }

    public static Node mergeLL(Node head1,Node head2){
        Node head3 =null;
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        if(head1.data<=head2.data){
            head3=head1;
            head3.next= mergeLL(head1.next,head2);
        }
        else{
            head3=head2;
            head3.next = mergeLL(head1,head2.next);

        }
        System.out.println("the value for head 3 = "+head3.data);
        return head3;

    }


    public static void main(String[] args){
        MergeSortedLL msll = new MergeSortedLL();
        int[] arr1={1,2,7,91,100};

        Node head1= new Node(arr1[0]);
        for(int i=1;i<arr1.length;i++){
            msll.push(head1,arr1[i]);
        }
        System.out.println("Linked list 1 is : ");
        msll.printList(head1);

        int[] arr2={7,11,31,65,72,81,90};

        Node head2= new Node(arr2[0]);
        for(int i=1;i<arr2.length;i++){
            msll.push(head2,arr2[i]);
        }
        System.out.println("Linked list 2 is : ");
        msll.printList(head2);

        //int j= arr1.length+arr2.length;
        Node head3=msll.mergeLL(head1,head2);
        System.out.println("Merged Linked list is : ");
        msll.printList(head3);

    }
}

public class LinkedListInsertion {
    Node1 head1;
    public void push(int data)
    {
        Node1 node1=new Node1(data);
        node1.next=head1;
        head1=node1;
    }
    public void insertAfterNode(Node1 previous,int data)
    {
        if(previous==null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
    }
        public static void main(String... s)
        {
            LinkedListInsertion lli=new LinkedListInsertion();
            lli.push(10);
            lli.push(20);
            lli.insertAfterNode(lli.head1.next,15);
        }
}

class AddElement {
    Node1 head;
    public void addElement(int data)
    {
        head=new Node1(data);
        display(head.data);
    }
    void display(int n)
    {
        System.out.print(n+" ");
    }
    public static void main(String... s)
    {

        AddElement a=new AddElement();
        int data=10;
        a.addElement(data);
        a.addElement(24);
        a.addElement(34);
        a.addElement(45);
    }
}

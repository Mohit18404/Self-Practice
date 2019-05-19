public class Stack1 {
    static final int MAX=5;
    int top;
    int a[]=new int[MAX];
    Stack1()
    {
      top=-1;
    }
    boolean isEmpty()
    {
        return (top<0);
    }
    boolean push(int x)
    {
        top=top+1;
        if (top >= MAX)
        {
            System.out.println("Stack overflow");
            return false;
        }
        else
        {
            a[top]=x;
            System.out.println(top);
            return true;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int x=a[top--];
            return x;
        }
    }
    public static void main(String... s)
    {
        Stack1 s1=new Stack1();
        System.out.println("chack if stack is empty or not "+ s1.isEmpty());
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
    }

}

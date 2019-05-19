class Simple{
    protected void msg(){System.out.println("Hello java");}
}

public class A extends Simple
{
    public void msg()
    {
        System.out.println("Hello java");
    }//C.T.Error
    public static void main(String args[])
    {
        A obj=new A();
        obj.msg();
    }
}

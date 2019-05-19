class Parent {
    static void m1()
    {
        System.out.println("parent class method");
    }
}
class Child extends Parent
{
    static void m1()
    {
        System.out.println("Child class method");
    }
    public static void main(String... s)
    {
        Child p=new Child();
        p.m1();
    }
}


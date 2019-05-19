class Animal1 { }

class Dog3 extends Animal1 {
    static void method()
    {
        System.out.print("Hi");
    }

    public static void main (String [] args) {
        Animal1 a=new Dog3();
        Dog3 b=(Dog3)a;
        b.method();

    }

}
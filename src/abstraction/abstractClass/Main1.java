package abstraction.abstractClass;

/*
 * @author: mohit5.kumar
 * @created: 06/04/19
 */

class A{
    int x=10;
}
class B extends A{
    int x=20;
}

public class Main1 {
    public static void main(String[] args) {
        A a =new B();
    }
}

package himanshu;

/*
 * @author: mohit5.kumar
 * @created: 30/03/19
 */
class Base {
    public void show(int x) {
        System.out.println("base class "+x);
    }
}

class Child extends Base {
    public void show() {
        System.out.println("child class");
    }
    public void display(){
        System.out.println("himanshu");
    }

    public static void main(String[] args) {
        Base base = new Child();
        base.show(10);
    }
}

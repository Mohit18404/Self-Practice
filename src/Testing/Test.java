package Testing;

/*
 * @author: mohit5.kumar
 * @created: 06/04/19
 */
public class Test {
    public void display(int a,int b){
        System.out.println(a);
    }

    public void display(int a,long b){
        System.out.println(b);
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.display(10,20);
    }
}

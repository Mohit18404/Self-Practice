package SingleTon;

/*
 * @author: mohit5.kumar
 * @created: 17/02/19
 */
public class Main {
    public static void main(String[] args) {
        SingleTon1 instance1=SingleTon1.getInstance();
        SingleTon1 instance2=SingleTon1.getInstance();
        System.out.println(instance1 +" "+ instance1.s);
        System.out.println(instance2 +" "+ instance2.s);
    }
}

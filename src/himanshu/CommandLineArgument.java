package himanshu;

/*
 * @author: mohit5.kumar
 * @created: 25/04/19
 */
public class CommandLineArgument {
    public static void main(String... s) {
        try {
            int x=10/s.length;
            System.out.println(x);
            int[] z=new int[s.length];
            z[0]=1000;
        }catch (Throwable e){
            System.out.println();
        }
    }

    void method(String s){
        System.out.println(s);
    }
}

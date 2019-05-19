package recursion;

/*
 * @author: mohit5.kumar
 * @created: 08/04/19
 */
public class Factorial {
    int factorial(int n){
        if(n==0) return 1;
        int f=n*factorial(n-1);
        System.out.println("n="+n+" f "+f);
        return f;
    }
    public static void main(String[] args) {
        Factorial factorial=new Factorial();
        int fact=factorial.factorial(5);
        System.out.println(fact);
    }
}

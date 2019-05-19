package recursion;

/*
 * @author: mohit5.kumar
 * @created: 08/04/19
 */
public class FibonacciByIterative {
    int fibonnaci(int n){
        if(n<=1) return n;
        int f1=0,f2=1,f=0;
        for(int i=2;i<=5;i++){
            f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f;
    }
    public static void main(String[] args) {
        FibonacciByIterative fibonacciByIterative=new FibonacciByIterative();
        int term=fibonacciByIterative.fibonnaci(5);
        System.out.println(term);
    }
}

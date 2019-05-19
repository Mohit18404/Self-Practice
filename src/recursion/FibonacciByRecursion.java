package recursion;

/*
 * @author: mohit5.kumar
 * @created: 08/04/19
 */
public class FibonacciByRecursion {
    int fibonacci(int n){
        if(n<=1) return n;
        int term=fibonacci(n-1)+fibonacci(n-2);
        System.out.println(term);
        return term;
    }
    public static void main(String[] args) {
        FibonacciByRecursion fibonacciByRecursion=new FibonacciByRecursion();
        int n=fibonacciByRecursion.fibonacci(5);
        System.out.println(n);
    }
}

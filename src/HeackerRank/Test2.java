package HeackerRank;

/*
 * @author: mohit5.kumar
 * @created: 12/03/19
 */
public class Test2 {
    public static void main(String[] args) {
        int n=29;
        int i=2;
        boolean flag=true;
        while (i<=n/2){
            if(n%i==0){
                flag=false;
                break;
            }
            ++i;
        }
        if(flag){
            System.out.println("the number is prime "+n);
        }
    }
}

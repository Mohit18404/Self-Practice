package HeackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author: mohit5.kumar
 * @created: 21/02/19
 */
public class BigInteger {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}

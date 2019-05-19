package HeackerRank;

import java.util.Scanner;

/*
 * @author: mohit5.kumar
 * @created: 13/03/19
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "";
        while (n != 0 && n != 1) {
            int reminder = n % 2;
            s = reminder + s;
            n = n / 2;
        }
        s = n + s;
        System.out.println(s);
        int max=0;
        int consecutiveNumber=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                consecutiveNumber=consecutiveNumber+1;
            }else{
                if(max<consecutiveNumber){
                    max=consecutiveNumber;
                }
                consecutiveNumber=0;
            }
            if(s.charAt(s.length()-1)=='1' && max<consecutiveNumber){
                max=consecutiveNumber;
            }
        }
        System.out.println(max);
        scanner.close();
    }
}


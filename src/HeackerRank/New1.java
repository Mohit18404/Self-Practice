package HeackerRank;

import java.util.Scanner;

/*
 * @author: mohit5.kumar
 * @created: 17/02/19
 */
public class New1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int temp = 0;
        if (s == null || s.equals("") || s.trim().equals("")) {
            System.out.println(0);
        } else {
            String[] str = s.trim().split("[ !,?.\\_'@]+");
            for (int i = 0; i < str.length; i++) {
                if (str[i] == null) {
                    i++;
                } else {
                    str[temp] = str[i];
                    temp = temp + 1;
                }
            }
            System.out.println(temp);
            for (int i = 0; i < temp; i++) {
                System.out.println(str[i]);
            }
            scan.close();
        }
    }
}


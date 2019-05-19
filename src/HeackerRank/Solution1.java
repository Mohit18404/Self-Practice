package HeackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @author: mohit5.kumar
 * @created: 13/03/19
 */
public class Solution1 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        for (int i = 0; i < n; i++) {
            String name1 = in.next();
            if (map.containsKey(name1)) {
                int val = map.get(name1);
                System.out.println(name1 + "=" + val);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}


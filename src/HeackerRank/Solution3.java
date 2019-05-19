package HeackerRank;

import java.util.ArrayList;
import java.util.List;

/*
 * @author: mohit5.kumar
 * @created: 19/05/19
 */
public class Solution3 {
    public int maxSubArray(final List<Integer> A) {
        int finalvar=0;
        int current=0;
        for(Integer i:A){
            current=current+i;
            if(current<0){
                current=0;
            }

            if(finalvar<current){
                finalvar=current;
            }
        }
        return finalvar;
    }

    public static void main(String[] args) {
        Solution3 solution3=new Solution3();
        List<Integer> integers=new ArrayList<>();
        integers.add(-395);
        integers.add(-74);
        integers.add(-432);
        integers.add(47);
        integers.add(-474);
        integers.add(-429);
        integers.add(-409);
        integers.add(-215);
        integers.add(-102);
        integers.add(-63);
        integers.add(80);


        int i=solution3.maxSubArray(integers);
        System.out.println(i);
    }
}

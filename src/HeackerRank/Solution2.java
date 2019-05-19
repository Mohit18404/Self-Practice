package HeackerRank;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * @author: mohit5.kumar
 * @created: 18/05/19
 */
public class Solution2 {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int size=A.size();
        A.set(size-1,A.get(size-1)+1);
        int carry = A.get(size-1) / 10;
        A.set(size - 1, A.get(size-1) % 10);

        for (int i = size - 2; i >= 0; i--) {
            if (carry == 1) {
                A.set(i, A.get(i) + 1);
                carry = A.get(i) / 10;
                A.set(i, A.get(i) % 10);
            }
        }

        if (carry == 1) A.add(0, 1);
        int temp=0;
        Iterator iterator=A.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(0)){
                temp++;
            }else {
                break;
            }
        }
        for (int i=0;i<temp;i++){
            A.remove(0);
        }

        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(0);
        integers.add(0);
        integers.add(3);
        integers.add(7);
        integers.add(6);
        integers.add(4);
        integers.add(0);
        integers.add(5);
        integers.add(5);
        integers.add(5);
        Solution2 solution2=new Solution2();
        ArrayList<Integer> i =solution2.plusOne(integers);
        for (Integer i1:i){
            System.out.print(i1);
        }
    }
}

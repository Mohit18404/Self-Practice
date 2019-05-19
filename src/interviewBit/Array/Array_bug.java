package interviewBit.Array;

import java.util.ArrayList;
import java.util.List;

/*
 * @author: mohit5.kumar
 * @created: 12/04/19
 */
public class Array_bug {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size()-B; i++) {
            ret.add(A.get(i + B));
        }
        for (int i=0;i<B;i++){
            ret.add(A.get(i));
        }
        return ret;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        List<Integer> list=rotateArray(arrayList,1);
        for (Integer i:
             list) {
            System.out.println(i+" ");
        }

    }
}

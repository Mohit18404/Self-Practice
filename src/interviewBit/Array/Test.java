package interviewBit.Array;

import java.util.ArrayList;

/*
 * @author: mohit5.kumar
 * @created: 17/04/19
 */
public class Test {
    ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
    }

    public static void main(String[] args) {
        Test test=new Test();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(5);
        A.add(10);
        A.add(2);
        A.add(1);
        ArrayList<Integer> B = test.performOps(A);
        for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i) + " ");
        }

    }
}

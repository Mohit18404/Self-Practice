package interviewBit.Array;

import java.util.ArrayList;
import java.util.List;



/*
 * @author: mohit5.kumar
 * @created: 21/04/19
 */
public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // Populate result;
        int m, n;

        m = A.size();
        n = A.get(0).size();

        if (m == 0)
            return result;

        int dir = 0; // right
        int row, col, layer;
        row = col = layer = 0;

        result.add(A.get(0).get(0));


        for (int step = 1; step < m * n; step++) {

            switch (dir) {

                // Go right
                case 0:

                    if (col == n - layer - 1) {
                        dir = 1;
                        row++;
                    } else {
                        col++;
                    }
                    break;

                // Go down
                case 1:

                    if (row == m - layer - 1) {
                        dir = 2;
                        col--;
                    } else {
                        row++;
                    }

                    break;

                // Go left
                case 2:

                    if (col == layer) {
                        dir = 3;
                        row--;
                    } else {
                        col--;
                    }

                    break;

                // Go up
                case 3:

                    if (row == layer + 1) {
                        dir = 0;
                        col++;
                        layer++;
                    } else {
                        row--;
                    }

                    break;

            }

            //System.out.println(row + " " + col);
            result.add(A.get(row).get(col));
            System.out.println("row="+row+" "+" column="+col+" the value is"+A.get(row).get(col));

        }


        return result;
    }

    public void diplay(ArrayList<Integer> result){
            for (Integer i:
                 result) {
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        List<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(7);
        arrayList2.add(8);
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList2.add(8);
        arrayList3.add(9);arrayList3.add(10);
        arrayList3.add(11);
        arrayList3.add(12);
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(13);
        arrayList4.add(14);
        arrayList4.add(15);
        arrayList4.add(16);
        lists.add(arrayList1);
        lists.add(arrayList2);
        lists.add(arrayList3);
        lists.add(arrayList4);

        Solution solution=new Solution();
        ArrayList<Integer> result=solution.spiralOrder(lists);
        solution.diplay(result);
    }
}

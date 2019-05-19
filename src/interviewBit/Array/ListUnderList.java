package interviewBit.Array;

import java.util.ArrayList;
import java.util.List;

/*
 * @author: mohit5.kumar
 * @created: 17/04/19
 */
public class ListUnderList {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int m=A.size();
        int n=A.get(0).size();
        int left=0;
        int top=0;
        for (int i=0;i<(m-1)*(n-1);i++){
            for (int j=left;j<m;j++) arrayList.add(A.get(left).get(j));
            for (int j=left+1;j<m;j++) arrayList.add(A.get(j).get(m-1));
            for (int j=n-1;j>0;j--) arrayList.add(A.get(n-1).get(j-1));
            for (int j=n-2;j>0;j--) arrayList.add(A.get(j).get(top));
            top++;
            left++;
            m--;
            n--;

        }
        return arrayList;
    }

    public void display(ArrayList<Integer> a) {
        for (Integer i : a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        //arrayList1.add(4);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(4);
        arrayList2.add(5);
        arrayList2.add(6);
        //arrayList2.add(7);
        //arrayList2.add(8);
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList2.add(7);
        arrayList2.add(8);
        arrayList3.add(9);
       /* arrayList3.add(10);
        arrayList3.add(11);
        arrayList3.add(12);
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(13);
        arrayList4.add(14);
        arrayList4.add(15);*/
        //arrayList4.add(16);
        lists.add(arrayList1);
        lists.add(arrayList2);
        lists.add(arrayList3);
        //lists.add(arrayList4);
        ListUnderList listUnderList = new ListUnderList();
        ArrayList<Integer> integers = listUnderList.spiralOrder(lists);

        listUnderList.display(integers);
    }
}

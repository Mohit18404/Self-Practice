package HeackerRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        Iterator itr1 = a.iterator();
        Iterator itr2 = b.iterator();
        while (itr1.hasNext() && itr2.hasNext()) {
            int al = (Integer) itr1.next();
            int bo = (Integer) itr2.next();
            if (al > bo)
                alice = alice + 1;
            if (bo > al)
                bob = bob + 1;
        }
        list.add(alice);
        list.add(bob);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        List<Integer> list=compareTriplets(list1,list2);

    }
}
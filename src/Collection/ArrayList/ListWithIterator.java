package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("mohit");
        arrayList.add("mayank");
        arrayList.add("anjali");
        arrayList.add("null");
        arrayList.add("mohit");
        arrayList.add("kittu");
        arrayList.add("kutkut");
        arrayList.add("inu");
        arrayList.add("yashu");
        Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }
    }
}

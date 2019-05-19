package Collection.ArrayList;

import java.util.ArrayList;

public class CollectionToArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        String[] strings=new String[arrayList.size()];
        arrayList.toArray(strings);
        //System.out.println(strings);
        for (int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
    }
}

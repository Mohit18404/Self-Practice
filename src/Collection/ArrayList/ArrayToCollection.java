package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToCollection {
    public static void main(String[] args) {
        String[] names={"mohit","kittu","inu","yashu"};
        ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(names));
        arrayList.add("chhotu");
        arrayList.add("kutkut");
        for (String str:
             arrayList) {
            System.out.println(str);
        }
    }
}

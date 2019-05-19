package Collection.ArrayList;

import Collection.Employee;
import Collection.Student;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(10.5);
        arrayList.add("mohit");
        arrayList.add("10");
        arrayList.add(10);
        arrayList.add(null);
        arrayList.add(0,"jay");
        System.out.println(arrayList);
        System.out.println("the size is "+ arrayList.size());
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove("mohit");
        System.out.println(arrayList);
        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
    }
}

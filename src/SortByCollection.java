import java.util.ArrayList;
import java.util.Collections;

public class SortByCollection {
    public static void main(String args[])
    {
        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee(111,"mohit"));
        al.add(new Employee(444,"himanshu"));
        al.add(new Employee(222,"neeranchal"));
        al.add(new Employee(333,"eesha"));
        System.out.println("Before sort the collection");
        for (Employee ee:al) {
            System.out.println(ee.eid+" "+ee.ename);
        }
        Collections.sort(al);
        System.out.println("after sorting the data");
        for (Employee ee:al) {
            System.out.println(ee.eid+" "+ee.ename);
        }
    }
}

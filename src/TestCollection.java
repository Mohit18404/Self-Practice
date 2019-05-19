import java.util.ArrayList;
import java.util.Collections;

public class TestCollection {

        public static void main (String args[])
        {
            ArrayList<String> al=new ArrayList<String>();
            al.add("ratan");
            al.add("mohit");
            al.add("himanshu");
            al.add("neerannchal");
            al.add("eesha");
            System.out.println("before sort"+al);
            Collections.sort(al);
            System.out.println("after sort"+al);
        }

}

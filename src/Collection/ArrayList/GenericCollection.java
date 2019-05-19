package Collection.ArrayList;

import Collection.Student;

import java.util.ArrayList;
import java.util.Collections;

public class GenericCollection {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<Student>();
        Student student1=new Student(1,"mohit");
        Student student2=new Student(2,"raj");
        Student student3=new Student(3,"jay");
        Student student4=new Student(4,"mayank");
        Student student5=new Student(5,"ayushman");
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        for (Student student:arrayList) {
            System.out.println(student.sid+"-----"+student.sname);
        }
        System.out.println(arrayList.size());
        System.out.println("after sorting");
        Collections.sort(arrayList);
        for (Student student:
             arrayList) {
            System.out.println(student.sid+"-----"+student.sname);
        }
    }
}

package Collection.ArrayList;

import Collection.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSorting {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList=new ArrayList<Employee>();
        arrayList.add(new Employee(101,"kittu"));
        arrayList.add(new Employee(105,"raj"));
        arrayList.add(new Employee(104,"inu"));
        arrayList.add(new Employee(102,"mohit"));
        arrayList.add(new Employee(103,"yashu"));
        System.out.println("before sorting"+arrayList);
        Collections.sort(arrayList);
        System.out.println("after sorting"+arrayList);
    }
}

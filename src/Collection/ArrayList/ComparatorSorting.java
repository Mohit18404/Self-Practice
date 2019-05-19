package Collection.ArrayList;

import Collection.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSorting {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList=new ArrayList<>();
        arrayList.add(new Employee(333,"mohit"));
        arrayList.add(new Employee(111,"yashu"));
        arrayList.add(new Employee(222,"kittu"));
        System.out.println("before sorting");
        for (Employee employee:
                arrayList) {
            System.out.println(employee.eid+"    "+employee.ename);
        }
        Collections.sort(arrayList,new EmployeeComparision());
        System.out.println("after sorting");
        for (Employee employee:
             arrayList) {
            System.out.println(employee.eid+"    "+employee.ename);
        }
    }
}

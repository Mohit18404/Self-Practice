package Collection.ArrayList;

import Collection.Employee;

import java.util.Comparator;

public class EmployeeComparision implements Comparator<Employee>{
    public int compare(Employee o1,Employee o2){
           return o1.ename.compareTo(o2.ename);
    }
}

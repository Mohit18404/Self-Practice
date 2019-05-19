package Collection.ArrayList;

import java.util.ArrayList;

/*
 * @author: mohit5.kumar
 * @created: 04/05/19
 */
public class Test {
    public static void main(String[] args) {
        Employee employee=new Employee("himanshu",1);
        /*Student student=new Student("raj",2);
        ArrayList arrayList=new ArrayList();
        arrayList.add(employee);
        arrayList.add(student);
        arrayList.add(20);
        arrayList.add("ratan");

        for (Object o: arrayList) {
            if(o instanceof Employee) {
                Employee employee1=(Employee)o;
                System.out.println(employee1.eid+" "+employee1.ename);
            }

            if(o instanceof Student) {
                Student student1=(Student)o;
                System.out.println(student1.sid+" "+student1.sname);
            }

            if(o instanceof Integer){
                System.out.println(o);
            }

            if(o instanceof String){
                System.out.println(o);
            }
        }*/
        Employee employee1=new Employee("mohit",2);
        Employee employee2=new Employee("neeru",3);

        ArrayList<Employee> arrayList=new ArrayList<>();
        arrayList.add(employee);
        arrayList.add(employee1);
        arrayList.add(employee2);

        for (Employee e:
             arrayList) {
            System.out.println(e.eid+" "+e.ename);
        }

        System.out.println(arrayList.size());

        Employee employee3=new Employee("taran",4);

        arrayList.add(1,employee3);
        for (Employee e:
                arrayList) {
            System.out.println(e.eid+" "+e.ename);
        }

        arrayList.remove(1);

        for (Employee e:
                arrayList) {
            System.out.println(e.eid+" "+e.ename);
        }

        System.out.println(arrayList.contains(employee2));
        System.out.println(arrayList.isEmpty());
        System.out.println();
        arrayList.remove(employee2);

        for (Employee e:
                arrayList) {
            System.out.println(e.eid+" "+e.ename);
        }

        ArrayList<Employee> arrayList1=new ArrayList<>(arrayList);

        //arrayList1.addAll(arrayList);
        arrayList1.add(new Employee("rahul",4));
        arrayList1.add(new Employee("mukul",5));

        System.out.println();

        for (Employee e:
                arrayList1) {
            System.out.println(e.eid+" "+e.ename);
        }

    }
}

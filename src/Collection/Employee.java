package Collection;

public class Employee implements Comparable<Employee> {
    public int eid;
    public String ename;

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public int compareTo(Employee o) {
        return ename.compareTo(o.ename);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
}

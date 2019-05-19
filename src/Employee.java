public class Employee implements Comparable{
    int eid;
    String ename;
    Employee(int eid,String ename)
    {
        this.eid=eid;
        this.ename=ename;
    }
    public int compareTo(Object o)
    {
        Employee e=(Employee)o;
        if(eid==e.eid)
        {
            return 0;
        }
        else if(eid>e.eid)
        {
            return 1;
        }
        else {
            return -1;
        }
    }
}

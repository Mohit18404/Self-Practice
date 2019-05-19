package Collection;

public class Student implements Comparable{
    public int sid;
    public String sname;
    public Student(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
    public int compareTo(Object o){
        Student student=(Student)o;
        if(sid==student.sid)
            return 0;
        else if (sid>student.sid)
            return 1;
        else return -1;
    }
    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}

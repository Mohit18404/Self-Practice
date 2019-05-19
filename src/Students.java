public class Students {
    String studentname;
    String roll_number;
    Students(String studentname,String roll_number)
    {
        this.studentname=studentname;
        this.roll_number=roll_number;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }
}

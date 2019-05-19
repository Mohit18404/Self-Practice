public class GPG {
    public static void main(String[] args) {
        Student[] arr;
        arr=new Student[5];
        arr[0]=new Student(1,"mohit");
        arr[1]=new Student(2,"anuj");
        arr[2]=new Student(3,"himanshu");
        arr[3]=new Student(4,"neeranchal");
        arr[4]=new Student(5,"avinesh");
        for (int i=0;i<arr.length;i++) {
        System.out.println("Element are "+i+" roll number is "+ arr[i].roll_no+" and the name is "+arr[i].name);
        }
    }
}

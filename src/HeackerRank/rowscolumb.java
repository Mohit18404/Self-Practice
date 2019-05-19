package HeackerRank;

public class rowscolumb {

    static int[] gradingStudents(int[] grades) {
        int[] array=new int[grades.length];
        int in=0;
        for(int i:grades){
            if(i>=38){
                int mul=i/5+1;
                int total=mul*5;
                if((total-i)<3){
                    array[in]=total;
                }else{
                    array[in]=i;
                }
                in=in+1;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array={73,67,38,33};
        int ar[]=gradingStudents(array);
        for (int a:ar) {
            System.out.println(a);
        }
    }
}

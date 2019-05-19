package ArrayPractice;

public class Test {
    public static void main(String[] args) {
        Test t=new Test();
        int array[]=new int[5];
        array[0]=0;
        array[1]=1;
        array[2]=2;
        array[3]=3;
        array[4]=4;
        //array[5]=5;
        System.out.println(array.length);
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }
}

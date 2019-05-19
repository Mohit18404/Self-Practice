public class CyclyRotate {
    int[] rotate(int[] array)
    {
        int x=array[array.length-1];
        for (int i=array.length-2;i>=0;i--) {
            array[i + 1] = array[i];
        }
         array[0]=x;
        display(array);
        return array;
    }
    void display(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String... s)
    {
        CyclyRotate cyclyRotate=new CyclyRotate();
        int array[]={1,2,3,4,5};
        cyclyRotate.rotate(array);
    }
}

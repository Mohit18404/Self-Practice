public class ArrayRotation {
    int[] leftRotation(int array[],int d,int n)
    {
        int array1[]=new int[array.length];
        for (int j=0;j<array.length;j++)
        {
            System.out.print(array[j]+" ");
        }
        for (int i=d;i<n;i++)
        {
            array1[i-d]=array[i];
        }
        for (int i=0;i<d;i++)
        {
            array1[n-d+i]=array[i];
        }
        return array1;
    }
    void display(int array1[])
    {
        for (int i=0;i<array1.length;i++)
        {
            System.out.print(array1[i]+" ");
        }
    }
    public static void main(String... s)
    {
        ArrayRotation arrayRotation=new ArrayRotation();
        int array[]={1,2,3,4,5,6,7,8,9};
        int d=2;
        int n=9;
        int[] array1=arrayRotation.leftRotation(array,d,n);
        System.out.println();
        arrayRotation.display(array1);
    }
}

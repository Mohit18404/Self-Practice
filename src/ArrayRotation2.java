public class ArrayRotation2 {
    int[] leftRotation(int array[],int d,int n)
    {
        for (int j=0;j<array.length;j++)
        {
            System.out.print(array[j]+" ");
        }

        for (int i=0;i<d;i++)
        {
            leftRotationByOne(array,n);
        }
        return array;
    }
    void leftRotationByOne(int array[],int n)
    {
        int i,temp;
        temp=array[0];
        for (i=0;i<n-1;i++)
            array[i]=array[i+1];
        array[i]=temp;
    }
    void display(int array1[])
    {
        for (int i=0;i<array1.length;i++)
        {
            System.out.print(array1[i]+" ");
        }
    }

    public static void main(String... s) {
        ArrayRotation2 arrayRotation2 = new ArrayRotation2();
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 2;
        int n = 9;
        int[] array1 = arrayRotation2.leftRotation(array, d, n);
        System.out.println();
        arrayRotation2.display(array);
    }
}

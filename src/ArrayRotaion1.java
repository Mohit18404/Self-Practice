class ArrayRotation1 {
    int[] leftRotation(int array[],int d,int n)
    {
        int array1[]=new int[d];
        for (int j=0;j<array.length;j++)
        {
            System.out.print(array[j]+" ");
        }
        for (int i=0;i<d;i++)
        {
            array1[i]=array[i];
        }
        for (int i=d;i<n;i++)
        {
            array[i-d]=array[i];
        }
        for (int i=0;i<d;i++)
        {
            array[n-d+i]=array1[i];
        }
        return array;
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
        ArrayRotation1 arrayRotation1=new ArrayRotation1();
        int array[]={1,2,3,4,5,6,7,8,9};
        int d=2;
        int n=9;
        int[] array1=arrayRotation1.leftRotation(array,d,n);
        System.out.println();
        arrayRotation1.display(array);
    }
}

public class ReversalAlgoArrayRotation {
    int[] leftRotation(int array[], int d, int n)
    {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        rotate(array,0,d-1);
        rotate(array,d,n-1);
        rotate(array,0,n-1);
        return array;
    }
    void rotate(int array[],int start,int end)
    {
        while (start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
    void display(int array[])
    {
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }
    public static void main(String... s)
    {
        ReversalAlgoArrayRotation reversalAlgoArrayRotation=new ReversalAlgoArrayRotation();
        int array[]={1,2,3,4,5,6,7,8,9};
        int d=2,n=9;
        int array1[]=reversalAlgoArrayRotation.leftRotation(array,d,n);
        System.out.println("");
        reversalAlgoArrayRotation.display(array1);
    }
}

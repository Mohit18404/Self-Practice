public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={3,5,1,7,6,8,9,3,45,6};
        sum(arr);
        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];
        String[] strArray = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
    }
    public static void sum(int[] arr)
    {
        int sum=0;
        for (int i=0;i<arr.length;i++)
            sum=sum+arr[i];
        System.out.println("sum of array values "+sum);
    }

}
public class LinearSearch {
    static int linearSearch(int a[],int k,int n)
    {
        for (int i=0;i<n;i++)
        {
            if (a[i]==k)
                return i;
        }
        return -1;
    }
    public static void main(String... s)
    {
        int a[]={23,45,12,35,76,65,34,57,78,54,32,99};
        int a1=linearSearch(a,12,a.length);
        System.out.println(a1);
    }
}

public class BinarySearch {
    int binarySearch(int a[],int k,int l,int r)
    {
      if(r>=l)
      {
          int mid=(l+r)/2;
                  if(a[mid]==k)
                      return mid;
                  if (a[mid]>k)
                    return binarySearch(a,k,l,mid-1);
                  if(a[mid]<k)
                      return binarySearch(a,k,mid+1,r);

      }
      return -1;

    }
    public static void main(String... s)
    {
        BinarySearch b=new BinarySearch();
        int a[]={2,5,7,9,12,15,24,34,43,54,67,76,89};
        int a1=b.binarySearch(a,34,0,a.length-1);
        if (a1==-1)
            System.out.println("number not present");
        else
            System.out.println("element present in index "+ a1);

    }
}

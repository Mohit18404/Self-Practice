public class AddAdjucentElement {
    int pairSumSequence(int n)
    {
        int sum=0;
        for (int i=0;i<n;i++)
            sum+=pairSum(i,i+1);
        return sum;
    }
    int pairSum(int m,int n){
        return m+n;
    }
    public static void main(String... s)
    {
        AddAdjucentElement aae=new AddAdjucentElement();
        System.out.println(aae.pairSumSequence(6));
    }
}

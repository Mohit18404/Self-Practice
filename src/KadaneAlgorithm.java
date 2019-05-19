public class KadaneAlgorithm {
    int sum(int test[],int k){
        int finalSum=0;
        int temporarySum=0;
        for (int i=0;i<test.length;i++)
        {
            temporarySum=temporarySum+test[i];
            if(temporarySum<0)
                temporarySum=0;
            else if (finalSum<temporarySum)
                finalSum=temporarySum;
        }

        return finalSum;
    }
    public static void main(String[] args) {
        KadaneAlgorithm kadaneAlgorithm=new KadaneAlgorithm();
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        int finalSum=kadaneAlgorithm.sum(array,array.length);
        System.out.println(finalSum);
    }
}

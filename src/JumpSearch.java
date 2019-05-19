class JumpSearch {
    int jumpSearch(int arr[],int k) {
        int n = arr.length;
        int SQRT = (int) Math.floor(Math.sqrt(n));
        int previousBlock = 0;
        while (arr[Math.min(SQRT, n) - 1] < k) {
            previousBlock = SQRT;

        }
        return -1;
    }
    public static void main(String... s)
    {
        JumpSearch j=new JumpSearch();
        int arr[]={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 620, 650};
        int k=620;
        int a=j.jumpSearch(arr,k);
        System.out.println("given number "+k+" at index of "+a);
    }
}

class MissingElement {
    public int missingElement(int[] a, int n) {
        int i,total,m;
        m=a.length;
        total=(m+1)*(m+2)/2;
        for (i=0;i<n;i++)
            total=total-a[i];
        return total;

    }

    public static void main(String... s) {

        MissingElement m=new MissingElement();
        int[] a = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int missing = m.missingElement(a,a.length);
        System.out.println(missing);
    }
}
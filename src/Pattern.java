class Pattern {
    public static void main(String... s)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");
            for (int k=i;k<2*i;k++)
                System.out.print(k);
            for (int l=(2*i-2);l>=i;l--)
                System.out.print(l);
            System.out.println();
        }
    }
}

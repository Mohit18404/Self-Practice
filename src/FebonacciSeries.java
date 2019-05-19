class FebonacciSeries
{
    int fub(int k)
    {
        if(k<=1)
            return k;
        return fub(k-1)+fub(k-2);
    }
    public static void main(String... s)
    {
        FebonacciSeries f=new FebonacciSeries();
        int k=5;
        System.out.println(f.fub(k));
    }
}

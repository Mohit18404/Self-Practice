public class Stairs {
    int numberCount(int n)
    {
       return (fub(n+1));
    }
    int fub(int n)
    {
        if(n<=1)
            return n;
        return fub(n-1) + fub(n-2);
    }
    public static void main(String... s)
    {
        Stairs s1=new Stairs();
        int n=5;
        int number=s1.numberCount(n);
        System.out.println(number);
    }
}

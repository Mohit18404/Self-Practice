public class PowerOf2 {
    int powerOf2(int n)
    {
        if(n<1)
        return 0;
        else if(n==1) {
            System.out.println(1);
            return 1;
        }
        else
        {
            System.out.println("Going to compute power of "+n+ ":=");
            int previous=powerOf2(n/2);
            int current=previous*2;
            System.out.println("Calculating current for value n:="+n+"The current is: "+current);
            return current;
        }
    }
    public static void main(String... s)
    {
        PowerOf2 po2=new PowerOf2();
        po2.powerOf2(10);
    }
}

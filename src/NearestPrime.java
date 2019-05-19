public class NearestPrime {
    int nearestPrime(int n1)
    {
        int number=0;
        for (int i=2;i<n1;i++)
        {
            for (int j=2;j<=i;j++)
            {
                if (i % j == 0)
                    break;
                number=i;
            }

        }
        return number;
    }
    public static void main(String... s)
    {
        NearestPrime  n =new NearestPrime();
        int n1=18;
        System.out.println("The closest prime number is "+ n.nearestPrime(n1));

    }
}

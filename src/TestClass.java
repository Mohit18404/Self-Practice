import java.util.Scanner;
class TestClass {
    public void removeConsecutive(String[] s)
    {
        for(int i=0;i<s.length;i++)
        {
            char temp;
            char ch;
            String s1="";
            for(int j=0;j<s[i].length();j++)
            {
                if(j==0)
                {
                    ch=s[i].charAt(j);
                    s1=s1+ch;
                }
                else {
                    temp=s[i].charAt(j-1);
                    if(temp!=s[i].charAt(j))
                    {
                        ch=s[i].charAt(j);
                        s1=s1+ch;
                    }
                }

            }
            System.out.println(s1);
        }
    }
    public static void main(String args[] ) throws Exception {
        TestClass testClass=new TestClass();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        testClass.removeConsecutive(s);
    }

}
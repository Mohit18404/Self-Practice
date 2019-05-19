import java.util.Scanner;

public class CheckString {

    public void reverseString(String s[])
    {
        for(int j=0;j<s.length;j++)
        {
            String s1=s[j];
            for(int i=s1.length()-1;i>=0;i--)
            {
                System.out.print(s1.charAt(i));
            }
            System.out.println();
        }
    }

    public static void main(String args[] ) throws Exception {
        CheckString checkString = new CheckString();
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        String[] s=new String[a];
        for(int i=0;i<a;i++) {
            s[i]=in.next();
        }
        checkString.reverseString(s);
    }
}

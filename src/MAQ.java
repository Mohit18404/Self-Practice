public class MAQ {
    char[] mAQ(String s1)
    {
        char[] ch=new char[s1.length()];
        for (int i=0;i<s1.length();i++)
        {
            ch[i]=s1.charAt(i);
        }
        int index0=0;
        int index1=0;
        for (int i=0;i<s1.length();i++)
        {
            if(ch[i]=='0')
            {
                index0++;
            }
            else
            {
                index1++;
            }
        }
        for (int i=0;i<index0;i++)
        {
            ch[i]='0';
        }
        for (int i=index0;i<index0+index1;i++)
        {
            ch[i]='1';
        }
        return ch;
    }
    public static void main(String... s)
    {
        MAQ m=new MAQ();
        String s1="010101011001";
        System.out.println(m.mAQ(s1));
    }
}

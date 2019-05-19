package MultiThreading;

/*
 * @author: mohit5.kumar
 * @created: 02/05/19
 */
public class MultiThread {
    private int i = 0;
    public void increment()
    {
        i++;
    }

    public int getValue()
    {
        return i;
    }
}

class GfG
{
    public static void main (String[] args)
    {
        MultiThread t = new MultiThread();
        MultiThread t1=new MultiThread();

        t.increment();
        t1.increment();
        System.out.println(t.getValue());
        System.out.println(t1.getValue());
    }
}

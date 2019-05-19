package Enum;

/*
 * @author: mohit5.kumar
 * @created: 27/04/19
 */
enum Color
{
    RED, GREEN, BLUE;

    // enum constructor called separately for each
    // constant
    private Color()
    {
        System.out.println("Constructor called for : " +
                this.toString());
    }

    // Only concrete (not abstract) methods allowed
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

public class Test1
{
    // Driver method
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}

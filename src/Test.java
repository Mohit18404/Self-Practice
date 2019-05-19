class Test
{
    public static void main(String[] args)
    {
//string class equals90 executed
        String s1="himanshu";
        String s2="shukla";
        String s3="himanshu";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s2));
        System.out.println("HIMANSHU".equals("himanshu"));
        System.out.println("HIMANSHU".equalsIgnoreCase("himanshu"));
        System.out.println("---------------------------------------");

//compareTo
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s2));
        System.out.println("HIMANSHU".compareTo("himanshu"));
        System.out.println("HIMANSHU".compareToIgnoreCase("himanshu"));
    }
}
public class RemoveVovels {
    void removevowels(String s1)
    {
        String output = s1.replaceAll("[AEIOUaeiou]","");
        char[] arr = output.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == ' ' && arr[i + 1] == ' ') {
                sb.append(arr[i]);
                sb.append(arr[i+2]);
                i=i+2;
            }
            else {
                sb.append(arr[i]);
            }



        }
        output=sb.toString();
        //System.out.println("aman:= "+sb);

            System.out.println("The output string is: "+output);
    }
    public static void main(String... s)
    {
        RemoveVovels rv=new RemoveVovels();
        String s1="Ram is a good boy";
        rv.removevowels(s1);
    }
}

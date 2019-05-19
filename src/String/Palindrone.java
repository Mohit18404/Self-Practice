package String;

/*
 * @author: mohit5.kumar
 * @created: 20/04/19
 */
public class Palindrone {
    static void method(String s){
        String s1="";
        for (int i=s.length()-1;i>=0;i--){
           s1=s1+s.charAt(i);
        }
        if (s1.equals(s)) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
    public static void main(String[] args) {
        method("kanakq");
    }
}

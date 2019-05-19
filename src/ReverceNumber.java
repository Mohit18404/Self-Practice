public class ReverceNumber {
    String reverseNumber(int n) {
        String number="";
        while (n>0){
         int temp=n%10;
         number=number+temp;
         n=n/10;
        }
        return number;
    }
    public static void main(String[] args) {
        ReverceNumber number=new ReverceNumber();
        int n=1234567;
        String answer=number.reverseNumber(n);
        System.out.println(answer);
    }
}

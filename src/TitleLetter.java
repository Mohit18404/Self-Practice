import java.util.Scanner;

public class TitleLetter {

    public void titleFirstLetter(String str){
        int i=0;

        for(i=0;i<str.length();i++){
            if(i==0){
                char a=str.charAt(i);
                System.out.print(Character.toUpperCase(a));
            }
            else if(str.charAt(i) ==' '){
                System.out.print(str.charAt(i));
                i=i+1;
                char b=str.charAt(i);
                System.out.print(Character.toUpperCase(b));
                //i++;
            }
            else
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args){
        TitleLetter tl = new TitleLetter();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //int n = str.length();
        tl.titleFirstLetter(str);


    }
}

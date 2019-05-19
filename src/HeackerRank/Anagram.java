package HeackerRank;

/*
 * @author: mohit5.kumar
 * @created: 17/02/19
 */
public class Anagram {
    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()) return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] charArr1=a.toCharArray();
        char[] charArr2=b.toCharArray();
        for(int i=0;i<charArr1.length;i++){
            for (int j=0;j<charArr1.length;j++){
                if(charArr1[i]<charArr1[j]){
                    char temp=charArr1[j];
                    charArr1[j]=charArr1[i];
                    charArr1[i]=temp;
                }
            }
            for (int j=0;j<charArr2.length;j++){
                if(charArr2[i]<charArr2[j]){
                    char temp=charArr2[j];
                    charArr2[j]=charArr2[i];
                    charArr2[i]=temp;
                }
            }
        }
        return charArr1.equals(charArr2);
    }

    public static void main(String[] args) {
        isAnagram("anagram","margana");
    }
}

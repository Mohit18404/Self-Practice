package Sorting;

/*
 * @author: mohit5.kumar
 * @created: 17/02/19
 */
public class SortTest {
    public static boolean sort(char[] ar,char[] ar1){
        for (int i=0;i<ar.length;i++){
            for (int j=i;j<ar.length;j++){
                if(ar[i]<ar[j]){
                    char temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        for (int i=0;i<ar1.length;i++){
            for (int j=i;j<ar1.length;j++){
                if(ar1[i]<ar1[j]){
                    char temp=ar1[i];
                    ar1[i]=ar1[j];
                    ar1[j]=temp;
                }
            }
        }
        String str=new String(ar);
        String str1=new String(ar);
        if(str.equals(str1)){
            return true;
        }
        return false;
    }
    static void displauy(char[] a){
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        char[] araa={'a','n','a','g','r','a','m'};
        char[] araa1={'m','a','r','g','a','n','a'};

        boolean b=sort(araa,araa1);
        if(b){
            System.out.println("Anagrams");
        }else {
            System.out.println("not Anagrams");
        }
    }
}

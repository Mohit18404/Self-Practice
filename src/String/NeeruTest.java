package String;

/*
 * @author: mohit5.kumar
 * @created: 22/04/19
 */
public class NeeruTest {
    public static void main(String[] args) {
        String str=null;
        for(int i=0;i<5;i++){
            str="service"+ "[PBX" + (i+1) + "].";
            System.out.println(str);
        }
    }
}

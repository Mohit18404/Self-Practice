package SingleTon;

/*
 * @author: mohit5.kumar
 * @created: 17/02/19
 */
public class SingleTon1 {
    private static SingleTon1 singleTon1=null;
    public  String s;
    private SingleTon1(){
        s="i am singleton";
    }
    public static SingleTon1 getInstance(){
        if(singleTon1==null)
            singleTon1=new SingleTon1();
        return singleTon1;
    }
}

package designPatterns;

/*
 * @author: mohit5.kumar
 * @created: 20/03/19
 */
public class SingleTon {
   /* private SingleTon(){}
    private static final SingleTon INSTANCE=new SingleTon();
    public static SingleTon getInstance(){
        return INSTANCE;
    }*/

    private SingleTon() {}

    private static class SingletonHolder {
        public static final SingleTon instance = new SingleTon();
    }

    public static SingleTon getInstance() {
        return SingletonHolder.instance;
    }
}

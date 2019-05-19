package java8;

/*
 * @author: mohit5.kumar
 * @created: 24/04/19
 */
public class Lambda1 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("i am a runnable interface");
            }
        });
        thread.run();

        Thread thread1=new Thread(()->System.out.println("i am a runnable interface from lambda"));
        thread1.run();
    }
}

package MultiThreading;

/*
 * @author: mohit5.kumar
 * @created: 02/05/19
 */
public class PrintEvenOddTwoThreads {
    public static void main(String[] args) throws InterruptedException{
        Thread thread2=new Thread(new ThreadClass(10,false,1),"Odd");
        thread2.sleep(1000);
        Thread thread1=new Thread(new ThreadClass(10,true,2),"Even");
        thread1.start();
        thread2.start();
    }
}

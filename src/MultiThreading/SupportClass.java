package MultiThreading;

/*
 * @author: mohit5.kumar
 * @created: 02/05/19
 */
public class SupportClass {
    private volatile boolean isOdd;

    synchronized void even(int number){
        while (isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }

    synchronized void odd(int number){
        while (!isOdd){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd=false;
        notify();
    }
}

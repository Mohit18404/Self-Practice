package MultiThreading;

/*
 * @author: mohit5.kumar
 * @created: 17/04/19
 */
public class PrintEvenOdd implements Runnable{
    private int max;
    private Printer printer;
    private boolean isEvenNumber;

    int number=0;
    @Override
    public void run() {
        while (number<=max){
            isEvenNumber=number%2==0?true:false;
            if(isEvenNumber) printer.printEven(number);
            else printer.printOdd(number);
        }
        number++;
    }

    PrintEvenOdd(Printer printer,int max, boolean isEvenNumber){
        this.printer=printer;
        this.max=max;
        this.isEvenNumber=isEvenNumber;
    }

    public static void main(String[] args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new PrintEvenOdd(print, 10, false),"Odd");
        Thread t2 = new Thread(new PrintEvenOdd(print, 10, true),"Even");
        t1.start();
        t2.start();
    }
}

class Printer{

    private volatile boolean isOdd;

    synchronized void printEven(int nunmber){
        while (!isOdd){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName()+":"+nunmber);
        isOdd=false;
        notify();
    }
    synchronized void printOdd(int nunmber){
        while (isOdd){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName()+":"+nunmber);
        isOdd=true;
        notify();
    }
}

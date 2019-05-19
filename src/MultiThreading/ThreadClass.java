package MultiThreading;

/*
 * @author: mohit5.kumar
 * @created: 02/05/19
 */
public class ThreadClass implements Runnable{
    int max;
    static SupportClass supportClass=new SupportClass();
    boolean isEvenNumber=false;
    int number;


    public ThreadClass(int max,Boolean isEvenNumber,int number) {
        this.max = max;
        this.isEvenNumber=isEvenNumber;
        this.number=number;
    }

    @Override
    public void run(){
        while (number<=max){
            if(isEvenNumber) supportClass.even(number);
            else supportClass.odd(number);
            number+=2;
        }
    }
}

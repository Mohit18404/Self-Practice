package java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
 * @author: mohit5.kumar
 * @created: 15/04/19
 */
public class ForEach {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

        Iterator<Integer> iterator=myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }

        });

        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        Runnable runnable=new Runnable() {
            @Override
            public void run() {

            }
        };

        mohit mohit=new mohit() {
            @Override
            public void name() {
                System.out.println("name");
            }

            @Override
            public void id() {
                System.out.println("id");
            }
        };
        mohit.id();
        mohit.name();
    }
}

class MyConsumer implements Consumer<Integer>{

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}

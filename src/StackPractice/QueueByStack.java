package StackPractice;

import java.util.Stack;

public class QueueByStack {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    void enqueue(int data){
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());

        stack1.push(data);
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
    }
    int dequeue(){
        if(stack1.isEmpty()) {
            System.out.println("queue is empty");
            System.exit(0);
        }
        int x=stack1.peek();
        stack1.pop();
        return x;
    }
    public static void main(String[] args) {
        QueueByStack queueByStack=new QueueByStack();
        queueByStack.enqueue(10);
        queueByStack.enqueue(20);
        queueByStack.enqueue(30);
        System.out.println(queueByStack.dequeue());
        System.out.println(queueByStack.dequeue());
        queueByStack.enqueue(40);
        queueByStack.enqueue(50);
        queueByStack.enqueue(60);
        queueByStack.enqueue(70);
        queueByStack.enqueue(80);
        System.out.println(queueByStack.dequeue());
        System.out.println(queueByStack.dequeue());
        queueByStack.enqueue(90);
        queueByStack.enqueue(100);





    }
}

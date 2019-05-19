package StackPractice;

import java.util.Stack;

public class StackByQueue2ndMethod {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    void enqueue(int data){
        stack1.push(data);
    }
    int dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                System.out.println("stack is empty");
                System.exit(0);
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int x=stack2.pop();
        return x;
    }
    public static void main(String[] args) {
        StackByQueue2ndMethod stackByQueue2ndMethod=new StackByQueue2ndMethod();
        stackByQueue2ndMethod.enqueue(10);
        stackByQueue2ndMethod.enqueue(20);
        stackByQueue2ndMethod.enqueue(30);
        System.out.println(stackByQueue2ndMethod.dequeue());
        System.out.println(stackByQueue2ndMethod.dequeue());
        stackByQueue2ndMethod.enqueue(40);
        System.out.println(stackByQueue2ndMethod.dequeue());

    }
}

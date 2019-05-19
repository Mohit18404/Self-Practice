package StackPractice;

import java.io.IOException;
import java.util.Stack;

public class QueueUsingStack3rd {
    Stack<Integer> stack=new Stack<Integer>();
    int result=0;
    void enqueue(int data){
        stack.push(data);
    }
    int dequeue(){
        if(stack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }
        if(stack.size()==1){
            int x=stack.pop();
            return x;
        }
        while (!stack.isEmpty()){
            int x=stack.pop();
            result = dequeue();
            stack.push(x);
            return result;
        }
        return result;
    }


    public static void test(){

        try{
            foo();
        }catch (IOException io){
            System.out.println("1");
        }catch (Exception e){
            System.out.println("2");
        }
    }

    public static void foo() throws Exception{
        bar();
    }

    public static void bar() throws Exception{
        throw new IOException();
    }

    public static void main(String[] args) {
        test();
    }
}

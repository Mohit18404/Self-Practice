package StackPractice;

public class StackImplementation {
    int max=5;
    int[] stack=new int[max];
    int top;
    StackImplementation(){
        top=-1;
    }
    boolean push(int data){
        if(top>=(max-1)) {
            System.out.print("Stack overflow");
            return false;
        }
        else {
            stack[++top] = data;
            System.out.println(data +" data is pushed successfully");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stck underflow");
            return 0;
        }
        else {
            int x=stack[top--];
            return x;
        }
    }
    boolean isEmpty(){
        return (top<0);
    }
    public static void main(String[] args) {
        StackImplementation stackImplementation=new StackImplementation();
        stackImplementation.push(5);
        stackImplementation.push(10);
        stackImplementation.push(20);
        stackImplementation.push(30);
        stackImplementation.push(40);
        System.out.println("data has been popped successfully "+stackImplementation.pop());
        if(stackImplementation.isEmpty())
            System.out.println("Given stack is empty");
        else
            System.out.println("Given stack is not empty");
    }
}

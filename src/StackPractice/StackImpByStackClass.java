package StackPractice;

import java.util.Stack;

public class StackImpByStackClass {
    public static void main(String[] args) {
        StackImpByStackClass stackImpByStackClass=new StackImpByStackClass();
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(10);
        stack.push(15);
        stack.push(25);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.search(40));
        System.out.println(stack.search(80));
        System.out.println(stack.search(15));
    }
}

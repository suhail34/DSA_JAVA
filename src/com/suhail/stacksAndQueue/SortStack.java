package com.suhail.stacksAndQueue;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-2);
        stack.push(-4);
        stack.push(5);
        stack.push(0);
        stack.push(-1);

        sortStack(stack);
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    public static void sortStack(Stack<Integer> stack){
        if (stack.empty()) {
            return;
        }
        int num = stack.pop();
        sortStack(stack);
        insertSorted(stack,num);
    }

    public static void insertSorted(Stack<Integer> stack, int num){
        if(stack.empty() || (stack.peek() < num)){
            stack.push(num);
            return;
        }
        int elem = stack.pop();
        insertSorted(stack,num);
        stack.push(elem);
    }

}

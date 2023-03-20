package com.suhail.stacksAndQueue;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverse(stack);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.empty()){
            return;
        }
        int elem=stack.pop();
        reverse(stack);
        insertAtBottom(stack, elem);
    }

    public static void insertAtBottom(Stack<Integer> st, int elem) {
        if(st.empty()){
            st.push(elem);
            return;
        }
        int num = st.pop();
        insertAtBottom(st,elem);
        st.push(num);
    }

}

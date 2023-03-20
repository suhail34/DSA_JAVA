package com.suhail.stacksAndQueue;

import java.util.Stack;

public class DeleteMiddle {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(5);
        st.push(1);
        st.push(4);
        st.push(3);

        midDelete(st,4);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
//        System.out.println(st.pop());

    }

    public static void midDelete(Stack<Integer> st, int size){
        rec(st,0,size);
    }

    public static void rec(Stack<Integer> st, int count, int size){
        if(count == size/2){
            st.pop();
            return;
        }
        int item = st.peek();
        st.pop();
        rec(st,count+1,size);
        st.push(item);
    }

}

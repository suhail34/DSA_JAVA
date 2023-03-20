package com.suhail.stacksAndQueue;

import java.util.Stack;

public class BottomEnter {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(5);
        st.push(2);
        st.push(4);

        solve(st, 13);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }

    public static void solve(Stack<Integer> st, int item){
        if(st.empty()){
            st.push(item);
            return;
        }
//        int num = st.peek();
        int num = st.pop();
//        st.pop();
        solve(st,item);
        st.push(num);
    }
}

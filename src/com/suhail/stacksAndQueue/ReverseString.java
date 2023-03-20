package com.suhail.stacksAndQueue;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "khan";

        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        Stack<Character> st = new Stack<>();

        for(int idx = 0; idx < str.length(); idx++){
            st.push(str.charAt(idx));
        }
        String ans = "";

        while (!st.empty()){
            ans+=st.pop();
        }
        return ans;
    }
}

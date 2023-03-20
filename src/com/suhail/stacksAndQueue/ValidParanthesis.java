package com.suhail.stacksAndQueue;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String expression = "()[{[]}]";

        if(checkValidity(expression)){
            System.out.println("Valid Paranthesis");
        }else {
            System.out.println("Invalid Paranthesis");
        }
    }

    public static boolean checkValidity(String expression){
        Stack<Character> st = new Stack<Character>();

        for(int idx=0; idx<expression.length();idx++){
            if(expression.charAt(idx)=='(' || expression.charAt(idx)=='{' || expression.charAt(idx)=='[') {
                st.push(expression.charAt(idx));
            }else {
                if(st.empty()){
                    return false;
                }
                if(!st.empty()){
                    char ch = st.pop();
//                    st.pop();
                    System.out.println(ch);
                    if((expression.charAt(idx)=='}' && ch=='{') || (expression.charAt(idx)==')' && ch == '(') || (expression.charAt(idx)==']' && ch == '[')){
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }

        if(st.empty()){
            return true;
        }
        return false;
    }

}

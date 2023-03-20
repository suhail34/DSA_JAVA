package com.suhail.stacksAndQueue;

import java.util.Stack;

public class RedundantBraces {
    public static void main(String[] args) {
        String str = "(a)";
        System.out.println(findRedundant(str));
    }

    public static boolean findRedundant(String str){
        Stack<Character> ch = new Stack<>();
        for (int idx = 0; idx < str.length(); idx++) {
            if(str.charAt(idx)=='(' || str.charAt(idx) == '+' || str.charAt(idx) == '-' || str.charAt(idx) == '*' || str.charAt(idx) == '/'){
                ch.push(str.charAt(idx));
            } else {
                if(str.charAt(idx) == ')') {
                    boolean isRedundant = true;
                    while (ch.peek() != '(') {
                        char top = ch.pop();
                        if(top == '+' || top == '-' || top == '*' || top == '/'){
                            isRedundant = false;
                        }
                    }

                    if(isRedundant){
                        return true;
                    }
                    ch.pop();
                }
            }
        }
        return false;
    }

}

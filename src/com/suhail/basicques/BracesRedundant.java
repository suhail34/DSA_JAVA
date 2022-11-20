package com.suhail.basicques;

import java.util.Stack;

public class BracesRedundant {

    public static void main(String[] args) {
        String expr="(a+b)";
        System.out.println(braces(expr));
    }

    public static int braces(String A) {
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<A.length()){
            char c=A.charAt(i);
            if (c=='(' || c=='+' || c=='-' || c=='*'|| c=='/'){
                s.push(c);
            }else if(c==')'){
                if(s.peek()=='(')
                    return 1;
                else{
                    while(!s.empty() && s.peek()!='('){
                        s.pop();
                    }
                    s.pop();
                }
            }
//            System.out.print(s.peek());
            ++i;
        }
        return 0;
    }
}

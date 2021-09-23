package com.suhail;

public class Recursion {
    public static void main(String[] args) {
        int num = 4;
        int nthElem = fibonacci(num);

        System.out.println(nthElem);
    }

    public static int fibonacci(int num) {

        if(num < 2){
            return 1;
        }

        return fibonacci(num-2) + fibonacci(num-1);
    }
}

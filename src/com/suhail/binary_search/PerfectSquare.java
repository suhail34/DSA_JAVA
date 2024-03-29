package com.suhail.binary_search;


public class PerfectSquare {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {

        long start = 1;
        long end = num;

        while(start <= end){
            long mid = start + (end - start)/2;

            if(mid * mid > num){
                end = mid - 1 ;
            } else if(mid * mid < num){
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

}

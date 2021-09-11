package com.suhail;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(rowCompleted(n));
    }

    static int rowCompleted(int n) {
        long start = 0;
        long end = n;

        while(start <= end){
            long mid = start + (end - start)/2;
            long coins = mid * (mid + 1)/2;
            if(coins == n){
                return (int)mid;
            } else if(coins < n){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int)end;
    }
}

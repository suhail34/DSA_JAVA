package com.suhail.basicques;

import java.util.Arrays;

public class SieveOfEras {
    public static void main(String[] args) {
        int n=30;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int num=2; num*num <= n; num++){
            for(int multiple=2*num; multiple<n; multiple+=num){
                isPrime[multiple]=false;
            }
        }
        for(int idx=0; idx<n; idx++){
            System.out.println(idx+" "+isPrime[idx]);
        }
    }
}

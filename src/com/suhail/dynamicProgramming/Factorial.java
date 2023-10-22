package com.suhail.dynamicProgramming;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long[] dp = new long[n+1];
//        Arrays.fill(dp, -1);
        System.out.println(SpaceOptimized(n));
    }

    public static long fact(int num, long[] dp) {
        if(num==0 || num==1) {
            return 1;
        }

        if(dp[num]!=-1){
            return dp[num];
        }

        return dp[num]=num * fact(num-1, dp);
    }

    public static long Tabulation(int num) {
        long[] dp = new long[num+1];
        dp[0]=1;
        dp[1]=1;

        for(int idx=2; idx<num+1; idx++) {
            dp[idx]=idx*dp[idx-1];
        }

        return dp[num];
    }

    public static long SpaceOptimized(int num) {
        long prev=1;

        for(int idx=1; idx<num+1; idx++){
            long curr = idx*prev;
            prev = curr;
        }
        return prev;
    }
}

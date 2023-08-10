package com.suhail.dynamicProgramming;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int num=500;
        long[] dp=new long[num+1];
        Arrays.fill(dp, -1);
        long ans = memoization(num, dp);
        System.out.println(ans);
    }

    private static long memoization(int num, long[] dp){
        if(num<=1){
            return num;
        }
        if(dp[num]!=-1){
            return dp[num];
        }

        return dp[num]=memoization(num-1, dp)+memoization(num-2, dp);
    }
}

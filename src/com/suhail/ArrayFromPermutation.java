package com.suhail;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 4, 1};
        int[] ans = new int[arr.length];

        System.out.println(Arrays.toString(afp(arr, ans)));
    }

    static int[] afp(int[] arr, int[] ans) {
        for (int idx = 0; idx < arr.length - 1; idx++) {
            ans[idx] = arr[arr[idx]];
        }
        return ans;
    }
}
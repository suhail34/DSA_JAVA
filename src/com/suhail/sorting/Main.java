package com.suhail.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= {4, 1, 5, 3, 2};
        System.out.println(Arrays.toString((cyclic(arr))));
    }

    public static int[] bubble(int[] arr) {
        for (int idx1 = 0; idx1 < arr.length; idx1++) {
            for (int idx2 = 1; idx2 < arr.length - idx1; idx2++) {
                if(arr[idx2] < arr[idx2 - 1]) {
                    swap(arr,idx2 - 1, idx2);
                }
            }
        }
        return arr;
    }

    public static int[] selection(int[] arr) {

        for (int idx1 = 0; idx1 < arr.length; idx1++) {
            int max = 0;
            for (int idx2 = 0; idx2 < arr.length - idx1; idx2++) {
                if(arr[max] < arr[idx2]){
                    max = idx2;
                }
            }
            swap(arr, max, arr.length - idx1 - 1);
        }
        return arr;
    }

    static int[] insertion(int[] arr){

        for (int idx1 = 0; idx1 < arr.length - 1; idx1++) {
            for (int idx2 = idx1 + 1; idx2 > 0; idx2--) {
                if(arr[idx2] < arr[idx2 - 1]){
                    swap(arr, idx2 - 1, idx2);
                } else{
                    break;
                }
            }
        }
        return arr;
    }

    static int[] cyclic(int[] arr) {
        for (int idx1 = 0; idx1 < arr.length; ) {
            int correctPos = arr[idx1];
            if(arr[idx1] != arr[correctPos - 1]){
                swap(arr, idx1, correctPos - 1);
            } else {
                idx1++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }


}

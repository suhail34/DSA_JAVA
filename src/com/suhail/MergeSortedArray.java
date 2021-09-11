package com.suhail;

import java.util.Arrays;

class MergeSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 0, 0, 0};
        int[] arr2 = {2, 4, 6};

        merge(arr1,arr1.length, arr2, arr2.length);
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1elem = m - 1;
        int arr2elem = n - 1;
        int idx = nums1.length - 1;

        while(idx > 0 && arr1elem >= 0 && arr2elem >= 0) {
            if(nums1[arr1elem] > nums2[arr2elem]){
                nums1[idx] = nums1[arr1elem];
                idx --;
                arr1elem--;
            } else if(nums1[arr1elem] < nums2[arr2elem]){
                nums1[idx] = nums2[arr2elem];
                idx --;
                arr2elem --;
            }
        }


    }
}
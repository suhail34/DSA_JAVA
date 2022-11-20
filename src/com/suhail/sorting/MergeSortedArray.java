package com.suhail.sorting;

import java.util.Arrays;

class MergeSortedArray {

    public static void main(String[] args) {
        int[] arr = {2,1,0,5,9,3,7,4};
//        int[] arr2 = {2, 4, 6, 9};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int idx1 = 0;
        int idx2 = 0;
        int k = 0;
        int temparr[]=new int[nums1.length+nums2.length];

        while(idx1<nums1.length && idx2<nums2.length) {
            if(nums1[idx1]<nums2[idx2]){
                temparr[k]=nums1[idx1];
                idx1++;
            }else {
                temparr[k]=nums2[idx2];
                idx2++;
            }
            k++;
        }

        while(idx1<nums1.length){
            temparr[k]=nums1[idx1];
            idx1++;
            k++;
        }

        while (idx2<nums2.length){
            temparr[k]=nums2[idx2];
            idx2++;
            k++;
        }
        return temparr;

    }
}
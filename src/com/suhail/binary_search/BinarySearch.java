package com.suhail.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-3, -1, 0, 3, 6, 11, 15, 29};
        int target = -1;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
         int start = 0;
        int end = arr.length - 1;

        if(arr[start] < arr[end])
        {
            while(start <= end){
                int ascmid = start + (end - start)/2;

                if(arr[ascmid] < target){
                    start = ascmid + 1;
                }else if(arr[ascmid] > target){
                    end = ascmid - 1;
                }else {
                    return ascmid;
                }
            }
        }else
        {
            while(start <= end){
                int desmid = start + (end - start)/2;

                if(arr[desmid] < target){
                    end = desmid - 1;
                }else if(arr[desmid] > target){
                    start = desmid + 1;
                }else {
                    return desmid;
                }
            }
        }

        return -1;
    }
}

package com.suhail.binary_search;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 5, 5, 5, 8, 9, 9, 9, 12};
        int target = 9;

        System.out.println(Arrays.toString(position(arr, target)));
    }

    static int[] position(int[] arr, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);

        return ans;
    }

    static int search(int[] arr, int target, boolean StartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else {
                ans = mid;
                if(StartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

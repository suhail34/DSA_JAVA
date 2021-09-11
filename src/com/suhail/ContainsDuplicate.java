package com.suhail;

import java.util.Arrays;

class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {0,4,5,0,3,6};
        System.out.println(containsDuplicate(arr));
        System.out.printf("The %s array is ", "sorted");
        System.out.println(Arrays.toString(arr));
    }

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int idx1 = 0; idx1 < nums.length / 2; idx1++) {
            for (int idx2 = nums.length - 1 - idx1; idx2 > nums.length/2; idx2--) {
                if(nums[idx2] == nums[idx1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
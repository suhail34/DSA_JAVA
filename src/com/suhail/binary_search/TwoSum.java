package com.suhail.binary_search;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 66};
        int target = 8;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = {0, 0};

        for(int idx = 0; idx < numbers.length; idx++){
            int firstnum = numbers[idx];
            int secTarget = target;
            secTarget = target - firstnum;
            ans[0] = idx + 1;
            ans[1] = Secondnum(numbers, secTarget, idx + 1);
            if(ans[1] > 0){
                return ans;
            }
        }
        return ans;
    }

    public static int Secondnum(int[] numbers, int firstnum, int sIndex){
        int start = sIndex;
        int end = numbers.length - 1;

        while(start <= end){
            int ascmid = start + (end - start)/2;

            if(numbers[ascmid] < firstnum){
                start = ascmid + 1;
            }else if(numbers[ascmid] > firstnum){
                end = ascmid - 1;
            }else {
                return ascmid + 1;
            }
        }
        return 0;
    }
}

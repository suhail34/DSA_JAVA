package com.suhail.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,3},6)));
//        twoSum(new int[]{2,7,11,15},9);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {
            map.put(nums[idx], idx);
        }
        System.out.println(map);
        for (int idx = 0; idx < nums.length; idx++) {
            int complement = target - nums[idx];
            if (map.containsKey(complement) && map.get(complement) != idx) {
                return new int[] { idx, map.get(complement) };
            }
        }
        return null;
    }
}

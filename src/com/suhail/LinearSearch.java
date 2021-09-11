package com.suhail;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, -5, 3, 6, 0, 10, 54, 19};
        int target = in.nextInt();

        System.out.println(ls(arr, target));

        char target1 = 'h';
        String name = "Suhail";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(stringls(name, target1));
    }

    static boolean stringls(String name, char target1) {
        if(name.length() == 0){
            return false;
        }

        for(char ch : name.toCharArray()){
            if(ch == target1){
                return true;
            }
        }
        return false;
    }

    static int ls(int[] arr,int target) {
        if(arr.length == 0)
            return -1;

        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == target){
                return idx;
            }
        }
        return -1;
    }
}
